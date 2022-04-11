package com.football.webapp.WEB_INF.classes.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "Staff")
@Table(name = "Staff", schema = "football")
public class Staff extends Personne{
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Staff")
    private Integer ID_Staff;
    @Column(name = "ID_Equipe")
    private Integer ID_Equipe;
    @Column(name = "Anciennete")
    private Integer Anciennete;

    public Staff(){}
    
    public Staff(String Prenom, String Nom, Date Date_Naissance) {
        super(Prenom, Nom, Date_Naissance);
    }

    public Staff(String Prenom, String Nom, Date Date_Naissance, Integer ID_Staff, Integer ID_Equipe, Integer Anciennete) {
        super(Prenom, Nom, Date_Naissance);
        this.ID_Staff = ID_Staff;
        this.ID_Equipe = ID_Equipe;
        this.Anciennete = Anciennete;
    }
    

    public Integer getID_Staff() {
        return this.ID_Staff;
    }

    public void setID_Staff(Integer ID_Staff) {
        this.ID_Staff = ID_Staff;
    }

    public Integer getID_Equipe() {
        return this.ID_Equipe;
    }

    public void setID_Equipe(Integer ID_Equipe) {
        this.ID_Equipe = ID_Equipe;
    }

    public Integer getAnciennete() {
        return this.Anciennete;
    }

    public void setAnciennete(Integer Anciennete) {
        this.Anciennete = Anciennete;
    }

}
