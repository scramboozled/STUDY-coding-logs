-- JOINS
-- combining multiple table to retrieve data

-- INNER JOIN -> join and pull common records in both the tables based on reference
-- This condition will only pull data if the reference record is present in both the tables
SELECT PAYMENT_ID,CUSTOMER.CUSTOMER_ID, FIRST_NAME, LAST_NAME, AMOUNT FROM
PAYMENT
INNER JOIN CUSTOMER
ON PAYMENT.CUSTOMER_ID = CUSTOMER.CUSTOMER_ID -- reference
WHERE CUSTOMER.CUSTOMER_ID = 269;

-- OUTER JOIN -> join and pull all the records in both the tables based on reference. Non referenced records will be NULL
-- This condition will pull all the data if the reference record is present in either of the tables

SELECT * FROM BOARDING_PASSES B
FULL OUTER JOIN TICKETS T
ON B.TICKET_NO = T.TICKET_NO
WHERE B.TICKET_NO IS NULL;

-- LEFT JOIN -> join and pull all the records in left tables based on reference. Non referenced records will be NULL
-- This condition will pull all the data if the reference record is present in the left tables

SELECT * FROM AIRCRAFTS_DATA A
LEFT JOIN FLIGHTS F
ON A.AIRCRAFT_CODE = F.AIRCRAFT_CODE
WHERE F.AIRCRAFT_CODE IS NULL;


-- RIGHT JOIN -> join and pull all the records in right tables based on reference. Non referenced records will be NULL
-- This condition will pull all the data if the reference record is present in the RIGHT tables

SELECT * FROM FLIGHTS F
RIGHT JOIN  AIRCRAFTS_DATA A
ON A.AIRCRAFT_CODE = F.AIRCRAFT_CODE
WHERE F.AIRCRAFT_CODE IS NULL;


-- There can be multiple column for referecing between two tables
SELECT SEAT_NO, ROUND(AVG(AMOUNT),2) FROM BOARDING_PASSES B
LEFT JOIN TICKET_FLIGHTS T
ON B.TICKET_NO = T.TICKET_NO
AND B.FLIGHT_ID = T.FLIGHT_ID
GROUP BY 1
ORDER BY 2 DESC;

-- We can join multiple tables as well in a single pull
SELECT S.FARE_CONDITIONS, COUNT(*) FROM   BOARDING_PASSES B
INNER JOIN FLIGHTS F
ON B.FLIGHT_ID = F.FLIGHT_ID
INNER JOIN 
ON  S.AIRCRAFT_CODE = F.AIRCRAFT_CODE
GROUP BY 1 SEATS S
ORDER BY 2 DESC;

