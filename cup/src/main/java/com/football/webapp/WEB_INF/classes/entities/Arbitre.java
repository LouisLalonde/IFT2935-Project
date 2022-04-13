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
    private Integer idArbitre;
    @Column(name = "ID_Type_Arbitre")
    private Integer idTypeArbitre;

    public Arbitre(){}


    public Arbitre(String prenom, String nom, Date dateNaissance, Integer idArbitre, Integer idTypeArbitre) {
        super(prenom, nom, dateNaissance);
        this.idArbitre = idArbitre;
        this.idTypeArbitre = idTypeArbitre;
    }


    public Integer getIdArbitre() {
        return this.idArbitre;
    }

    public void setIdArbitre(Integer idArbitre) {
        this.idArbitre = idArbitre;
    }

    public Integer getIdTypeArbitre() {
        return this.idTypeArbitre;
    }

    public void setIdTypeArbitre(Integer idTypeArbitre) {
        this.idTypeArbitre = idTypeArbitre;
    }

}
