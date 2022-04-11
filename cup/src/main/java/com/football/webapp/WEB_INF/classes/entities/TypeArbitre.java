package com.football.webapp.WEB_INF.classes.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "TypeArbitre")
@Table(name = "Type_Arbitre", schema = "football")
public class TypeArbitre {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Type_Arbitre")
    private Integer ID_Type_Arbitre;
    @Column(name = "Nom_Type_Arbitre")
    private String Nom_Type_Arbitre;

    public TypeArbitre(){}

    public TypeArbitre(Integer ID_Type_Arbitre, String Nom_Type_Arbitre) {
        this.ID_Type_Arbitre = ID_Type_Arbitre;
        this.Nom_Type_Arbitre = Nom_Type_Arbitre;
    }


    public Integer getID_Type_Arbitre() {
        return this.ID_Type_Arbitre;
    }

    public void setID_Type_Arbitre(Integer ID_Type_Arbitre) {
        this.ID_Type_Arbitre = ID_Type_Arbitre;
    }

    public String getNom_Type_Arbitre() {
        return this.Nom_Type_Arbitre;
    }

    public void setNom_Type_Arbitre(String Nom_Type_Arbitre) {
        this.Nom_Type_Arbitre = Nom_Type_Arbitre;
    }


}
