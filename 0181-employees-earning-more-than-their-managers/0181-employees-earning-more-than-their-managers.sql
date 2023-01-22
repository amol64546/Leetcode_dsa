# Write your MySQL query statement below

SELECT e.name Employee from Employee e
inner join Employee m
on e.managerId = m.Id
where e.salary>m.salary;