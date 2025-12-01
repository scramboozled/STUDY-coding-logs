-- Transactions and Stored Procedures

-- One unit of work, queries that needs to be run together 
-- and at failure, should be reverted to old state


CREATE TABLE acc_balance (
    id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
	last_name TEXT NOT NULL,
    amount DEC(9,2) NOT NULL    
);

INSERT INTO acc_balance
VALUES 
(1,'Tim','Brown',2500),
(2,'Sandra','Miller',1600);

SELECT * FROM acc_balance;

-- Transaction
-- in the middle of transaction current query session will update on the go
-- when queried same in the different session, you should be seeing the old state
-- committing the transaction will let the other session see the change, 
-- if not commited the change will be rolled back to old stage
BEGIN;
UPDATE acc_balance SET AMOUNT = AMOUNT - 100 WHERE ID = 1;
UPDATE acc_balance SET AMOUNT = AMOUNT + 100 WHERE ID = 2;
COMMIT;

-- Rollbacks are used to revert the transaction to old state
-- Rollbacks can be reverted to a certain point in transaction called SAVE POINT
-- Rollback will end the transaction, rollback to save point will not end the transaction

BEGIN;
UPDATE acc_balance SET AMOUNT = AMOUNT - 100 WHERE ID = 1;
SAVEPOINT POINT1;
UPDATE acc_balance SET AMOUNT = AMOUNT + 100 WHERE ID = 2;
ROLLBACK TO SAVEPOINT POINT1;
ROLLBACK;
COMMIT;

;

-- Stored Procedures are user defind functions
-- Normal user defined function won't be able to run transaction, so we use Stored procedures
CREATE OR REPLACE PROCEDURE SP_TRANSFER(tr_amount INT, sender INT, receiver INT)
LANGUAGE plpgsql
AS $$
BEGIN
UPDATE acc_balance 
SET amount = amount - tr_amount 
WHERE id = sender;

UPDATE acc_balance 
SET amount = amount + tr_amount 
WHERE id = receiver;

END;
$$;

CALL SP_TRANSFER(500,1,2);



