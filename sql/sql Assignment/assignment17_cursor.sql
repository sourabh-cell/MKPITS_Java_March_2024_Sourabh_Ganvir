#assignment 17 Cursor


#Problem Statement 1: Retrieve Customer Names and Addresses
#Create a cursor to retrieve the names and addresses of all customers from the Sakila database.

DELIMITER $$
create procedure retrieve_cname_cadd()
begin
declare cname char(50);
declare cadd char(50);
declare done int default 0;

 -- declare cursor
 declare cust_name_add cursor for select c.first_name , a.address from customer c
 join address a on c.address_id=a.address_id;

-- Declare a NOT FOUND handler to set done to TRUE
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
 -- open cursor
 open cust_name_add;
 
 read_loop:loop
		fetch cust_name_add into cname,cadd;
       
        if done then
        leave read_loop;
        end if;
       
        select concat('NAME:',cname,'Address:',cadd) as actor_info;
        
 end loop;
 
 -- closing cursor
 close cust_name_add;
 
 end $$
 delimiter;
    
    
call retrieve_cname_cadd 
--- ----------------------------------------------------------------------------------------------------------------    

Problem Statement 2: Calculate Total Rental Fees for a Customer
Create a cursor to calculate the total rental fees paid by a specific customer in the Sakila database.

DELIMITER $$
create procedure retrieve_cust_amount()
begin
declare cname char(50);
declare camount char(50);
declare cid char(10);
declare done int default 0;

 -- declare cursor
 declare cust_total_amount cursor for select c.customer_id ,c.first_name , sum(p.amount) from customer c
 join payment p on c.customer_id=p.customer_id group by c.customer_id;

-- Declare a NOT FOUND handler to set done to TRUE
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
 -- open cursor
 open cust_total_amount;
 
 read_loop:loop
		fetch cust_total_amount into cid,cname,camount;
       
        if done then
        leave read_loop;
        end if;
       
        select concat('Id: ',cid,' ','Name: ',cname,' ','Amount: ',camount) as actor_info;
        
 end loop;
 
 -- closing cursor
 close cust_total_amount;
 
 end $$
 delimiter;
 
 call retrieve_cust_amount 

Problem Statement 3: Retrieve Film Information by Category
Create a cursor to retrieve film details for a specific film category from the Sakila database.

DELIMITER $$
create procedure retrieve_film_Details(in cat char(30))
begin
declare ftitle char(50);
declare descr varchar(1500);
declare cat char(50);
declare done int default 0;

 -- declare cursor
 declare film_details cursor for select f.title,f.description,cat.name from film f
 join film_category fc on f.film_id=fc.film_id join category cat 
 on fc.category_id=cat.category_id
 group by cat.name;

-- Declare a NOT FOUND handler to set done to TRUE
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = 1;
    
 -- open cursor
 open film_details;
 
 read_loop:loop
		fetch from film_details into ftitle,descr,cat;
       
        if done then
        leave read_loop;
        end if;
       
        select concat('Name: ',ftitle,' ','Desription: ',descr,' ','Category: ',cat) as film_info;
        
 end loop;
 
 -- closing cursor
 close film_details;
 
 end $$


call retrieve_film_Details('Action')

Problem Statement 4: Calculate Average Film Rental Duration
Create a cursor to calculate the average rental duration for all films in the Sakila database.

delimiter $$
create procedure avg_rental_rate()
begin
declare fname char(50);
declare avg_dur int;
declare i int default 0;

declare avg_rental_cursor cursor for select title , avg(rental_duration) from 
film group by title;

DECLARE CONTINUE HANDLER FOR NOT FOUND SET i = 1;

open  avg_rental_cursor;

 read_loop:loop
		fetch from avg_rental_cursor into fname,avg_dur;
       
        if i then
        leave read_loop;
        end if;
       
        select concat('Name: ',fname,' ','Average Duration: ',avg_dur) as film_info;
        
 end loop;
 
 -- closing cursor
 close avg_rental_cursor;
 
 end $$
 
 call avg_rental_rate


