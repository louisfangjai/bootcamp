CREATE TABLE TEACHER(
  id INTEGER NOT NULL AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  age NUMERIC(3) NOT NULL, --NUMERIC(3) means INTEGER // sql comment is --
  nationality VARCHAR(2) NOT NULL,
  membership VARCHAR(1) NOT NULL
);




-- lettCode:1321
-- Approach 2   
with 
  day_avg as (
    select distinct c1.visited_on, c2.visited_on as dummy, c2.amount
    from customer c1, customer c2
    where datediff(c1.visited_on, c2.visited_on) between 0 and 6
  )
select visited_on, 
sum(amount) as amount, 
round(sum(amount) / 7, 2) as average_amount
from day_avg
group by visited_on having count(visited_on) > 6
;

--要distinct左出黎先再groupby