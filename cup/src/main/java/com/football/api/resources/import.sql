--Vanessa Bellegarde (20184886) 
--Jonathan Therrien (20157376)
--Alexandre Hamila (20181634)
--Louis Lalonde (20162457)

begin transaction;

drop schema if exists football cascade;
create schema football;
set search_path to football;

CREATE TABLE CoupeDuMonde (
    annee int PRIMARY KEY,
    Pays_Coupe text,
    Start_Date int,
    End_date int
); 

CREATE TABLE Equipe (
    ID_Equipe int PRIMARY KEY,
    Annee int,
    ADD FOREIGN KEY (Annee) REFERENCES CoupeDuMonde(annee),
    Pays text,
); 

CREATE TABLE Personne (
    ID_Personne int PRIMARY KEY,
    Prenom text,
    Nom text,
    Role text,
);

CREATE TABLE Joueur (
    ID_Joueur int PRIMARY KEY,
    ID_Personne int,
    ADD FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Equipe int
    ADD FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Numero int,
    Poste text,
);

CREATE TABLE Staff (
    ID_Staff int PRIMARY KEY,
    ID_Personne int,
    ADD FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Equipe int
    ADD FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Anciennete text,
);

CREATE TABLE Arbitre (
    ID_Arbitre int PRIMARY KEY,
    ID_Personne int,
    ADD FOREIGN KEY (ID_Personne) REFERENCES Personne(ID_Personne),
    ID_Type_Arbitre int
    ADD FOREIGN KEY (ID_Type_Arbitre) REFERENCES Type_Arbitre(ID_Type_Arbitre),
);


CREATE TABLE Type_Arbitre (
    ID_Type_Arbitre int PRIMARY KEY,
    Nom_Type_Arbitre text,
);


CREATE TABLE Blessure (
    ID_Blessure int PRIMARY KEY,
    ID_Joueur int,
    ADD FOREIGN KEY (ID_Joueur) REFERENCES Joueur(ID_Joueur),
    Diagnostic text,
    Date text,
);

CREATE TABLE Match (
    ID_Match int PRIMARY KEY,
    Equipe_Gagnante int,
    ADD FOREIGN KEY (Equipe_Gagnante) REFERENCES Equipe(ID_Equipe)
    Equipe_Perdante int,
    ADD FOREIGN KEY (Equipe_Perdante) REFERENCES Equipe(ID_Equipe)
    Arbitre text,
    ADD FOREIGN KEY (Arbitre) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_1 text, 
    ADD FOREIGN KEY (Arbitre_Assistant_1) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_2 text,
    ADD FOREIGN KEY (Arbitre_Assistant_2) REFERENCES Arbitre(ID_Arbitre),
    Arbitre_Assistant_3 text,
    ADD FOREIGN KEY (Arbitre_Assistant_3) REFERENCES Arbitre(ID_Arbitre),
    MVP int,
    ADD FOREIGN KEY (MVP) REFERENCES Joueur(ID_Joueur),
    Date text,
    Rang int,
    Score int, 
    Duree int,
);

CREATE TABLE But (
    ID_But int PRIMARY KEY,
    Gardien int, 
    ADD FOREIGN KEY (Gardien) REFERENCES Joueur(ID_Joueur),
    Buteur int,
    ADD FOREIGN KEY (Buteur) REFERENCES Joueur(ID_Joueur), 
    ID_Match int,
    ADD FOREIGN KEY (ID_Match) REFERENCES Match(ID_Match),
    Timestamp time,
    ID_Type_But int,
    ADD FOREIGN KEY (ID_Type_But) REFERENCES Type_But(ID_Type_But),
);

CREATE TABLE Type_But (
    ID_Type_But int PRIMARY KEY,
    Nom_Type_But text,
);

CREATE TABLE Sanction (
    ID_Sanction int PRIMARY KEY, 
    ID_Joueur int,
    ADD FOREIGN KEY (ID_Joueur) REFERENCES Joueur(ID_Joueur), 
    ID_Arbitre int,
    ADD FOREIGN KEY (ID_Arbitre) REFERENCES Arbitre(ID_Arbitre), 
    ID_Match int,
    ADD FOREIGN KEY (ID_Match) REFERENCES Match(ID_Match), 
    Timestamp time, 
    ID_Type_Sanction int,
    ADD FOREIGN KEY (ID_Type_Sanction) REFERENCES Type_Sanction(ID_Type_Sanction), 
);

CREATE TABLE Type_Sanction(
    ID_Type_Sanction int PRIMARY KEY,
    Nom_Type_Sanction text,
);

commit;
rollback;
