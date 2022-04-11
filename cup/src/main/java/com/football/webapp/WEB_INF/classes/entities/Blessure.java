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
    private Integer ID_Blessure;
    @Column(name = "ID_Joueur")
    private Integer ID_Joueur;
    @Column(name = "Diagnostic")
    private String Diagnostic;
    @Column(name = "Date")
    private Date Date;

    public Blessure(){}

    public Blessure(Integer ID_Blessure, Integer ID_Joueur, String Diagnostic, Date Date) {
        this.ID_Blessure = ID_Blessure;
        this.ID_Joueur = ID_Joueur;
        this.Diagnostic = Diagnostic;
        this.Date = Date;
    }


    public Integer getID_Blessure() {
        return this.ID_Blessure;
    }

    public void setID_Blessure(Integer ID_Blessure) {
        this.ID_Blessure = ID_Blessure;
    }

    public Integer getID_Joueur() {
        return this.ID_Joueur;
    }

    public void setID_Joueur(Integer ID_Joueur) {
        this.ID_Joueur = ID_Joueur;
    }

    public String getDiagnostic() {
        return this.Diagnostic;
    }

    public void setDiagnostic(String Diagnostic) {
        this.Diagnostic = Diagnostic;
    }

    public Date getDate() {
        return this.Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

}
