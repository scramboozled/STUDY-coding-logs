-- Grouping Sets creates groupings of all different groups on given set

SELECT 
STAFF_ID,
TO_CHAR(PAYMENT_DATE, 'Month') AS Month,
SUM(AMOUNT)
FROM PAYMENT
GROUP BY 
	GROUPING SETS((STAFF_ID, Month),(Month),(Staff_id));

--Rollup is defined grouping set which aggregate pulls down on LEFT->RIGHT hierarchy

SELECT
'Q'||TO_CHAR(PAYMENT_DATE,'Q') AS QUARTER,
EXTRACT(MONTH from PAYMENT_DATE) AS MON,
DATE(PAYMENT_DATE),
SUM(AMOUNT)
FROM PAYMENT
GROUP BY 
	ROLLUP (1,2,3)
ORDER BY 1,2,3;

--Rollup is defined grouping set which aggregate pulls all the possible groups
SELECT
'Q'||TO_CHAR(PAYMENT_DATE,'Q') AS QUARTER,
EXTRACT(MONTH from PAYMENT_DATE) AS MON,
DATE(PAYMENT_DATE),
SUM(AMOUNT)
FROM PAYMENT
GROUP BY 
	CUBE (1,2,3)
ORDER BY 1,2,3;