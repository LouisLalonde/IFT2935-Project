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
    private Integer idEquipe;
    @Column(name = "Pays_Equipe")
    private String paysEquipe;


    public Equipe(){}


    public Equipe(Integer idEquipe, String paysEquipe) {
        this.idEquipe = idEquipe;
        this.paysEquipe = paysEquipe;
    }

    public Integer getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getPaysEquipe() {
        return this.paysEquipe;
    }

    public void setPaysEquipe(String paysEquipe) {
        this.paysEquipe = paysEquipe;
    }
    
}
