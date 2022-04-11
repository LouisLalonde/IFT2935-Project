package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Time;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Sanction")
@Table(name = "Sanction", schema = "football")
public class Sanction {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Sanction")
    private Integer ID_Sanction;
    @Column(name = "ID_Joueur")
    private Integer ID_Joueur;
    @Column(name = "ID_Arbitre")
    private Integer ID_Arbitre;
    @Column(name = "ID_Match")
    private Integer ID_Match;
    @Column(name = "Temps")
    private Time Temps;
    @Column(name = "ID_Type_Sanction")
    private Integer ID_Type_Sanction;

    public Sanction(){}

    public Sanction(Integer ID_Sanction, Integer ID_Joueur, Integer ID_Arbitre, Integer ID_Match, Time Temps, Integer ID_Type_Sanction) {
        this.ID_Sanction = ID_Sanction;
        this.ID_Joueur = ID_Joueur;
        this.ID_Arbitre = ID_Arbitre;
        this.ID_Match = ID_Match;
        this.Temps = Temps;
        this.ID_Type_Sanction = ID_Type_Sanction;
    }


    public Integer getID_Sanction() {
        return this.ID_Sanction;
    }

    public void setID_Sanction(Integer ID_Sanction) {
        this.ID_Sanction = ID_Sanction;
    }

    public Integer getID_Joueur() {
        return this.ID_Joueur;
    }

    public void setID_Joueur(Integer ID_Joueur) {
        this.ID_Joueur = ID_Joueur;
    }

    public Integer getID_Arbitre() {
        return this.ID_Arbitre;
    }

    public void setID_Arbitre(Integer ID_Arbitre) {
        this.ID_Arbitre = ID_Arbitre;
    }

    public Integer getID_Match() {
        return this.ID_Match;
    }

    public void setID_Match(Integer ID_Match) {
        this.ID_Match = ID_Match;
    }

    public Time getTime() {
        return this.Temps;
    }

    public void setTime(Time Time) {
        this.Temps = Time;
    }

    public Integer getID_Type_Sanction() {
        return this.ID_Type_Sanction;
    }

    public void setID_Type_Sanction(Integer ID_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
    }

}
