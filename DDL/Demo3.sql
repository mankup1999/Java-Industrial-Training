create table emp
(
id number(7) primary key,
last_name varchar2(25) not null, 
first_name varchar2(25),
dept_id number(7),
constraint fk_dept foreign key(dept_id) references dept(dept_id)
);

insert into emp values
(101,'Sam','Sundar',10);
insert into emp values
(101,'Ram','Krishna',20);
insert into emp values
(102,'Gopi',null,40);
insert into emp values
(103,null,'ram',20);

select * from emp;