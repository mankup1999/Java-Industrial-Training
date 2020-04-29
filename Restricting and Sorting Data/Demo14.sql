select last_name,jobs.job_title,salary
from employees,jobs
where employees.job_id=jobs.job_id
and jobs.job_title in ('Sales Representative','Stock Clerk')
and salary not in (2500,3500,7000);
