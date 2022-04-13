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
    private Integer idSanction;
    @Column(name = "ID_Joueur")
    private Integer idJoueur;
    @Column(name = "ID_Arbitre")
    private Integer idArbitre;
    @Column(name = "ID_Match")
    private Integer idMatch;
    @Column(name = "Temps")
    private Time temps;
    @Column(name = "ID_Type_Sanction")
    private Integer idTypeSanction;

    public Sanction(){}


    public Sanction(Integer idSanction, Integer idJoueur, Integer idArbitre, Integer idMatch, Time temps, Integer idTypeSanction) {
        this.idSanction = idSanction;
        this.idJoueur = idJoueur;
        this.idArbitre = idArbitre;
        this.idMatch = idMatch;
        this.temps = temps;
        this.idTypeSanction = idTypeSanction;
    }

    public Integer getIdSanction() {
        return this.idSanction;
    }

    public void setIdSanction(Integer idSanction) {
        this.idSanction = idSanction;
    }

    public Integer getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public Integer getIdArbitre() {
        return this.idArbitre;
    }

    public void setIdArbitre(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public Integer getIdMatch() {
        return this.idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Time getTemps() {
        return this.temps;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }

    public Integer getIdTypeSanction() {
        return this.idTypeSanction;
    }

    public void setIdTypeSanction(Integer idTypeSanction) {
        this.idTypeSanction = idTypeSanction;
    }

}
