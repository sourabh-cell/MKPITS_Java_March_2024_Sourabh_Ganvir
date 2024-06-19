#Assignment 4 Joins
#1.Retrieve the names of all customers and the titles of the films they have rented.
select c.first_name ,f.title 
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id order by f.title


#2.Display the rental date and return date for each rental along with the customer's first name and last name.
select c.first_name,c.last_name,r.rental_date,r.return_date ,
datediff(return_date,rental_date) as 'No. of days'
from customer c join rental r 
on c.customer_id=r.rental_id

#3.List the names of actors who have appeared in the film titled "Chamber Italian".
select a.first_name,f.title from actor a 
join film_actor fa on a.actor_id=fa.actor_id
join film f on fa.film_id=f.film_id where f.title='chamber italian'

#4Get the titles of all films rented by the customer named "William Brown
select c.first_name,f.title from film f
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
join customer c on r.customer_id=c.customer_id
where c.first_name='William'

#5.Retrieve the film titles rented by the customer with customer_id 100.
select f.title ,c.customer_id
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where c.customer_id=100

#6List the film titles and rental dates for all rentals made by the customer with customer_id 200.
select f.title ,r.rental_date
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where c.customer_id=100

#7Display the film titles and rental durations for all rentals made on May 15, 2005
select f.title ,f.rental_duration 
from film f 
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
where r.rental_date like'2005-05%';

#8List the names of customers who have rented the film titled "Alien Center".
select c.first_name,f.title 
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where f.title like '%Alien Center%'

#9Display the first name, last name, and email of customers who have rented the film titled "Flight Lies".
select c.first_name,c.last_name,c.email,f.title
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where f.title like 'Flight Lies%'

#10Retrieve the rental date and rental duration for each rental made by customer "Linda Williams".
select r.rental_date ,f.rental_duration,c.first_name 
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where c.first_name='linda'

#11List the film titles and rental dates for all rentals made by customer "Mary Johnson".
select f.title, r.rental_date,c.first_name,c.last_name
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where c.last_name='Johnson'

#12Display the film titles rented by the customer with customer_id 300.
select f.title ,c.customer_id
from customer c  join  rental r 
on c.customer_id=r.customer_id
join inventory i 
on r.inventory_id=i.inventory_id
join film f
on i.film_id=f.film_id where c.customer_id=300

#13Get the names of all customers who have rented more than 5 films.
select c.first_name,c.last_name from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id having count(f.title) > 5

#14List the film titles and rental dates for all rentals made by the customer with customer_id 400
select f.title,r.rental_date from film f
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
join customer c on r.customer_id=c.customer_id
where c.customer_id=400 

#15 Retrieve the rental date and return date for each rental made by customer "Richard Davis".
select r.rental_date,r.return_date,c.first_name,c.last_name
from rental r join inventory i on i.inventory_id=r.inventory_id
join customer c on r.customer_id=c.customer_id where c.first_name='Richard' and c.last_name='Davis'

#16Display the first name, last name, and email of customers who have rented the film titled "Dinosaur Secretary
select c.first_name,c.last_name,f.title from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where f.title='Dinosaur Secretary'

#17List the names of customers who have rented the film titled "Silence Kane
select c.first_name,f.title from customer c
join rental r on r.customer_id = c.customer_id
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where f.title='Silence Kane'

#18Get the film titles and rental dates for all rentals made on August 10, 2005.
select f.title,r.rental_date from rental r
join inventory i on i.inventory_id = r.inventory_id
join film f on f.film_id = i.film_id where r.rental_date= '2005-08-10'

#19Retrieve the film titles rented by the customer with customer_id 500.
select f.title,c.customer_id from film f
join inventory i on f.film_id=i.film_id
join rental r on i.inventory_id=r.inventory_id
join customer c on r.customer_id=c.customer_id
where c.customer_id=500 


#20Display the rental date and rental duration for each rental made by customer "Karen Smith
select r.rental_date, c.rental_duration,c.first_name from
rental r join inventory i on i.inventory_id=r.inventory_id
join customer c on r.customer_id=c.customer_id where c.first_name='Kare'