#assignment 9

#1. Find customers who rented a specific film:
#Retrieve the names of customers who rented the film with the title 'Inception'.
SELECT c.first_name, c.last_name
FROM customer c
WHERE c.customer_id IN 
(SELECT r.customer_id FROM rental r WHERE r.inventory_id IN 
(SELECT i.inventory_id FROM inventory i WHERE i.film_id = 
(SELECT f.film_id FROM film f WHERE f.title = 'AFRICAN EGG')))

#2. Find films rented by a specific customer:
#Retrieve the titles of films rented by a customer with a given customer_id.
SELECT f.title
FROM film f
WHERE f.film_id IN 
(SELECT i.film_id FROM inventory i WHERE i.inventory_id IN 
(SELECT r.inventory_id FROM rental r WHERE r.customer_id = 100))

#3. Find rental details for the most recent rental:
#Retrieve the rental details for the most recent rental transaction in the database.
SELECT 
    r.rental_id,
    r.rental_date,
    r.inventory_id,
    r.customer_id,
    r.return_date,
    r.staff_id
FROM 
    rental r
ORDER BY 
    r.rental_date DESC
    
#4  Find the average rental duration compared to the overall average:
#Compare the average rental duration of films in a specific category with the overall average rental duration.
   
select cat.category_id,cat.name,AVG(f.rental_duration) as average, IF(AVG(f.rental_duration)>
(select avg(rental_duration) from film), "MORE", "LESS") as comparison_with_other from category cat join
film_category fc on cat.category_id=fc.category_id join
film f on fc.film_id=f.film_id group by cat.category_id;
 
#5Find films with rental counts above average:
#Retrieve films with rental counts greater than the average number of rentals across all films.
# Count film wise rental
# Display films whose rental count is > avg rental count

SELECT F.TITLE,F.FILM_ID , COUNT(R.RENTAL_ID) AS COUNTRENT FROM FILM F JOIN
INVENTORY I ON F.FILM_ID=I.FILM_ID JOIN RENTAL R ON
I.INVENTORY_ID=R.INVENTORY_ID
GROUP BY F.FILM_ID,F.TITLE
having COUNTRENT> (select avg(rcount) from (select count(rental_id) as a from rental))

#6. Find customers who rented the same film as another customer:
#Identify customers who rented the same film as a specific customer (based on customer_id).
select c.customer_id,c.first_name,f.title from customer c join 
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
film f on i.film_id=f.film_id where f.title =
any (select f.title from film f join
inventory i on f.film_id=i.film_id join
rental r on i.inventory_id=r.inventory_id join
customer c on r.customer_id=c.customer_id where c.customer_id=100 )

#7. Find customers who have rented from both stores:
#Identify customers who have rented films from both store_id 1 and store_id 2.

select c.customer_id,c.first_name,c.last_name,s.store_id from customer c join
rental r on c.customer_id=r.customer_id join
inventory i on r.inventory_id=i.inventory_id join
store s on i.store_id=s.store_id where s.store_id=all
(select store_id from store)

#8 Find actors who have appeared in the same film:
#Retrieve actors who have appeared in the same film as a specific actor (based on actor_id)

select a.actor_id,a.first_name,f.title as act_in_film from actor a join
film_actor fa on a.actor_id = fa.actor_id join
film f on fa.film_id = f.film_id where f.film_id in 
(select f.film_id from film f join film_actor fa
on f.film_id = fa.film_id join actor a on fa.actor_id=a.actor_id 
where a.actor_id=4)

#9Find films rented by top-revenue customers:
#Retrieve film titles rented by customers who are among the top 10 in terms of total rental revenue.
select f.title,sum(p.amount) from film f join
inventory i on f.film_id=i.film_id join rental r
on i.inventory_id = r.inventory_id join customer c
on r.customer_id=c.customer_id join payment p
c.customer_id=p.customer_id
group by f.title
having  sum(p.amount) in
(select sum(p.amount) from payment p join
customer c on p.customer_id=c.customer_id group by c.customer_id) order by total desc limit 10;



#10. Find films that have not been rented:
#Retrieve titles of films that have not been rented by any customer.
SELECT F.TITLE FROM FILM F WHERE  F.FILM_ID  IN (SELECT I.FILM_ID FROM INVENTORY I WHERE I.INVENTORY_ID NOT IN (SELECT R.INVENTORY_ID FROM RENTAL R))
