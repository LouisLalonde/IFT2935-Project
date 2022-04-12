package com.football.webapp.WEB_INF.classes.ComplexEntities;
import com.football.webapp.WEB_INF.classes.entities.Personne;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.sql.Date;

@Entity(name = "PermierArbitre")
public class PermierArbitre extends Personne{
    @Column(name = "Equipe_Gagnante")
    private Integer Equipe_Gagnante;
    @Column(name = "Equipe_Perdante")
    private Integer Equipe_Perdante;
    

    public PermierArbitre(String Prenom, String Nom, Date Date_Naissance, Integer Equipe_Gagnante, Integer Equipe_Perdante) {
        super(Prenom, Nom, Date_Naissance);
        this.Equipe_Gagnante = Equipe_Gagnante;
        this.Equipe_Perdante = Equipe_Perdante;
    }


    public Integer getEquipe_Gagnante() {
        return this.Equipe_Gagnante;
    }

    public void setEquipe_Gagnante(Integer Equipe_Gagnante) {
        this.Equipe_Gagnante = Equipe_Gagnante;
    }

    public Integer getEquipe_Perdante() {
        return this.Equipe_Perdante;
    }

    public void setEquipe_Perdante(Integer Equipe_Perdante) {
        this.Equipe_Perdante = Equipe_Perdante;
    }

}
