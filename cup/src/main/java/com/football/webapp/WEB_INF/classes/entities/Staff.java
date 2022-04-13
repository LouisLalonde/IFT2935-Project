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
    private Integer idStaff;
    @Column(name = "ID_Equipe")
    private Integer idEquipe;
    @Column(name = "Anciennete")
    private Integer anciennete;

    public Staff(){}

    public Staff(String prenom, String nom, Date dateNaissance, Integer idStaff, Integer idEquipe, Integer anciennete) {
        super(prenom, nom, dateNaissance);
        this.idStaff = idStaff;
        this.idEquipe = idEquipe;
        this.anciennete = anciennete;
    }


    public Integer getIdStaff() {
        return this.idStaff;
    }

    public void setIdStaff(Integer idStaff) {
        this.idStaff = idStaff;
    }

    public Integer getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(Integer idEquipe) {
        this.idEquipe = idEquipe;
    }

    public Integer getAnciennete() {
        return this.anciennete;
    }

    public void setAnciennete(Integer anciennete) {
        this.anciennete = anciennete;
    }

}
