<div id="top"></div>
<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Don't forget to give the project a star!
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<br />
<div align="center">

<h3 align="center">Coupe du monde des nations du football </h3>
  
</div>


<!-- ABOUT THE PROJECT -->
## À propos du projet

La fédération Internationale de football souhaite créer une base de données des coupes du monde des nations depuis la création de cette
compétition. Dans chaque coupe du monde, un nombre d’équipes se présentent, représentant chacune un pays. Chaque équipe est constituée
d’un certain nombre de joueurs et d’un staff technique (l’entraîneur et ses collaborateurs). Chaque joueur appartenant à une équipe est identifié
par un numéro. Un joueur peut recevoir des sanctions durant les matchs de la compétition (cartons jaunes ou rouges). Chaque équipe joue un
nombre de matchs. Un match est caractérisé par sa date, son lieu (un stade), son rang dans la compétition, les équipent participantes ainsi que le
score final. Un match est géré par un arbitre principal et trois arbitres assistants.
On souhaite obtenir des statistiques diverses sur la participation des joueurs, des équipes et des arbitres dans une ou plusieurs coupes du monde.
On pourra inclure dans chaque entité tous les éléments réalistes possibles à condition de les justifier. 

<p align="right">(<a href="#top">back to top</a>)</p>



### Développer avec

* [Java](https://www.java.com/fr/)
* [Apache Maven](https://maven.apache.org/index.html)
* [FasterXML](https://github.com/FasterXML/jackson)
* [Hibernate](https://hibernate.org/)

<p align="right">(<a href="#top">back to top</a>)</p>

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/LouisLalonde/IFT2935-Project.git
   ```

<!-- GETTING STARTED -->
## Pour débuter le projet

### Préalables pour le développement

- JDK >= 17.0
- Apache Maven 3.8.5
- Postgresql
- Base de données avec comme nom: football
- Mot de passe de l'utilisateur postgres: postgres
- Exécuter le fichier d'importation : import.sql
  ```sh
  psql -h localhost -U postgres -d football -f import.sql
  ```
  
### Préalables pour la production

- Avoir une version récente de Java
- Avoir une base de donnée locale avec comme nom : football
- Avoir un utilisateur postgres dont le mot de passe est: postgres
- Exécuter le fichier d'importation des données import.sql qui est fourni avec le programme
  ```sh
  psql -h localhost -U postgres -d football -f import.sql
  ```

<p align="right">(<a href="#top">back to top</a>)</p>


<!-- USAGE EXAMPLES -->
## Guide d'utilisation

- Assurez-vous que toutes les étapes de la section <b>préalables pour la production</b> sont complétées.
- Lancer le fichier exécutable jar.
Disposés sur l'en-tête de l'interface utilisateur de l'application, se trouvent quatres boutons.

Chacun d'entre-eux permet l'exécution d'une requête.

Après que la requête ait été traitée par les dorsaux puis envoyée au système de gestion de données,
les résultats sont affichés dans la boite principale de l'interface utilisateur.

Dépendant du type de requête effectuée, les résultats retournés sont affichés sous forme phrase.s
ou bien sous forme de tuple.s.

Pour en savoir plus sur les différentes requêtes, veuillez consulter le rapport de l'application.

![plot](./img/UI.png)

<!-- ROADMAP -->
## Feuille de route

- [X] Développer le back-end
- [X] Utiliser le cadre de développement Hibernate
- [X] Développer le front-end

<p align="right">(<a href="#top">back to top</a>)</p>

<!-- ACKNOWLEDGMENTS -->
## Remerciments

* [Louis Lalonde - 20162457](#)
* [Jonathan Therrien - 20157376](#)
* [Vanessa Bellegarde - 20184886](#)
* [Alexandre Hamila - 20181634](#)
<p align="right">(<a href="#top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/github_username/repo_name.svg?style=for-the-badge
[contributors-url]: https://github.com/github_username/repo_name/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/github_username/repo_name.svg?style=for-the-badge
[forks-url]: https://github.com/github_username/repo_name/network/members
[stars-shield]: https://img.shields.io/github/stars/github_username/repo_name.svg?style=for-the-badge
[stars-url]: https://github.com/github_username/repo_name/stargazers
[issues-shield]: https://img.shields.io/github/issues/github_username/repo_name.svg?style=for-the-badge
[issues-url]: https://github.com/github_username/repo_name/issues
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/github_username/repo_name/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://linkedin.com/in/linkedin_username
[product-screenshot]: images/screenshot.png
