BEGIN;

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
    Pays_Equipe text
); 
 
CREATE TABLE Personne (
    Prenom text,
    Nom text,
    Date_Naissance date
);

CREATE TABLE Joueur (
    ID_Joueur int PRIMARY KEY,
    ID_Equipe int,
    FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Numero int,
    Poste text
)INHERITS(Personne);


CREATE TABLE Staff (
    ID_Staff int PRIMARY KEY,
    ID_Equipe int,
    FOREIGN KEY (ID_Equipe) REFERENCES Equipe(ID_Equipe),
    Anciennete int
)INHERITS(Personne);

CREATE TABLE Type_Arbitre (
    ID_Type_Arbitre int PRIMARY KEY,
    Nom_Type_Arbitre text
);

CREATE TABLE Arbitre (
    ID_Arbitre int PRIMARY KEY,
    ID_Type_Arbitre int,
    FOREIGN KEY (ID_Type_Arbitre) REFERENCES Type_Arbitre(ID_Type_Arbitre)
)INHERITS(Personne);

CREATE TABLE Blessure (
    ID_Blessure int PRIMARY KEY,
    ID_Joueur int,
    FOREIGN KEY (ID_Joueur) REFERENCES Joueur(ID_Joueur),
    Diagnostic text,
    Date date
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
    Annee int,
    FOREIGN KEY (Annee) REFERENCES CoupeDuMonde(Annee),
    Stade text,
    Rang text,
    Score text, 
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


--Equipe[ID_Équipe, Pays_Equipe] 
INSERT INTO Equipe VALUES (1,'Italy');
INSERT INTO Equipe VALUES (2,'France');
INSERT INTO Equipe VALUES (3,'Brazil');
INSERT INTO Equipe VALUES (4,'Switzerland');
INSERT INTO Equipe VALUES (5,'Sweden');
INSERT INTO Equipe VALUES (6,'Chile');
INSERT INTO Equipe VALUES (7,'England');
INSERT INTO Equipe VALUES (8,'Mexico');
INSERT INTO Equipe VALUES (9,'Germany');
INSERT INTO Equipe VALUES (10,'Argentina');

--Joueur[Prenom, Nom, Date_Naissance, ID_Joueur, #ID_Equipe, Numero, Poste] 
INSERT INTO Joueur Values('Blair','Geoffrey','1901-03-14',1,6,39,'gardien');
INSERT INTO Joueur Values('French','Barry','1908-03-10',2,2,60,'gardien');
INSERT INTO Joueur Values('Key','Reed','1907-07-06',3,1,29,'gardien');
INSERT INTO Joueur Values('Kidd','Martin','1905-04-21',4,9,4,'gardien');
INSERT INTO Joueur Values('Hodges','Keaton','1906-07-13',5,7,70,'gardien');
INSERT INTO Joueur Values('Gray','Leslie','1902-01-27',6,8,69,'gardien');
INSERT INTO Joueur Values('Allison','Jackson','1904-05-04',7,9,40,'ailier');
INSERT INTO Joueur Values('Walters','Shea','1908-08-06',8,5,27,'gardien');
INSERT INTO Joueur Values('Martinez','Halee','1910-02-17',9,4,57,'gardien');
INSERT INTO Joueur Values('Schwartz','Yvette','1905-11-28',10,8,58,'milieu_gauche');
INSERT INTO Joueur Values('Leblanc','Richard','1905-09-20',11,3,43,'gardien');
INSERT INTO Joueur Values('Riley','Blake','1905-04-12',12,3,3,'milieu_droite');
INSERT INTO Joueur Values('Haynes','Amery','1907-03-11',13,6,75,'milieu_droite');
INSERT INTO Joueur Values('Walters','Mary','1900-06-17',14,9,81,'milieu_avant');
INSERT INTO Joueur Values('Savage','Georgia','1907-09-25',15,5,43,'milieu_gauche');
INSERT INTO Joueur Values('Yang','Brett','1906-12-19',16,5,69,'ailier');
INSERT INTO Joueur Values('Forbes','Allegra','1904-01-12',17,9,9,'milieu_avant');
INSERT INTO Joueur Values('Bonner','Portia','1904-10-16',18,6,22,'attaquant_milieu');
INSERT INTO Joueur Values('Buckley','Nicole','1907-06-26',19,2,28,'centre_derrière');
INSERT INTO Joueur Values('Sheppard','Josephine','1907-03-02',20,9,79,'centre_derrière');
INSERT INTO Joueur Values('Mayer','Tanya','1905-10-25',21,7,33,'milieu_droite');
INSERT INTO Joueur Values('Calderon','Penelope','1908-02-16',22,7,80,'arrière_gauche');
INSERT INTO Joueur Values('Ford','Desiree','1908-10-13',23,6,77,'défensive_milieu');
INSERT INTO Joueur Values('Dickson','Driscoll','1905-05-07',24,3,85,'milieu_droite');
INSERT INTO Joueur Values('O brien','Martha','1901-04-08',25,10,11,'défensive_milieu');
INSERT INTO Joueur Values('Jensen','Lane','1902-12-23',26,8,66,'milieu_avant');
INSERT INTO Joueur Values('Burton','Ulric','1905-07-26',27,7,97,'défensive_milieu');
INSERT INTO Joueur Values('Velazquez','Rylee','1907-01-28',28,2,34,'milieu_centre');
INSERT INTO Joueur Values('Potts','Molly','1904-12-17',29,8,52,'milieu_avant');
INSERT INTO Joueur Values('Franklin','Tanner','1909-09-30',30,5,87,'défensive_milieu');
INSERT INTO Joueur Values('Ortega','Roanna','1902-05-17',31,6,81,'centre_derrière');
INSERT INTO Joueur Values('Franklin','Iris','1900-06-07',32,3,34,'centre_derrière');
INSERT INTO Joueur Values('Mckee','Lee','1901-04-27',33,7,89,'milieu_gauche');
INSERT INTO Joueur Values('Leonard','Teagan','1903-02-18',34,7,18,'milieu_avant');
INSERT INTO Joueur Values('Goodwin','Rooney','1906-07-02',35,6,95,'milieu_avant');
INSERT INTO Joueur Values('Perry','Danielle','1900-05-06',36,4,68,'milieu_gauche');
INSERT INTO Joueur Values('Russo','Garrett','1906-08-25',37,9,29,'centre_derrière');
INSERT INTO Joueur Values('Ward','Caesar','1902-12-13',38,8,45,'défensive_milieu');
INSERT INTO Joueur Values('Watkins','Lacey','1901-09-29',39,3,43,'milieu_droite');
INSERT INTO Joueur Values('Mann','Cooper','1907-11-04',40,4,37,'centre_derrière');
INSERT INTO Joueur Values('Alvarez','Gay','1904-03-16',41,5,23,'centre_derrière');
INSERT INTO Joueur Values('Beach','Xena','1907-11-23',42,5,69,'milieu_avant');
INSERT INTO Joueur Values('Gordon','Derek','1902-09-16',43,6,56,'gardien');
INSERT INTO Joueur Values('Wooten','Hilel','1909-05-05',44,4,42,'centre_derrière');
INSERT INTO Joueur Values('Howell','Reuben','1900-06-02',45,2,49,'milieu_gauche');
INSERT INTO Joueur Values('Boyer','Galvin','1902-05-02',46,2,8,'milieu_droite');
INSERT INTO Joueur Values('Hebert','Ali','1902-10-09',47,5,84,'arrière_gauche');
INSERT INTO Joueur Values('Espinoza','Felix','1905-06-10',48,5,2,'milieu_centre');
INSERT INTO Joueur Values('Gutierrez','Richard','1908-05-28',49,2,62,'milieu_centre');
INSERT INTO Joueur Values('Day','Burton','1909-04-26',50,8,64,'arrière_gauche');
INSERT INTO Joueur Values('Clayton','Heidi','1905-12-08',51,3,63,'milieu_avant');
INSERT INTO Joueur Values('Cunningham','Chloe','1901-10-05',52,4,11,'attaquant_milieu');
INSERT INTO Joueur Values('White','Rigel','1909-12-18',53,5,79,'défensive_milieu');
INSERT INTO Joueur Values('Blankenship','Blaze','1906-06-08',54,2,96,'gardien');
INSERT INTO Joueur Values('Barnett','Hayden','1904-03-15',55,8,10,'arrière_gauche');
INSERT INTO Joueur Values('Hamilton','Aladdin','1909-01-18',56,10,81,'gardien');
INSERT INTO Joueur Values('Sosa','Lilah','1909-12-24',57,8,70,'centre_derrière');
INSERT INTO Joueur Values('Fuentes','Dean','1901-08-17',58,10,1,'ailier');
INSERT INTO Joueur Values('Nolan','Jael','1902-05-16',59,8,92,'milieu_avant');
INSERT INTO Joueur Values('Houston','Nelle','1900-06-30',60,7,79,'milieu_centre');
INSERT INTO Joueur Values('O Neill','Darius','1906-09-29',61,9,10,'défensive_milieu');
INSERT INTO Joueur Values('Shelton','Dillon','1907-06-13',62,7,90,'ailier');
INSERT INTO Joueur Values('Mayo','Ulla','1903-03-03',63,4,32,'milieu_avant');
INSERT INTO Joueur Values('Nicholson','Jonas','1902-08-12',64,2,82,'défensive_milieu');
INSERT INTO Joueur Values('Hyde','Phyllis','1901-07-20',65,2,30,'milieu_centre');
INSERT INTO Joueur Values('Mendez','Diana','1906-03-18',66,4,98,'milieu_droite');
INSERT INTO Joueur Values('Brooks','Beverly','1902-12-08',67,8,5,'milieu_gauche');
INSERT INTO Joueur Values('Morin','Curran','1910-03-13',68,8,4,'milieu_droite');
INSERT INTO Joueur Values('Guthrie','Jared','1909-04-08',69,9,97,'ailier');
INSERT INTO Joueur Values('Knox','Hope','1900-05-17',70,1,74,'arrière_gauche');
INSERT INTO Joueur Values('Hodge','Chase','1907-05-01',71,6,67,'milieu_gauche');
INSERT INTO Joueur Values('Warren','Abigail','1903-02-05',72,4,62,'milieu_gauche');
INSERT INTO Joueur Values('Wells','Ivana','1900-09-13',73,7,61,'ailier');
INSERT INTO Joueur Values('Dennis','Salvador','1910-04-04',74,6,34,'milieu_centre');
INSERT INTO Joueur Values('Ross','Quinn','1907-08-18',75,4,74,'ailier');
INSERT INTO Joueur Values('Hopkins','Colin','1906-04-07',76,6,94,'centre_derrière');
INSERT INTO Joueur Values('Alvarez','Brianna','1905-08-12',77,7,21,'milieu_droite');
INSERT INTO Joueur Values('Vega','Keane','1904-04-28',78,6,85,'gardien');
INSERT INTO Joueur Values('Morin','Victor','1900-05-26',79,4,85,'milieu_centre');
INSERT INTO Joueur Values('Harrington','Priscilla','1907-06-30',80,5,15,'défensive_milieu');
INSERT INTO Joueur Values('Tillman','Meghan','1906-01-17',81,7,32,'milieu_centre');
INSERT INTO Joueur Values('Key','Nathaniel','1906-04-16',82,1,76,'milieu_gauche');
INSERT INTO Joueur Values('Roberson','Cassidy','1900-06-10',83,7,63,'attaquant_milieu');
INSERT INTO Joueur Values('Hebert','Slade','1908-07-13',84,1,85,'milieu_avant');
INSERT INTO Joueur Values('Hines','Marny','1901-12-09',85,7,53,'ailier');
INSERT INTO Joueur Values('Houston','Macaulay','1907-08-05',86,6,21,'défensive_milieu');
INSERT INTO Joueur Values('Kennedy','Olga','1908-05-02',87,10,44,'centre_derrière');
INSERT INTO Joueur Values('Dixon','Alan','1908-03-07',88,8,26,'attaquant_milieu');
INSERT INTO Joueur Values('Oliver','Carol','1907-06-04',89,4,74,'défensive_milieu');
INSERT INTO Joueur Values('Ortiz','Zena','1903-02-27',90,6,46,'milieu_avant');
INSERT INTO Joueur Values('Roman','Destiny','1902-09-04',91,9,31,'milieu_avant');
INSERT INTO Joueur Values('Butler','Brandon','1905-05-27',92,8,10,'milieu_gauche');
INSERT INTO Joueur Values('Donaldson','Celeste','1905-12-27',93,4,2,'gardien');
INSERT INTO Joueur Values('Dunlap','Venus','1901-07-22',94,10,41,'milieu_centre');
INSERT INTO Joueur Values('Koch','Harrison','1903-01-05',95,3,56,'centre_derrière');
INSERT INTO Joueur Values('Church','Irma','1904-03-22',96,5,94,'milieu_gauche');
INSERT INTO Joueur Values('Meyer','Mufutau','1906-11-22',97,6,79,'milieu_droite');
INSERT INTO Joueur Values('Hickman','Eric','1900-12-04',98,2,67,'milieu_centre');
INSERT INTO Joueur Values('Garcia','Virginia','1905-08-04',99,1,84,'défensive_milieu');
INSERT INTO Joueur Values('Macdonald','Len','1907-06-05',100,10,12,'milieu_centre');


--Staff[Prenom, Nom, Date_Naissance, ID_Staff, #ID_Equipe, Anciennete] 
INSERT INTO Staff Values('Castro','Justine','1906-04-06',1,1,3);
INSERT INTO Staff Values('Dodson','Chancellor','1907-01-30',2,2,3);
INSERT INTO Staff Values('Bryant','Yuli','1907-09-21',3,3,3);
INSERT INTO Staff Values('Maxwell','Simon','1908-01-07',4,4,3);
INSERT INTO Staff Values('Moran','Claudia','1903-05-19',5,5,4);
INSERT INTO Staff Values('Miranda','Guinevere','1902-11-20',6,6,2);
INSERT INTO Staff Values('Barber','Marshall','1906-08-08',7,7,2);
INSERT INTO Staff Values('Mendez','Christen','1909-02-07',8,8,4);
INSERT INTO Staff Values('Pennington','Aileen','1904-09-24',9,9,3);
INSERT INTO Staff Values('Everett','Keegan','1903-11-17',10,10,3);

--Type_Arbitre[ID_Type_Arbitre, Nom_Type_Arbitre] 
INSERT INTO Type_Arbitre VALUES (1,'Arbitre');
INSERT INTO Type_Arbitre VALUES (2,'Arbitre_Assistant_1');
INSERT INTO Type_Arbitre VALUES (3,'Arbitre_Assistant_2');
INSERT INTO Type_Arbitre VALUES (4,'Arbitre_Assistant_3');


--Arbitre[Prenom, Nom, Date_Naissance, ID_Arbitre, #ID_Type_Arbitre] 
INSERT INTO Arbitre VALUES('Bruce','Doris','1902-10-22',1,3);
INSERT INTO Arbitre VALUES('Atkins','Upton','1904-02-22',2,4);
INSERT INTO Arbitre VALUES('Wood','Echo','1901-04-27',3,1);
INSERT INTO Arbitre VALUES('Mayo','Kelly','1902-11-26',4,4);
INSERT INTO Arbitre VALUES('Rose','Kaye','1901-07-13',5,2);
INSERT INTO Arbitre VALUES('Valenzuela','Daria','1906-09-11',6,4);
INSERT INTO Arbitre VALUES('Mcfarland','Lana','1906-07-05',7,2);
INSERT INTO Arbitre VALUES('Roy','Nero','1906-05-08',8,2);
INSERT INTO Arbitre VALUES('Henry','Randall','1909-02-20',9,3);
INSERT INTO Arbitre VALUES('Dawson','Kirk','1909-01-07',10,3);

--Blessure[ID_Blessure, #ID_Joueur, Diagnostic, Date] 
INSERT INTO Blessure VALUES(1,12,'légère_bras','2021-05-29');
INSERT INTO Blessure VALUES(2,51,'légère_tête','2022-03-06');
INSERT INTO Blessure VALUES(3,54,'légère_bras','2023-03-22');
INSERT INTO Blessure VALUES(4,20,'légère_jambe','2022-12-04');
INSERT INTO Blessure VALUES(5,39,'grave_bras','2021-11-19');
INSERT INTO Blessure VALUES(6,53,'légère_bras','2022-05-23');
INSERT INTO Blessure VALUES(7,59,'légère_jambe','2022-09-15');
INSERT INTO Blessure VALUES(8,21,'légère_tête','2021-04-20');
INSERT INTO Blessure VALUES(9,64,'grave_jambe','2022-11-01');
INSERT INTO Blessure VALUES(10,81,'grave_bras','2021-05-24');

--Match[ID_Match, #Equipe_Gagnante, #Equipe_Perdante, #Arbitre, #Arbitre_Assistant_1, #Arbitre_Assistant_2, #Arbitre_Assistant_3, #MVP, #Annee, Stade, Rang, Score, Durée] 
INSERT INTO Match VALUES (1, 5, 9, 3, 5, 1, 2, 41,'1934', 'Spauto', 'Huitièmes de finale', '2-0', 90);
INSERT INTO Match VALUES (2, 7, 8, 3, 5, 10, 4, 60, '1934', 'Rolex', 'Quarts de finale', '6-0', 90);
INSERT INTO Match VALUES (3, 5, 7, 3, 7, 1, 4, 41, '1938', 'BNParadise', 'Demi-finale', '5-4', 90);
INSERT INTO Match VALUES (4, 6, 3, 3, 8, 9, 2, 71, '1950', 'Google', 'Finale', '3-1', 90);
INSERT INTO Match VALUES (5, 5, 4, 3, 7, 10, 6, 47, '1958', 'P&G', 'Qualification', '1-0', 90);
INSERT INTO Match VALUES (6, 5, 6, 3, 7, 9, 4, 42,  '1962', 'Nikon', 'Demi-finale', '5-3', 90);
INSERT INTO Match VALUES (7, 3, 5, 3, 8, 1, 6, 51, '1966', 'Nestle', 'Quarts de finale', '2-1', 90);
INSERT INTO Match VALUES (8, 4, 8, 3, 5, 10, 6, 89, '1970', 'Kelloggs', 'Demi-finale', '4-3', 90);
INSERT INTO Match VALUES (9, 3, 9, 3, 8, 9, 2, 24, '1974', 'Twitter', 'Qualification', '2-0', 90);
INSERT INTO Match VALUES (10, 6, 10, 3, 8, 9, 2, 74, '1978', 'Unilever', 'Qualification', '6-1', 90);


--Type_But[ID_Type_But,Nom_Type_But] 
INSERT INTO Type_But VALUES (1, 'Coup envoi');
INSERT INTO Type_But VALUES (2, 'Coup de pied de but');
INSERT INTO Type_But VALUES (3, 'Penalty');
INSERT INTO Type_But VALUES (4, 'Coup franc direct');
INSERT INTO Type_But VALUES (5, 'Corner');
INSERT INTO Type_But VALUES (6, 'Autre');


--But[ID_But, #Gardien, #Buteur, #ID_Match, Timestamp, #ID_Type_But]
INSERT INTO But VALUES (1, 4, 41, 1, '00:26:16', 4);
INSERT INTO But VALUES (2, 6, 60, 2, '01:25:16', 5);
INSERT INTO But VALUES (3, 5, 41, 3, '00:43:05', 1);
INSERT INTO But VALUES (4, 11, 71, 4, '01:06:48', 4);
INSERT INTO But VALUES (5, 9, 47, 5, '01:01:32', 6);
INSERT INTO But VALUES (6, 1, 42, 6, '00:36:41', 2);
INSERT INTO But VALUES (7, 8, 51, 7, '00:49:05', 2);
INSERT INTO But VALUES (8, 6, 89, 8, '00:30:34', 1);
INSERT INTO But VALUES (9, 4, 24, 9, '00:21:40', 3);
INSERT INTO But VALUES (10, 56, 74, 10, '00:09:23', 3);


--Type_Sanction[ID_Type_Sanction, Nom_Type_Sanction]
INSERT INTO Type_Sanction VALUES (1, 'Avertissement');
INSERT INTO Type_Sanction VALUES (2, 'Carton Jaune');
INSERT INTO Type_Sanction VALUES (3, 'Carton Rouge');


--Sanction[ID_Sanction, #ID_Joueur, #ID_Arbitre, #ID_Match, Timestamp, #ID_Type_Sanction] 

INSERT INTO Sanction VALUES (1, 69, 1, 1, '00:25:02', 2);
INSERT INTO Sanction VALUES (2, 38, 4, 2, '00:59:10', 1);
INSERT INTO Sanction VALUES (3, 27, 7, 3, '00:47:07', 1);
INSERT INTO Sanction VALUES (4, 12, 3, 4, '01:06:49', 2);
INSERT INTO Sanction VALUES (5, 79, 10, 5, '00:45:43', 1);
INSERT INTO Sanction VALUES (6, 35, 4, 6, '01:17:52', 2);
INSERT INTO Sanction VALUES(7, 53, 6, 7, '00:36:41', 1);
INSERT INTO Sanction VALUES (8, 55, 5, 8, '00:29:30', 2);
INSERT INTO Sanction VALUES (9, 69, 2, 9, '00:55:42', 3);
INSERT INTO Sanction VALUES (10, 87, 9, 10, '01:02:41', 2);


commit;

