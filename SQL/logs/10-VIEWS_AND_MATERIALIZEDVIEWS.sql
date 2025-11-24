-- Views -> store the select statements used in database


-- Data is not stored for the object
create view staff_willaim
as
select * from staff where name = 'WILL';

-- A snapshot of parent query is taken at the time of execution 
-- and need to be refreshed frequently to sync the data with parent tables
create MATERIALIZED view mv_staff_william
as
select * from staff where name = 'WILL';


-- updating records in parent table won't be reflected in materialized view unless they are refreshed
---------------------------------------------
select * from mv_staff_william;
update staff set staff_id = 3
where name = 'WILL';
select * from mv_staff_william;
REFRESH MATERIALIZED VIEW mv_staff_william;
select * from mv_staff_william;
---------------------------------------------