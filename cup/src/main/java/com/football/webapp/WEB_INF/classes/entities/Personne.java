package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Personne {
    @Column(name = "Prenom")
    private String prenom;
    @Column(name = "Nom")
    private String nom;
    @Column(name = "Date_Naissance")
    private Date dateNaissance;

    public Personne(){}


    public Personne(String prenom, String nom, Date dateNaissance) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
    }
    
    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateNaissance() {
        return this.dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    

}
