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
    private Integer idTypeArbitre;
    @Column(name = "Nom_Type_Arbitre")
    private String nomTypeArbitre;

    public TypeArbitre(){}


    public TypeArbitre(Integer idTypeArbitre, String nomTypeArbitre) {
        this.idTypeArbitre = idTypeArbitre;
        this.nomTypeArbitre = nomTypeArbitre;
    }
    

    public Integer getIdTypeArbitre() {
        return this.idTypeArbitre;
    }

    public void setIdTypeArbitre(Integer idTypeArbitre) {
        this.idTypeArbitre = idTypeArbitre;
    }

    public String getNomTypeArbitre() {
        return this.nomTypeArbitre;
    }

    public void setNomTypeArbitre(String nomTypeArbitre) {
        this.nomTypeArbitre = nomTypeArbitre;
    }    


}
