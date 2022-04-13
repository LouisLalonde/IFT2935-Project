package com.football.webapp.WEB_INF.classes.entities;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Match")
@Table(name = "Match", schema = "football")
public class Match {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Match")
    private Integer idMatch;
    @Column(name = "Equipe_Gagnante")
    private Integer equipeGagnante;
    @Column(name = "Equipe_Perdante")
    private Integer equipePerdante;
    @Column(name = "Arbitre")
    private Integer arbitre;
    @Column(name = "Arbitre_Assistant_1")
    private Integer arbitreAssistant_1;
    @Column(name = "Arbitre_Assistant_2")
    private Integer arbitreAssistant_2;
    @Column(name = "Arbitre_Assistant_3")
    private Integer arbitreAssistant_3;
    @Column(name = "MVP")
    private Integer mvp;
    @Column(name = "Annee")
    private Integer annee;
    @Column(name = "Stade")
    private String stade;
    @Column(name = "Rang")
    private String rang;
    @Column(name = "Score")
    private String score;
    @Column(name = "Duree")
    private Integer duree;

    public Match(){}


    public Match(Integer idMatch, Integer equipeGagnante, Integer equipePerdante, Integer arbitre,
     Integer arbitreAssistant_1, Integer arbitreAssistant_2, Integer arbitreAssistant_3,
      Integer mvp, Integer annee, String stade, String rang, String score, Integer duree) {
        this.idMatch = idMatch;
        this.equipeGagnante = equipeGagnante;
        this.equipePerdante = equipePerdante;
        this.arbitre = arbitre;
        this.arbitreAssistant_1 = arbitreAssistant_1;
        this.arbitreAssistant_2 = arbitreAssistant_2;
        this.arbitreAssistant_3 = arbitreAssistant_3;
        this.mvp = mvp;
        this.annee = annee;
        this.stade = stade;
        this.rang = rang;
        this.score = score;
        this.duree = duree;
    }


    public Integer getIdMatch() {
        return this.idMatch;
    }

    public void setIdMatch(Integer idMatch) {
        this.idMatch = idMatch;
    }

    public Integer getEquipeGagnante() {
        return this.equipeGagnante;
    }

    public void setEquipeGagnante(Integer equipeGagnante) {
        this.equipeGagnante = equipeGagnante;
    }

    public Integer getEquipePerdante() {
        return this.equipePerdante;
    }

    public void setEquipePerdante(Integer equipePerdante) {
        this.equipePerdante = equipePerdante;
    }

    public Integer getArbitre() {
        return this.arbitre;
    }

    public void setArbitre(Integer arbitre) {
        this.arbitre = arbitre;
    }

    public Integer getArbitreAssistant_1() {
        return this.arbitreAssistant_1;
    }

    public void setArbitreAssistant_1(Integer arbitreAssistant_1) {
        this.arbitreAssistant_1 = arbitreAssistant_1;
    }

    public Integer getArbitreAssistant_2() {
        return this.arbitreAssistant_2;
    }

    public void setArbitreAssistant_2(Integer arbitreAssistant_2) {
        this.arbitreAssistant_2 = arbitreAssistant_2;
    }

    public Integer getArbitreAssistant_3() {
        return this.arbitreAssistant_3;
    }

    public void setArbitreAssistant_3(Integer arbitreAssistant_3) {
        this.arbitreAssistant_3 = arbitreAssistant_3;
    }

    public Integer getMvp() {
        return this.mvp;
    }

    public void setMvp(Integer mvp) {
        this.mvp = mvp;
    }

    public Integer getAnnee() {
        return this.annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getStade() {
        return this.stade;
    }

    public void setStade(String stade) {
        this.stade = stade;
    }

    public String getRang() {
        return this.rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Integer getDuree() {
        return this.duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }
    
}
