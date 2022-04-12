package com.football.webapp.WEB_INF.classes.ComplexEntities;
import java.sql.Date;
import com.football.webapp.WEB_INF.classes.entities.Personne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "Equipe")
public class MeilleurPointeurCoupeDuMonde extends Personne {
    @Column(name = "Pays_Equipe")
    private String Pays_Equipe;

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
