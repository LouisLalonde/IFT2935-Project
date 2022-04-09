BEGIN;

drop database if exists football;
create database football;

drop schema if exists football cascade;
create schema football;

drop schema if exists football cascade;
create schema football;
set search_path to football;
GRANT ALL PRIVILEGES ON DATABASE football TO postgres;

CREATE TABLE CoupeDuMonde (
    Annee int PRIMARY KEY,
    Pays_Coupe text,
    Start_Date date,
    End_date date
); 

CREATE TABLE Equipe (
    ID_Equipe int PRIMARY KEY,
    Annee int,
    FOREIGN KEY (Annee) REFERENCES CoupeDuMonde(Annee),
    Pays text
); 
 
CREATE TABLE Personne (
    Prenom text,
    Nom text,
    Date_Naissance date
);

CREATE TABLE Joueur (
    ID_Joueur int PRIMARY KEY,
    --ID_Personne int,
    --FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Equipe int,
    FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Numero int,
    Poste text
)INHERITS(Personne);


CREATE TABLE Staff (
    ID_Staff int PRIMARY KEY,
    --ID_Personne int,
    --FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Equipe int,
    FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Anciennete text
)INHERITS(Personne);

CREATE TABLE Type_Arbitre (
    ID_Type_Arbitre int PRIMARY KEY,
    Nom_Type_Arbitre text
);

CREATE TABLE Arbitre (
    ID_Arbitre int PRIMARY KEY,
    --ID_Personne int,
    --FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Type_Arbitre int,
    FOREIGN KEY (ID_Type_Arbitre) REFERENCES Type_Arbitre(ID_Type_Arbitre)
)INHERITS(Personne);

CREATE TABLE Blessure (
    ID_Blessure int PRIMARY KEY,
    ID_Joueur int,
    FOREIGN KEY (ID_Joueur) REFERENCES Joueur(ID_Joueur),
    Diagnostic text,
    Date text
);

CREATE TABLE Match (
    ID_Match int PRIMARY KEY,
    Equipe_Gagnante int,
    FOREIGN KEY (Equipe_Gagnante) REFERENCES Equipe(ID_Equipe),
    Equipe_Perdante int,
    FOREIGN KEY (Equipe_Perdante) REFERENCES Equipe(ID_Equipe),
    Arbitre int,
    FOREIGN KEY (Arbitre) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_1 int, 
    FOREIGN KEY (Arbitre_Assistant_1) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_2 int,
    FOREIGN KEY (Arbitre_Assistant_2) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_3 int,
    FOREIGN KEY (Arbitre_Assistant_3) REFERENCES Arbitre(ID_Arbitre),
    MVP int,
    FOREIGN KEY (MVP) REFERENCES Joueur(ID_Joueur),
    Date text,
    Rang int,
    Score int, 
    Duree int
);

CREATE TABLE Type_But (
    ID_Type_But int PRIMARY KEY,
    Nom_Type_But text
);

CREATE TABLE But (
    ID_But int PRIMARY KEY,
    Gardien int, 
    FOREIGN KEY (Gardien) REFERENCES Joueur(ID_Joueur),
    Buteur int,
    FOREIGN KEY (Buteur) REFERENCES Joueur(ID_Joueur), 
    ID_Match int,
    FOREIGN KEY (ID_Match) REFERENCES Match(ID_Match),
    Timestamp time,
    ID_Type_But int,
    FOREIGN KEY (ID_Type_But) REFERENCES Type_But(ID_Type_But)
);

CREATE TABLE Type_Sanction(
    ID_Type_Sanction int PRIMARY KEY,
    Nom_Type_Sanction text
); 

CREATE TABLE Sanction (
    ID_Sanction int PRIMARY KEY, 
    ID_Joueur int,
    FOREIGN KEY (ID_Joueur) REFERENCES Joueur(ID_Joueur), 
    ID_Arbitre int,
    FOREIGN KEY (ID_Arbitre) REFERENCES Arbitre(ID_Arbitre), 
    ID_Match int,
    FOREIGN KEY (ID_Match) REFERENCES Match(ID_Match), 
    Timestamp time, 
    ID_Type_Sanction int,
    FOREIGN KEY (ID_Type_Sanction) REFERENCES Type_Sanction(ID_Type_Sanction)
);

INSERT INTO CoupeDuMonde VALUES (1934, 'Italy', '1934-05-27', '1934-06-10');
INSERT INTO CoupeDuMonde VALUES (1938, 'France', '1938-06-04', '1934-06-18');
INSERT INTO CoupeDuMonde VALUES (1950, 'Brazil', '1950-06-24', '1934-07-16');
INSERT INTO CoupeDuMonde VALUES (1954, 'Switzerland', '1954-06-16', '1954-07-04');
INSERT INTO CoupeDuMonde VALUES (1958, 'Sweden', '1958-06-08', '1958-06-29');
INSERT INTO CoupeDuMonde VALUES (1962, 'Chile', '1962-05-30', '1962-06-17');
INSERT INTO CoupeDuMonde VALUES (1966, 'England', '1966-06-11', '1934-06-30');
INSERT INTO CoupeDuMonde VALUES (1970, 'Mexico', '1970-05-31', '1970-06-21');
INSERT INTO CoupeDuMonde VALUES (1974, 'Germany', '1974-06-13', '1974-07-07');
INSERT INTO CoupeDuMonde VALUES (1978, 'Argentina', '1978-06-01', '1978-06-25');

commit;

