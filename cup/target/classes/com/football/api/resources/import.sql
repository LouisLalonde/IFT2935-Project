BEGIN;

drop schema if exists football cascade;
create schema football;

drop table if exists student;

CREATE TABLE student (id INTEGER,txt_firstname VARCHAR(255),txt_lastname VARCHAR(255),num_roll INTEGER,txt_standard VARCHAR(255));
INSERT INTO student VALUES (12, 'David', 'Lalonde', 999, 'pgpsql');
INSERT INTO student VALUES (12, 'Louis', 'Lalonde', 888, 'pgpsql');

COMMIT;
