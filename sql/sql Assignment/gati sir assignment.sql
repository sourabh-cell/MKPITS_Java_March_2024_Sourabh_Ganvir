use lorddatabase
show tables

# student 5th rank
select roll_no,avg(total)/3 as average from
(select roll_no,sum(phy+chem+maths) as total from Markdetails group by roll_no) 
as a group by roll_no order by average desc limit 1 offset 3

# student from 2nd to 5th rank
select roll_no,avg(total)/3 as average from
(select roll_no,sum(phy+chem+maths) as total from Markdetails group by roll_no) 
as a group by roll_no limit 2 offset 1



