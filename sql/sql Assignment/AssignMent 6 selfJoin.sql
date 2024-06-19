# Assignment 6 Self joins

#Problem Statement 1: Identify Films with Similar Titles
#Retrieve pairs of film titles that have a similar title structure (e.g., differing by one character or having a common substring).

select a.title as title1,b.title as title2 ,a.film_id as Id1,b.film_id as Id2 from 
film a,film b 
where a.film_id<>b.film_id and a.title=b.title

#Problem Statement 2: Identify Customers Who Share the Same Address
#Retrieve pairs of customer names who share the same address.
select a.first_name,b.first_name from customer a ,customer b
where a.customer_id<>b.customer_id and a.address_id=b.address_id
group by a.first_name

