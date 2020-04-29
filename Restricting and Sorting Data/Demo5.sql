SELECT last_name,department_id
FROM employees
WHERE department_id in (10,20)
ORDER BY last_name;