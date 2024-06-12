# creating Database
create database LordDatabase

#Use Database
use LordDatabase

#create table Student with fields
create table studentdetails (roll_no char(4),Name char(10),Address varchar(20),city char(10))


#inserting table into Studentdetails
insert into studentdetails values('101','Sourabh','Smruti nagar','Nagpur')

insert into studentdetails values('105','aniket','raut nagar','chandrapur')

insert into studentdetails (roll_no,Name,city)values('102','Nikhil','Wardha')

#Create table Mark Details
create table markdetails (roll_no char(4),phy int,chem int,maths int)

#insert details in markdetails
insert into markdetails values('105',53,89,66)

select * from studentdetails

UPDATE studentdetails
SET name = 'deepak', city = 'Butibori',roll_no ='106'
WHERE Address='Smruti nagar'