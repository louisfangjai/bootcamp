CREATE TABLE WORKER (
  WORKER_ID INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
  FIRST_NAME CHAR(25),
  LAST_NAME CHAR(25),
  SALARY NUMERIC(15),
  JOINING_DATE DATETIME,
  DEPARTMENT CHAR(25)
);

-- inesrt data to worker
INSERT INTO WORKER 
  (FIRST_NAME, LAST_NAME, SALARY, JOINING_DATE, DEPARTMENT) VALUES
    ('Monika', 'Arora', 100000, '21-02-20 09:00:00', 'HR'),
    ('Niharika', 'Verma', 80000, '21-06-11 09:00:00', 'Admin'),
    ('Vishal', 'Singhal', 300000, '21-02-20 09:00:00', 'HR'),
    ('Mohan', 'Sarah', 300000, '12-03-19 09:00:00', 'Admin'),
    ('Amitabh', 'Singh', 500000, '21-02-20 09:00:00', 'Admin'),
    ('Vivek', 'Bhati', 490000, '21-06-11 09:00:00', 'Admin'),
    ('Vipul', 'Diwan', 200000, '21-06-11 09:00:00', 'Account'),
    ('Satish', 'Kumar', 75000, '21-01-20 09:00:00', 'Account'),
    ('Geetika', 'Chauhan', 90000, '21-04-11 09:00:00', 'Admin');

-- create table bonus
CREATE TABLE BONUS (
  WORKER_REF_ID INTEGER,
  BONUS_AMOUNT NUMERIC(10),
  BONUS_DATE DATETIME,
  FOREIGN KEY (WORKER_REF_ID) REFERENCES Worker(WORKER_ID)
);
-- Task 1 : insert data into table BONUS
-- Vivek, with amount 32000 and bonous date 2021 Nov 02
-- Vivek, with amount 20000 and bonous date 2022 Nov 02
-- Amitabh, with amount 21000 and bonous date 2021 Nov02
-- Geetika, with amount 30000 and bonous date 2021 Nov02
-- Satish, with amount 4500 and bonus date 2022 Nov02
select * from worker;
select worker_ID from worker where first_name='vivek'; -- 6
select worker_ID from worker where first_name='amitabh'; -- 5
select worker_ID from worker where first_name='Geetika'; -- 9
select worker_ID from worker where first_name= 'Satish';-- 8

select * from Bonus;
delete from bonus;
insert into BONUS values(6,32000,'2021-11-02'); -- default 00:00:00
insert into BONUS values(6,20000,'22-11-02'),(5,21000,'21-11-02');
 -- YYYY can be YY,  use',' to seperate
 insert into BONUS values(9,30000,'21-11-02'),
 (8,4500,'22-11-02');
 
 -- Task 2: Write an SQL query to show the second highest salary among all workers.
 select max(salary) from worker;
 select salary from worker order by salary desc;
 select salary as 'Second Highest Salary' from worker order by salary desc limit 1 offset 1;
 select max(salary) as 'Second Highest Salary' from worker 
 where salary< (select max(salary) from worker);
 
 with m as(
 select max(salary) from worker
 )
 select max(salary) as 'Second Highest Salary' from worker.m
 where worker.salary <> m.max(salary);
 
 -- Task 3: Write an SQL query to print the name of employees having the highest salary
 -- in each deparmtnet
 --
 select department,max(salary) as' Highest Salary' from worker group by department; 
 -- select department有無都得
 
 -- Task 4 Write an SQL query to fetch (取回)the list of employees with the same salary.
 -- 
select first_name from worker
where salary = (select salary from worker group by salary having count(*)>1);

 select salary from worker group by salary having count(*)>1;
 -- Approach1
 select concat(first_name,' ',last_name) as Full_Name,
salary as 'Same salary'
from worker
where salary = (
select salary 
from worker
group by salary
having count(*) > 1
);
-- Approach2
with same_salary as (
select salary 
from worker
group by salary
having count(*) > 1
)
select concat(w.first_name,' ', w.last_name) as Full_Name, w.salary as Same_Salary
from worker w, same_salary s
where w.salary = s.salary
;
-- Task5: Write an SQL query to find the worker names with salaries+bonus in 2021
-- 
select * from worker;
select * from bonus;
select count(1) from worker;
select count(1) from bonus;
select * from worker w left join bonus b on w.worker_id =b.worker_ref_id;
select first_name,last_name,(w.salary+b.bonus_amount)as 'Salary+Bonus' from worker w, bonus b
where w.worker_id=b.worker_ref_id 
and year(b.bonus_date)=2021;

select first_name,last_name,(w.salary+coalesce(bonus_amount,0))as 'Salary+Bonus' from worker w inner join bonus b
on w.worker_id=b.worker_ref_id 
where YEAR(b.bonus_date) =2021
;

-- 
SELECT W.FIRST_NAME, W.LAST_NAME, (W.SALARY + COALESCE(B.BONUS_AMOUNT, 0)) AS 'Salary+Bonus'
FROM WORKER W
left JOIN BONUS B ON W.WORKER_ID = B.WORKER_REF_ID
WHERE YEAR(B.BONUS_DATE) =2021 or Year(b.bonus_date) is null;
-- Task 6 (Please complete Task 1-5 first):
-- Your actions : Delete all the records in table WORKER
delete from worker;
-- Question: Study the reason why the data cannot be deleted
-- Foreign Key!

-- Task 7 (Please complete Task6 first):
-- Your action: Drop table WORKER
drop table worker;
-- Question: Study the reason why the table cannot be dropped
 
 
 Create table employee(
 employee_id serial,
 employee_name varchar(20),
 department varchar(10)
 );
 insert into employee (employee_name,department)
 values('Sunny','hr'),('Connie','PR');
 select * from employee;
 insert into employee values(5,'Angus',null);
 insert into employee (employee_name)values('him');
 select * from employee where department ='hr' or department is null;
 select * from employee where department in('hr',null);
 insert into employee values(88,'Louis','CEO');
 insert into employee (department) values ('admin');
 insert into employee values(10,'her','hr');
  insert into employee (employee_name)values('Mark');
 
 
 
 
 
 
 
 
 
 
 
 

