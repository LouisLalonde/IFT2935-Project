package com.football.webapp.WEB_INF.classes;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Personne {
    @Column(name = "Prenom")
    private String Prenom;
    @Column(name = "Nom")
    private String Nom;
    @Column(name = "Date_Naissance")
    private Date Date_Naissance;

    public Personne(String Prenom, String Nom, Date Date_Naissance) {
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.Date_Naissance = Date_Naissance;
    }


    public String getPrenom() {
        return this.Prenom;
    }

    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    public String getNom() {
        return this.Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public Date getDate_Naissance() {
        return this.Date_Naissance;
    }

    public void setDate_Naissance(Date Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

}
