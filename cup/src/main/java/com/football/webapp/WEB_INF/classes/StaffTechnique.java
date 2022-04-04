package com.football.webapp.WEB_INF.classes;

/**
 * 
 */
public class StaffTechnique extends Personne{
    int anciennete;
    
    public StaffTechnique(String nom, String prenom, int anciennete){
        super(nom, prenom);
        this.anciennete = anciennete;
    }
}
