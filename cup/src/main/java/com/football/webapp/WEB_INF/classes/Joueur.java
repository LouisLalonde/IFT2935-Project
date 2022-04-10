package com.football.webapp.WEB_INF.classes;
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
    private Integer ID_Joueur;
    @Column(name = "ID_Equipe")
    private Integer ID_Equipe;
    @Column(name = "Numero")
    private Integer Numero;
    @Column(name = "Poste")
    private String Poste;

    public Joueur(){}
    
    public Joueur(String Prenom, String Nom, Date Date_Naissance, Integer ID_Joueur, Integer ID_Equipe, Integer Numero, String Poste) {
        super(Prenom, Nom, Date_Naissance);
        this.ID_Joueur = ID_Joueur;
        this.ID_Equipe = ID_Equipe;
        this.Numero = Numero;
        this.Poste = Poste;
    }


    public Integer getID_Joueur() {
        return this.ID_Joueur;
    }

    public void setID_Joueur(Integer ID_Joueur) {
        this.ID_Joueur = ID_Joueur;
    }

    public Integer getID_Equipe() {
        return this.ID_Equipe;
    }

    public void setID_Equipe(Integer ID_Equipe) {
        this.ID_Equipe = ID_Equipe;
    }

    public Integer getNumero() {
        return this.Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public String getPoste() {
        return this.Poste;
    }

    public void setPoste(String Poste) {
        this.Poste = Poste;
    }

}
