package com.football.webapp.WEB_INF.classes;
import java.sql.Time;

public class Sanction {
    private Integer ID_Sanction;
    private Integer ID_Joueur;
    private Integer ID_Arbitre;
    private Integer ID_Match;
    private Time Time;
    private Integer ID_Type_Sanction;


    public Sanction(Integer ID_Sanction, Integer ID_Joueur, Integer ID_Arbitre, Integer ID_Match, Time Time, Integer ID_Type_Sanction) {
        this.ID_Sanction = ID_Sanction;
        this.ID_Joueur = ID_Joueur;
        this.ID_Arbitre = ID_Arbitre;
        this.ID_Match = ID_Match;
        this.Time = Time;
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
        return this.Time;
    }

    public void setTime(Time Time) {
        this.Time = Time;
    }

    public Integer getID_Type_Sanction() {
        return this.ID_Type_Sanction;
    }

    public void setID_Type_Sanction(Integer ID_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
    }

}
