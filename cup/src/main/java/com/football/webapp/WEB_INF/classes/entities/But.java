package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Time;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "But")
@Table(name = "But", schema = "football")
public class But {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_But")
    private Integer ID_But;
    @Column(name = "Gardien")
    private Integer Gardien;
    @Column(name = "Buteur")
    private Integer Buteur;
    @Column(name = "ID_Match")
    private Integer ID_Match;
    @Column(name = "Temps")
    private Time Temps;
    @Column(name = "ID_Type_But")
    private Integer ID_Type_But;


    public But() {}

    public But(Integer ID_But, Integer Gardien, Integer Buteur, Integer ID_Match, Time Temps, Integer ID_Type_But) {
        this.ID_But = ID_But;
        this.Gardien = Gardien;
        this.Buteur = Buteur;
        this.ID_Match = ID_Match;
        this.Temps = Temps;
        this.ID_Type_But = ID_Type_But;
    }


    public Integer getID_But() {
        return this.ID_But;
    }

    public void setID_But(Integer ID_But) {
        this.ID_But = ID_But;
    }

    public Integer getGardien() {
        return this.Gardien;
    }

    public void setGardien(Integer Gardien) {
        this.Gardien = Gardien;
    }

    public Integer getButeur() {
        return this.Buteur;
    }

    public void setButeur(Integer Buteur) {
        this.Buteur = Buteur;
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

    public void setTime(Time Temps) {
        this.Temps = Temps;
    }

    public Integer getID_Type_But() {
        return this.ID_Type_But;
    }

    public void setID_Type_But(Integer ID_Type_But) {
        this.ID_Type_But = ID_Type_But;
    }

}
