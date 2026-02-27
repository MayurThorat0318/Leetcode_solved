# Write your MySQL query statement below
select department,Employee,Salary
from(
    select d.name as Department,e.name as Employee,e.salary as salary,
    dense_rank() over (partition by e.departmentId order by e.salary desc)as rnk
    from Employee e
    join Department d
    on e.departmentId = d.id
)t
where rnk <= 3 ;