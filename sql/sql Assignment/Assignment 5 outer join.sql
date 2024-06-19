#Assignment 5 outer join


#Problem Statement 1: Retrieve Customer Information with Rental History
#Retrieve the customer's first name, last name, and the number of rentals they have made. Include customers who have not made any rentals as well.

select c.first_name ,c.last_name,count(r.rental_id) from customer c
left join rental r on c.customer_id= r.customer_id
group by c.first_name
order by count(r.rental_id)




#2.Problem Statement 2: Display Films and Their Rental Count
#Display film titles along with the number of times each film has been rented. Include films that have not been rented at all.

select f.title,count(r.rental_id) as totalRental from film f left join
inventory i on f.film_id=i.film_id left join
rental r on i.inventory_id=r.inventory_id
group by f.film_id
order by  totalRental



#Problem Statement 3: List Customers and Their Rentals
#List customers with their rental details (rental ID, rental date, and return date if available). Include customers who have not made any rentals.

select c.first_name ,c.last_name,r.rental_id,r.rental_date,r.return_date from customer c
left join rental r on c.customer_id= r.customer_id
group by c.first_name
order by count(r.rental_id)


#4Problem Statement 4: Show Films and Customers Who Rented Them
#Display film titles and the names of customers who have rented each film. Include films that have not been rented.

select f.title , c.first_name,c.last_name from film f left join
inventory i on f.film_id=i.film_id left join
rental r on i.inventory_id=r.inventory_id left join
customer c on r.customer_id=c.customer_id
group by f.title
order by f.title

#5Problem Statement 5: Explore Rental Returns and Late Fees
#Retrieve rental ID, return date, and any associated late fees. Include rentals that have not been returned yet, displaying a NULL return date for these rentals.
select rental_id,return_date from rental;


#6Problem Statement 1: Retrieve Films and Rental Details
#Retrieve film titles and rental details (rental ID, rental date, and return date if available). Include films that have not been rented.

select f.title,r.rental_id, r.rental_date,r.return_date 
from film f left join
inventory i on f.film_id=i.film_id left join
rental r on i.inventory_id=r.inventory_id
group by r.rental_id
order by f.film_id



#7Problem Statement: Display Rentals and Associated Customers
#Display rental details (rental ID, rental date, and return date if available) along with the names of customers who made those rentals. Include rentals that have not been rented.

select r.rental_id, r.rental_date,r.return_date,c.first_name,c.last_name from
rental r  left join
customer c on r.customer_id=c.customer_id
group by c.first_name,c.last_name
order by r.rental_id  



#8 Problem Statement: List Payments with Customer Information
#List payment details (payment ID, amount, and payment date) along with the names of customers who made those payments. Include payments that have not been made.

select p.payment_ID, p.amount, p.payment_date,c.first_name,c.last_name from
payment p left join  customer c on p.customer_id=c.customer_id
group by p.payment_id
order by p.payment_id 




#9Problem Statement: Show Actors and Films They Acted In
#Display actor names and the titles of films they have acted in. Include actors who have not acted in any films.

select  a.first_name,a.last_name,f.title from actor a left join
film_actor fa on a.actor_id=fa.actor_id left join 
film f on fa.film_id = f.film_id
group by a.first_name,a.last_name
order by  a.first_name




#10 Problem Statement : Explore Staff and Their Associated Stores
#Retrieve staff details (staff ID, first name, last name) and the store they are associated with. Include staff who are not associated with any store.

select s.staff_id,s.first_name,s.last_name,st.store_id from staff s
left join store st on s.store_id = st.store_id
group by s.staff_id
order by s.staff_id

