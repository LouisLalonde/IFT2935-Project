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
    private Integer idTypeSanction;
    @Column(name = "Nom_Type_Sanction")
    private String nomTypeSanction;

    public TypeSanction(){}

    public TypeSanction(Integer idTypeSanction, String nomTypeSanction) {
        this.idTypeSanction = idTypeSanction;
        this.nomTypeSanction = nomTypeSanction;
    }

    public Integer getIdTypeSanction() {
        return this.idTypeSanction;
    }

    public void setIdTypeSanction(Integer idTypeSanction) {
        this.idTypeSanction = idTypeSanction;
    }

    public String getNomTypeSanction() {
        return this.nomTypeSanction;
    }

    public void setNomTypeSanction(String nomTypeSanction) {
        this.nomTypeSanction = nomTypeSanction;
    }

}
