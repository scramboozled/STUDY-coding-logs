-- Indexes creates an internal lookup table for DBMS to make read easy, writing is slower when indexed
-- and utilizes additional storage that could negligble
-- usually used on most frequently used filters and conditional columns

-- B-tree Index
-- forms a tree into dictionary packets
-- can be used for high cardinal columns -> more number of unique records

create index store_id_index
on payment using BTree 
(PAYMENT_ID);

-- Bitmap Index
-- large of amount of data with low cardinality -> lesser number of unique records
-- creates a column base pull into bitmap

CREATE INDEX STAFF_index
ON payment (STAFF_ID);
