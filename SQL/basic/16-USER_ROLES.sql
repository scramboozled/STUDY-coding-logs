
drop user scrambled;

create user scrambled
with password '1234';

grant select on all tables in schema public to scrambled;
REVOKE ALL PRIVILEGES ON SCHEMA public FROM scrambled;

-- role -> role creation
create role read_only;
grant select on all tables in schema public to read_only;
REVOKE ALL PRIVILEGES ON SCHEMA public FROM read_only;

grant read_only to scrambled;
