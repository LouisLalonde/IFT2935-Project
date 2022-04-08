package com.football.webapp.WEB_INF.classes;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public class Personne {

    @Column(name = "Prenom")
    private String Prenom;
    @Column(name = "Nom")
    private String Nom;
    @Column(name = "Date_Naissance")
    private String Date_Naissance;


    public Personne(String Prenom, String Nom, String Date_Naissance) {
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

    public String getDate_Naissance() {
        return this.Date_Naissance;
    }

    public void setDate_Naissance(String Date_Naissance) {
        this.Date_Naissance = Date_Naissance;
    }

}
