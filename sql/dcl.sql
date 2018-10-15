DROP USER challenge CASCADE;

CREATE USER challenge
IDENTIFIED BY p4ssw0rd
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA 10M ON users;

GRANT connect to ers;
GRANT resource to ers;
GRANT create session to ers;
GRANT create table to ers;
GRANT create view to ers;