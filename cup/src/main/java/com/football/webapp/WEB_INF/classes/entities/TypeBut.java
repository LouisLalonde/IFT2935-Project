package com.football.webapp.WEB_INF.classes.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "TypeBut")
@Table(name = "Type_But", schema = "football")
public class TypeBut {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Type_But")
    private Integer ID_Type_But;
    @Column(name = "Nom_Type_But")
    private String Nom_Type_But;

    public TypeBut(){}

    public TypeBut(Integer ID_Type_But, String Nom_Type_But) {
        this.ID_Type_But = ID_Type_But;
        this.Nom_Type_But = Nom_Type_But;
    }


    public Integer getID_Type_But() {
        return this.ID_Type_But;
    }

    public void setID_Type_But(Integer ID_Type_But) {
        this.ID_Type_But = ID_Type_But;
    }

    public String getNom_Type_But() {
        return this.Nom_Type_But;
    }

    public void setNom_Type_But(String Nom_Type_But) {
        this.Nom_Type_But = Nom_Type_But;
    }

}
