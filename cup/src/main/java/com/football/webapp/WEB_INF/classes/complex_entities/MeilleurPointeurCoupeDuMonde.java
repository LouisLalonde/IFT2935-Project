package com.football.webapp.WEB_INF.classes.complex_entities;
import java.sql.Date;
import com.football.webapp.WEB_INF.classes.entities.Personne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "MeilleurPointeurCoupeDuMonde")
public class MeilleurPointeurCoupeDuMonde extends Personne {
    @Id
    @Column(name = "Pays_Equipe")
    private String Pays_Equipe;

    public MeilleurPointeurCoupeDuMonde(){}

    public MeilleurPointeurCoupeDuMonde(String Prenom, String Nom, Date Date_Naissance, String Pays_Equipe){
        super(Prenom, Nom, Date_Naissance);
        this.Pays_Equipe = Pays_Equipe;
    }

    public String getPays_Equipe() {
        return this.Pays_Equipe;
    }

    public void setPays_Equipe(String Pays_Equipe) {
        this.Pays_Equipe = Pays_Equipe;
    }


}
