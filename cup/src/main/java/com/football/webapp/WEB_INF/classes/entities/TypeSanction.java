package com.football.webapp.WEB_INF.classes.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "TypeSanction")
@Table(name = "Type_Sanction", schema = "football")
public class TypeSanction {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Type_Sanction")
    private Integer ID_Type_Sanction;
    @Column(name = "Nom_Type_Sanction")
    private String Nom_Type_Sanction;

    public TypeSanction(){}

    public TypeSanction(Integer ID_Type_Sanction, String Nom_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
        this.Nom_Type_Sanction = Nom_Type_Sanction;
    }


    public Integer getID_Type_Sanction() {
        return this.ID_Type_Sanction;
    }

    public void setID_Type_Sanction(Integer ID_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
    }

    public String getNom_Type_Sanction() {
        return this.Nom_Type_Sanction;
    }

    public void setNom_Type_Sanction(String Nom_Type_Sanction) {
        this.Nom_Type_Sanction = Nom_Type_Sanction;
    }

}
