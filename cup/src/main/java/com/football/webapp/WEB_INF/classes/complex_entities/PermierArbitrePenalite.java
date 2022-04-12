package com.football.webapp.WEB_INF.classes.complex_entities;
import com.football.webapp.WEB_INF.classes.entities.Personne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity(name = "PermierArbitre")
public class PermierArbitrePenalite extends Personne{
    @Id
    @Column(name = "Equipe_Gagnante")
    private String Equipe_Gagnante;
    @Column(name = "Equipe_Perdante")
    private String Equipe_Perdante;

    public PermierArbitrePenalite(){}
    

    public PermierArbitrePenalite(String Prenom, String Nom, Date Date_Naissance, String Equipe_Gagnante, String Equipe_Perdante) {
        super(Prenom, Nom, Date_Naissance);
        this.Equipe_Gagnante = Equipe_Gagnante;
        this.Equipe_Perdante = Equipe_Perdante;
    }


    public String getEquipe_Gagnante() {
        return this.Equipe_Gagnante;
    }

    public void setEquipe_Gagnante(String Equipe_Gagnante) {
        this.Equipe_Gagnante = Equipe_Gagnante;
    }

    public String getEquipe_Perdante() {
        return this.Equipe_Perdante;
    }

    public void setEquipe_Perdante(String Equipe_Perdante) {
        this.Equipe_Perdante = Equipe_Perdante;
    }
    

}
