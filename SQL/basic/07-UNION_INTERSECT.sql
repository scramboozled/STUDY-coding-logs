-- UNION,INTERSECTION,MINUS


-- UNION -> Combines the result of two select statements. DUPLICATES will be removed
SELECT * FROM film where rental_duration = 6
union
SELECT * FROM film where "length" < 50;

-- UNION ALL -> Combines the result of two select statements. DUPLICATES will be included
SELECT * FROM film where rental_duration = 6
union all
SELECT * FROM film where "length" < 50;

-- INTERSECT -> pulls out common result in two select statements
SELECT * FROM film where rental_duration = 6
intersect
SELECT * FROM film where "length" < 50;

-- MINUS/EXCEPT -> pulls out the data that is not present in second select statement
SELECT * FROM film where rental_duration = 6
except
SELECT * FROM film where "length" < 50;

-- ALL will include the duplicates in union,intersect and except
(select 1
union all
select 2
union all
select 1)
except all
select 2;