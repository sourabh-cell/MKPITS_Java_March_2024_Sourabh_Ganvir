#Assignment 2 Aggregate function
use sakila

#1.Find the total number of films in the database.
select count(film_id) from film

#2.Find the average rental rate of all films
select avg(rental_rate) from film

#3Find the total number of rentals made
select count(rental_id) from rental

#4Find the highest replacement cost of any film
select max(replacement_cost) from film

#5.Find the total revenue generated from rentals
select sum(rental_rate) from film

#6Find the average length of films
select avg(length) from film

#7Find the minimum rental duration among all films
select min(rental_duration) from film

#8Find the total number of distinct customer IDs in the rental table.
select count(distinct customer_id) from rental

#9Find the average payment amount made by customers.
select avg(amount) from payment

#10Find the total number of inventory items available.
select count(distinct inventory_id) from inventory

#11Find the total number of distinct films rented
select count(distinct title) from film

#12Find the highest payment amount made by any customer
select max(amount) from payment

#13Find the average length of films that have a rating of 'PG'
select avg(length) from film where rating='pg'


#14Find the total number of payments made in May 2005
select count(payment_id) from payment where payment_date between '2005-05-01 00:00:00' AND '2005-05-31 23:59:59'

#15Find the total number of films with a rental duration of 7 days.
select count(film_id) from film where rental_duration=7

#16Find the average replacement cost of films with a rental rate of 2.99.
select avg(replacement_cost) from film where rental_rate=2.99