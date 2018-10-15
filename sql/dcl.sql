DROP USER challenge CASCADE;

CREATE USER challenge
IDENTIFIED BY p4ssw0rd
DEFAULT TABLESPACE users
TEMPORARY TABLESPACE temp
QUOTA 10M ON users;

GRANT connect to challenge;
GRANT resource to challenge;
GRANT create session to challenge;
GRANT create table to challenge;
GRANT create view to challenge;