#1. **Retrieve all films with a rental duration of more than 5 days:**
select * from film where rental_duration>5

#2. **List all customers who live in the city of 'San Diego':**
select * from customers where city='San Diego' 

#3. **Find all films with a rating of 'PG-13' and sort them by title:**
select * from film where rating='pg-13' order by title

#4. **Display all actors whose last name starts with 'A' and order by first name:**
select * from actor where last_name like 'a%' order by first_name

#5. **Retrieve all films released in the year 2006:**
select * from film where release_year='2006'

#6. **Find all customers whose first name is 'John' and sort by last name in descending order:**
select * from customer where first_name='john' order by last_name desc

#7**List all films with a rental rate between 2.99 and 4.99, inclusive:**
select * from film where rental_rate between 2.99 and 4.99

#8Retrieve all actors with a last name containing 'son' and order by last name:**
select * from actor where last_name like '%son%' order by last_name

#9. **Find all stores in city 'jaipur' and sort by store ID:**
select store_id from store where address_id in (select address_id from address where city_id in(select city_id from city where city='jakatra') )

#10**Display all films with a replacement cost greater than 20 and sort by replacement cost in ascending order:**
select * from film where replacement_cost>20 order by replacement_cost

#11. **List all films with a length greater than 120 minutes:**
select * from film where length>120

#12. **Find all customers who have an active status (status = 1):**
select * from customer where active='1'

#13. **Retrieve all films with a rental rate of 0.99 and sort them by length in descending order:**
select * from film where rental_rate = '0.99' order by length

#14. **Display all actors with a first name containing 'Tom' and order by last name:**
select * from actor where first_name ='tom' order by last_name

# 15**Find all films with a replacement cost less than 15 and sort them by title:**'
select * from film where replacement_cost > 15 order by title

#16. **List all customers with a last name ending with 'son':**
select * from actor where last_name like '%son'

#17. **Retrieve all films with a rating of 'R' and sort them by rental duration:**
select * from film where rating='r' order by rental_duration

#18. **Find all actors with a last name exactly equal to 'Smith' and order by first name:**
select * from actor where last_name='smith' order by first_name

#19. **Display all films with a rental duration of exactly 7 days and sort by replacement cost:**
select * from film where rental_duration='7' order by replacement_cost

#20. **List all customers with a first name starting with 'A' and order by last name in ascending order:**
select * from customer where first_name like 'a%' order by last_name

#21. **Retrieve all films with a rental duration between 3 and 7 days and a rental rate greater than 2.99:**
select * from film where rental_duration between 3 and 7 and rental_rate>2.99

#22. **List all customers who live in 'jaipur' or 'jakarta':**
select * from customer where address_id in(select address_id from address where city_id in(select city_id from city where city='jaipur' or city='jakarta' ) )



#23. **Find all films with a rating of 'PG' or 'G' and a length less than 90 minutes:** %%%%%%%
select * from film where (rating = 'pg' or rating='g') and length < 90

#24. **Display all actors with a first name containing 'Sam' or a last name starting with 'B':**
select * from actor where first_name like '%sam%' or last_name like 'b%'

#25. **Retrieve all films with a replacement cost between 15 and 25 and sort them by title:**
select * from film where replacement_cost between 15 and 25 order by title

#26. **Find all customers who have rented a film in the last month and have an active status (status = 1):**
select * from customer where active=1 and where rental_date-  



#27. **List all films with a rental rate of 4.99, 3.99, or 2.99:**
select * from film where rental_rate in(4.99,3.99,2.99)

#28. **Retrieve all actors with a first name starting with 'M' and a last name ending with 'y':**
select * from actor where first_name like 'm%' and  last_name like '%y'

#29. **Find all films released in the years 2005, 2006, or 2007 and sort them by release year:**
select * from film where release_year in(2005,2006,2007) order by release_year 

#30. **Display all customers with a first name of 'Emily' or a last name containing 'Lee':**
select * from customer where first_name = 'Emily' or last_name like '%Lee%'

