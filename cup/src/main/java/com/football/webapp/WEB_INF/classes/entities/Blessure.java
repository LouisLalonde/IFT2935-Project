package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Blessure")
@Table(name = "Blessure", schema = "football")
public class Blessure {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "ID_Blessure")
    private Integer idBlessure;
    @Column(name = "ID_Joueur")
    private Integer idJoueur;
    @Column(name = "Diagnostic")
    private String diagnostic;
    @Column(name = "Date")
    private Date date;

    public Blessure(){}


    public Blessure(Integer idBlessure, Integer idJoueur, String diagnostic, Date date) {
        this.idBlessure = idBlessure;
        this.idJoueur = idJoueur;
        this.diagnostic = diagnostic;
        this.date = date;
    }
    

    public Integer getIdBlessure() {
        return this.idBlessure;
    }

    public void setIdBlessure(Integer idBlessure) {
        this.idBlessure = idBlessure;
    }

    public Integer getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(Integer idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getDiagnostic() {
        return this.diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
