package com.football.webapp.WEB_INF.classes;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
/**
 * 
 */
public class Match {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Match")
    private Integer ID_Match;
    @Column(name = "Equipe_Gagnante")
    private Integer Equipe_Gagnante;
    @Column(name = "Equipe_Perdante")
    private Integer Equipe_Perdante;
    @Column(name = "Arbitre")
    private Integer Arbitre;
    @Column(name = "Arbitre_Assistant_1")
    private Integer Arbitre_Assistant_1;
    @Column(name = "Arbitre_Assistant_2")
    private Integer Arbitre_Assistant_2;
    @Column(name = "Arbitre_Assistant_3")
    private Integer Arbitre_Assistant_3;
    @Column(name = "MVP")
    private Integer MVP;
    @Column(name = "Date")
    private Date Date;
    @Column(name = "Stade")
    private String Stade;
    @Column(name = "Rang")
    private String Rang;
    @Column(name = "Score")
    private String Score;
    @Column(name = "Duree")
    private Integer Duree;


    public Match(Integer ID_Match, Integer Equipe_Gagnante, Integer Equipe_Perdante, Integer Arbitre,
     Integer Arbitre_Assistant_1, Integer Arbitre_Assistant_2, Integer Arbitre_Assistant_3, Integer MVP, Date Date, String Stade, String Rang, String Score, Integer Duree) {
        this.ID_Match = ID_Match;
        this.Equipe_Gagnante = Equipe_Gagnante;
        this.Equipe_Perdante = Equipe_Perdante;
        this.Arbitre = Arbitre;
        this.Arbitre_Assistant_1 = Arbitre_Assistant_1;
        this.Arbitre_Assistant_2 = Arbitre_Assistant_2;
        this.Arbitre_Assistant_3 = Arbitre_Assistant_3;
        this.MVP = MVP;
        this.Date = Date;
        this.Stade = Stade;
        this.Rang = Rang;
        this.Score = Score;
        this.Duree = Duree;
    }


    public Integer getID_Match() {
        return this.ID_Match;
    }

    public void setID_Match(Integer ID_Match) {
        this.ID_Match = ID_Match;
    }

    public Integer getEquipe_Gagnante() {
        return this.Equipe_Gagnante;
    }

    public void setEquipe_Gagnante(Integer Equipe_Gagnante) {
        this.Equipe_Gagnante = Equipe_Gagnante;
    }

    public Integer getEquipe_Perdante() {
        return this.Equipe_Perdante;
    }

    public void setEquipe_Perdante(Integer Equipe_Perdante) {
        this.Equipe_Perdante = Equipe_Perdante;
    }

    public Integer getArbitre() {
        return this.Arbitre;
    }

    public void setArbitre(Integer Arbitre) {
        this.Arbitre = Arbitre;
    }

    public Integer getArbitre_Assistant_1() {
        return this.Arbitre_Assistant_1;
    }

    public void setArbitre_Assistant_1(Integer Arbitre_Assistant_1) {
        this.Arbitre_Assistant_1 = Arbitre_Assistant_1;
    }

    public Integer getArbitre_Assistant_2() {
        return this.Arbitre_Assistant_2;
    }

    public void setArbitre_Assistant_2(Integer Arbitre_Assistant_2) {
        this.Arbitre_Assistant_2 = Arbitre_Assistant_2;
    }

    public Integer getArbitre_Assistant_3() {
        return this.Arbitre_Assistant_3;
    }

    public void setArbitre_Assistant_3(Integer Arbitre_Assistant_3) {
        this.Arbitre_Assistant_3 = Arbitre_Assistant_3;
    }

    public Integer getMVP() {
        return this.MVP;
    }

    public void setMVP(Integer MVP) {
        this.MVP = MVP;
    }

    public Date getDate() {
        return this.Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getStade() {
        return this.Stade;
    }

    public void setStade(String Stade) {
        this.Stade = Stade;
    }

    public String getRang() {
        return this.Rang;
    }

    public void setRang(String Rang) {
        this.Rang = Rang;
    }

    public String getScore() {
        return this.Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }

    public Integer getDuree() {
        return this.Duree;
    }

    public void setDuree(Integer Duree) {
        this.Duree = Duree;
    }

}
