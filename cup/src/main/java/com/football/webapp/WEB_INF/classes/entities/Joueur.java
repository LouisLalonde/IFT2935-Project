package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Joueur")
@Table(name = "Joueur", schema = "football")
public class Joueur extends Personne {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Joueur")
    private Integer idJoueur;
    @Column(name = "ID_Equipe")
    private Integer idEquipe;
    @Column(name = "Numero")
    private Integer numero;
    @Column(name = "Poste")
    private String poste;

    public Joueur(){}


    public Joueur(String prenom, String nom, Date dateNaissance, Integer idJoueur, Integer idEquipe, Integer numero, String poste) {
        super(prenom, nom, dateNaissance);
        this.idJoueur = idJoueur;
        this.idEquipe = idEquipe;
        this.numero = numero;
        this.poste = poste;
    }


    public Integer getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPoste() {
        return this.poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }       

}
