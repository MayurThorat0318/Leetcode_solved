select p.project_id, round(avg(cast(e.experience_years as float)), 2) as average_years from project p
left join employee e on p.employee_id = e.employee_id
group by p.project_id order by project_id