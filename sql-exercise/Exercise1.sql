create database BOOTCAMP_EXERCISE1;
use bootcamp_exercise1;
CREATE TABLE REGIONS (
	REGION_ID INTEGER,
    REGION_NAME VARCHAR(25),
    PRIMARY KEY (REGION_ID)
);
CREATE TABLE COUNTRIES (
	COUNTRY_ID CHAR(2),
    COUNTRY_NAME VARCHAR(40),
    REGION_ID INTEGER,
    PRIMARY KEY(COUNTRY_ID),
	FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID) -- 借人地
);

CREATE TABLE LOCATIONS(
	LOCATION_ID INTEGER PRIMARY KEY,
    STREET_ADDRESS VARCHAR(25),
    POSTAL_CODE VARCHAR(12),
    CITY VARCHAR(30),
    STATE_PROVINCE VARCHAR(12),
    COUNTRY_ID CHAR(2),
	FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
);
Alter table locations
modify STATE_PROVINCE VARCHAR(20);


CREATE TABLE DEPARTMENTS(
	DEPARTMENT_ID INTEGER PRIMARY KEY,
    DEPARMENT_NAME VARCHAR(30),
    MANAGER_ID INTEGER,
    LOCATION_ID INTEGER,
    FOREIGN KEY (LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);
alter table departments rename column deparment_name to department_name;

CREATE TABLE JOBS(
	JOB_ID VARCHAR(10) PRIMARY KEY,
    JOB_TITLE VARCHAR(35),
    MIN_SALARY DECIMAL(10,2),
    MAX_SALARY DECIMAL(10,2)
);
DROP TABLE JOB_HISTORY;
CREATE TABLE JOB_HISTORY(
	EMPLOYEE_ID INTEGER,
	START_DATE DATE,
	END_DATE DATE,
	JOB_ID VARCHAR(10),
	DEPARTMENT_ID INTEGER,
	PRIMARY KEY ( EMPLOYEE_ID,START_DATE),
	FOREIGN KEY (DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
    FOREIGN KEY (JOB_ID) REFERENCES JOBS(JOB_ID)
);
select * from regions;
CREATE TABLE EMPLOYEES(
	EMPLOYEE_ID INTEGER PRIMARY KEY,
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(25),
    EMAIL VARCHAR(25),
    PHONE_NUMBER VARCHAR(20),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(10),
    SALARY DECIMAL (10,2),
    COMMISION_PCT DECIMAL(5,2),
    MANAGER_ID INTEGER,
    DEPARTMENT_ID INTEGER,
    FOREIGN KEY(EMPLOYEE_ID) REFERENCES JOB_HISTORY(EMPLOYEE_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID) -- 無限 to one foreign key(無限) references(one)，, insert data 都要留意
);
SELECT * FROM REGIONS;
insert into regions Values(1,'western eurpoe');
update regions set region_name = 'Europe';
update regions set region_name = 'Americas' where region_id=2;
update regions set region_name= 'Asia Pacific' where region_id=3;
insert into regions values(4,'Middle East/Africa');

select * from countries;
INSERT INTO COUNTRIES VALUES('DE', 'Germany',1);
INSERT INTO COUNTRIES VALUES('IT','Italy',1);
insert into countries values('JP','Japan',3);
insert into countries values('US','United State',2);
delete from countries where COUNTRY_ID ='A' or country_id ='';

select * from locations;
insert into locations values(1000,'1297 Via Cola Di Rie','989','Roma',null,'IT');
insert into locations values(1100,'93091 Calle della Te','10934','Venice',null,'IT');
insert into locations values(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo Prefectu','JP');
insert into locations values(1400,'2014 Jabberwocky Rd','26192','Sothlake','Texas','US');

Select * from Departments;
insert into departments values (10,'Administration',200,1100);
insert into departments  values(20,'Marketing',201,1200);
insert into departments values(30,'Purchasing',202,1400);

select * from jobs;
insert into jobs values('IT_PROG','IT programmer',37.5,1000000);
insert into jobs values('MK_REP','MK_ASSISTANT',100,50000);
insert into jobs values('ST_CLERK','clerk',50,40000);

select * from JOB_HISTORY;
insert into JOB_HISTORY values( 102,'1993-01-13','1998-07-24','IT_PROG',20);
insert into JOB_HISTORY values(101,'1989-09-21','1993-10-27','MK_REP',10);
insert into JOB_HISTORY values (101,'1993-10-28','1997-03-15','MK_REP',30);
insert into JOB_HISTORY values(100,'1996-02-17','1999-12-19','ST_CLERK',30);
insert into JOB_HISTORY values(103,'1998-03-24','1999-12-31','MK_REP',20);

select * from employees;
insert into employees values (100,'Steven','King','SKING','515-1234567','1987-06-17','ST_CLERK',240000,0,109,10);
insert into employees values (101,'Neena','Kochhar','NKOCHHAR','515-1234568','1987-06-18','MK_REP',17000,0,103,20);
insert into employees values (102,'Lex','De Haan','LDEHAAN','515-1234569','1987-06-19','IT_PROG',17000,0,108,30);
insert into employees values (103,'Alexander','Hunold','AHUNHOLD','590-4234567','1987-06-20','MK_REP',9000,0,105,20);
-- insert into employees values(200,'Andy','Lau','andylauemail','852852','1987-06-21','MK_REP',50000,5,

-- 3 Write a query  to find the location_id,street_address,city,state_province,country_name of locations
select * from locations;
select location_id,street_address,city,state_province,
c.country_name
from locations l, countries c
where l.country_id= c.country_id;

-- 4. Write a query to find the first_name,last_name,department ID of all the employees
select first_name,last_name,department_id from employees;

-- 5. Write a query to find the first_name,last_name,job_id,department ID of the employees who works in Japan
select e.first_name,e.last_name,e.JOB_ID 
from employees e, departments d, locations l,countries c 
where e.department_id= d.department_id
and d.location_id=l.location_id 
and l.country_id =C.COUNTRY_ID 
AND c.country_name = 'Japan';


SELECT 
E.FIRST_NAME,
E.LAST_NAME,
E.JOB_ID,
D.DEPARTMENT_id,
C.COUNTRY_ID='jp'
FROM DEPARTMENTS d
LEFT JOIN employees E on D.department_id = E.department_id
LEFT JOIN locations L ON D.LOCATION_ID = L.location_id
LEFT JOIN COUNTRIES C ON L.COUNTRY_ID=C.COUNTRY_ID
;   

-- 6. Write a query to find the employee_id,last_name along with their manager_id and last_name **
select e1.employee_id,e1.last_name,e1.manager_id,e2.last_name from employees e1, employees e2 where e1.manager_id=e2.employee_id;

-- 7. Write a query to find the first_name,last_name and hire date of the employees who was hired after employees 'Lex De Haan'
select * from employees order by hire_date desc;
select first_name,last_name hire_date from employees
where datediff(hire_date,'1987-06-19')>0;
select e1.first_name,e1.last_name,e1.hire_date from employees e1, employees e2
where e2.first_name ='Lex' and e2.last_name='De Haan' and datediff(e1.hire_date,e2.hire_date)>0;

-- 8. Write a query to get the department name and number of employees of each the department.
select d.department_name,count(*) as 'number of employees' 
from departments d,employees e 
where e.department_id=d.department_id 
group by d.department_id;
-- 9. Write a query to find the employee ID,job title,number of days between ending date and starting date for all jobs in department ID 30.
select employee_id,job_title, datediff(jh.end_date,jh.start_date) as 'number of days'
from job_history jh , jobs j
where jh.job_id=j.job_id
and jh.department_id =30;

-- 10. Write a query to display all department name,manager name, city and country name. ***
select d.department_name,Concat(e.First_name,' ',e.last_name) as manager_name, city, country_name as 'Country name'
from departments d, employees e, locations l, countries c
where d.department_id = e.department_id
and l.location_id = d.location_id
and c.country_id = l.country_id
;

-- 11. Write a query to display the average salary of each department.
Select d.department_name,
avg(salary) as 'average salary' from employees e ,departments d where e.department_id=d.department_id
group by d.department_id;

-- 12. Now,we try to perform normalization on table 'jobs'.
--  a. How  do you re-design the table 'jobs'? and adding table 'job_grades'?
Alter table jobs 
add column  GRADE_LEVEL VARCHAR(2);
select * from jobs;
ALTER TABLE JOBS
ADD FOREIGN KEY(GRADE_LEVEL) REFERENCES JOB_GRADES(GRADE_LEVEL);

Create table job_grades(
GRADE_LEVEL varchar(2) PRIMARY KEY,
LOWEST_SAL INTEGER,
HIGHEST_SAL INTEGER
);
SELECT * FROM JOB_GRADES;
