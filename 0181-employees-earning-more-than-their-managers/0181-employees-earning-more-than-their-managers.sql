# Write your MySQL query statement below

SELECT e.name Employee from Employee e
inner join Employee m
on e.managerId = m.Id
AND e.salary>m.salary;