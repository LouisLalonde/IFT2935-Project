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
    private Integer idBut;
    @Column(name = "Gardien")
    private Integer gardien;
    @Column(name = "Buteur")
    private Integer buteur;
    @Column(name = "ID_Match")
    private Integer idMatch;
    @Column(name = "Temps")
    private Time Temps;
    @Column(name = "ID_Type_But")
    private Integer idTypeBut;


    public But() {}


    public But(Integer idBut, Integer gardien, Integer buteur, Integer idMatch, Time Temps, Integer idTypeBut) {
        this.idBut = idBut;
        this.gardien = gardien;
        this.buteur = buteur;
        this.idMatch = idMatch;
        this.Temps = Temps;
        this.idTypeBut = idTypeBut;
    }
    

    public Integer getIdBut() {
        return this.idBut;
    }

    public void setIdBut(Integer idBut) {
        this.idBut = idBut;
    }

    public Integer getGardien() {
        return this.gardien;
    }

    public void setGardien(Integer gardien) {
        this.gardien = gardien;
    }

    public Integer getButeur() {
        return this.buteur;
    }

    public void setButeur(Integer buteur) {
        this.buteur = buteur;
    }

    public Integer getIdMatch() {
        return this.idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Time getTemps() {
        return this.Temps;
    }

    public void setTemps(Time Temps) {
        this.Temps = Temps;
    }

    public Integer getIdTypeBut() {
        return this.idTypeBut;
    }

    public void setIdTypeBut(Integer idTypeBut) {
        this.idTypeBut = idTypeBut;
    }    

}
