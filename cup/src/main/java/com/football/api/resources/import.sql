--Vanessa Bellegarde (20184886) 
--Jonathan Therrien (20157376)
--Alexandre Hamila (20181634)
--Louis Lalonde (20162457)

begin transaction;

drop schema if exists therrijo cascade;
create schema therrijo;
set search_path to therrijo;

CREATE TABLE CoupeDuMonde (
    annee int PRIMARY KEY,
    Pays_Coupe text,
    Start_Date int,
    End_date int
); 

CREATE TABLE Equipe (
    ID_Equipe int PRIMARY KEY,
    Annee int,
    ADD FOREIGN KEY (Annee) REFERENCES CoupeDuMonde(annee)
    Pays text,
); 

commit;
rollback;
