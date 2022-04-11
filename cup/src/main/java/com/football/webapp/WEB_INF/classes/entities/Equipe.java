package com.football.webapp.WEB_INF.classes.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "Equipe")
@Table(name = "Equipe", schema = "football")
public class Equipe {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Equipe")
    private Integer ID_Equipe;
    @Column(name = "Pays_Equipe")
    private String Pays_Equipe;


    public Equipe(){}


    public Equipe(Integer ID_Equipe, String Pays_Equipe) {
        this.ID_Equipe = ID_Equipe;
        this.Pays_Equipe = Pays_Equipe;
    }


    public Integer getID_Equipe() {
        return this.ID_Equipe;
    }

    public void setID_Equipe(Integer ID_Equipe) {
        this.ID_Equipe = ID_Equipe;
    }

    public String getPays_Equipe() {
        return this.Pays_Equipe;
    }

    public void setPays_Equipe(String Pays_Equipe) {
        this.Pays_Equipe = Pays_Equipe;
    }

}
