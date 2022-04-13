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
    private Integer idTypeBut;
    @Column(name = "Nom_Type_But")
    private String nomTypeBut;

    public TypeBut(){}


    public TypeBut(Integer idTypeBut, String nomTypeBut) {
        this.idTypeBut = idTypeBut;
        this.nomTypeBut = nomTypeBut;
    }
    

    public Integer getIdTypeBut() {
        return this.idTypeBut;
    }

    public void setIdTypeBut(Integer idTypeBut) {
        this.idTypeBut = idTypeBut;
    }

    public String getNomTypeBut() {
        return this.nomTypeBut;
    }

    public void setNomTypeBut(String nomTypeBut) {
        this.nomTypeBut = nomTypeBut;
    }    

}
