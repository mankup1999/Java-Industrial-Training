Create table MY_EMPLOYEE 
as
Select employee_id,first_name,last_name,department_id,salary from EMPLOYEES where 1=2;

desc my_employee;

insert into my_employee values
(201,'Michael','Hartstein',20,13000);

insert into my_employee values
(202,'Pat','Fay',20,null);

insert into my_employee(employee_id,first_name,last_name,department_id,salary) values
(203,'Susan','Mavris',40,null);

insert into my_employee values
(205,'Shelley', 'Higgins',110,12000);
insert into my_employee values
(100,'Steven','King',90,24000);
insert into my_employee values
(101,'Neena','Kochhar',90,17000);
insert into my_employee values
(102,'Lex De','Haan',90,17000);
insert into my_employee values
(111,'Ismael','Sciarra',100,7700);
insert into my_employee values
(112,'Jose Manuel','Urman',100,7800);
insert into my_employee values
(204,'Hermann','Baer',70,10000);

select * from my_employee;
