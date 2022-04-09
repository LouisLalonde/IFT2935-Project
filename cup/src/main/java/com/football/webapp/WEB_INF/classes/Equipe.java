package com.football.webapp.WEB_INF.classes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "Equipe")
public class Equipe {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Equipe")
    private Integer ID_Equipe;
    @Column(name = "Annee")
    private Integer Annee;
    @Column(name = "Pays_Equipe")
    private String Pays_Equipe;


    public Equipe(Integer ID_Equipe, Integer Annee, String Pays_Equipe) {
        this.ID_Equipe = ID_Equipe;
        this.Annee = Annee;
        this.Pays_Equipe = Pays_Equipe;
    }


    public Integer getID_Equipe() {
        return this.ID_Equipe;
    }

    public void setID_Equipe(Integer ID_Equipe) {
        this.ID_Equipe = ID_Equipe;
    }

    public Integer getAnnee() {
        return this.Annee;
    }

    public void setAnnee(Integer Annee) {
        this.Annee = Annee;
    }

    public String getPays_Equipe() {
        return this.Pays_Equipe;
    }

    public void setPays_Equipe(String Pays_Equipe) {
        this.Pays_Equipe = Pays_Equipe;
    }

}
