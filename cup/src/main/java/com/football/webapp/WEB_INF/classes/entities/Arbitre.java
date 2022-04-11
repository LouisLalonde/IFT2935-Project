package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Arbitre")
@Table(name = "Arbitre", schema = "football")
public class Arbitre extends Personne {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Arbitre")
    private Integer ID_Arbitre;
    @Column(name = "ID_Type_Arbitre")
    private Integer ID_Type_Arbitre;

    public Arbitre(){}

    public Arbitre(String Prenom, String Nom, Date Date_Naissance, Integer ID_Arbitre, Integer ID_Type_Arbitre) {
        super(Prenom, Nom, Date_Naissance);
        this.ID_Arbitre = ID_Arbitre;
        this.ID_Type_Arbitre = ID_Type_Arbitre;
    }

    public Integer getID_Arbitre() {
        return this.ID_Arbitre;
    }

    public void setID_Arbitre(Integer ID_Arbitre) {
        this.ID_Arbitre = ID_Arbitre;
    }

    public Integer getID_Type_Arbitre() {
        return this.ID_Type_Arbitre;
    }

    public void setID_Type_Arbitre(Integer ID_Type_Arbitre) {
        this.ID_Type_Arbitre = ID_Type_Arbitre;
    }

}
