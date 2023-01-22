# Write your MySQL query statement below

# SELECT e.name employee from Employee e
# inner join employee m
# on e.managerId = m.Id
# where e.salary>m.salary;

SELECT e.name employee from Employee e, employee m
where e.managerId = m.Id
        and e.salary>m.salary;