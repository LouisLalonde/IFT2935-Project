package com.football.webapp.WEB_INF.classes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "CoupeDuMonde")
public class CoupeDuMonde {
    @Column(name = "Annee")
    private String Annee; 
    @Column(name = "Pays_Coupe")
    private String Pays_Coupe; 
    @Column(name = "Start_Date")
    private String Start_Date; 
    @Column(name = "End_date")
    private String End_date;

    public CoupeDuMonde(String Annee, String Pays_Coupe, String Start_Date, String End_date){
        this.Annee = Annee;
        this.Pays_Coupe = Pays_Coupe;
        this.Start_Date = Start_Date;
        this.End_date = End_date;
    }


    public String getAnnee() {
        return this.Annee;
    }

    public void setAnnee(String Annee) {
        this.Annee = Annee;
    }

    public String getPays_Coupe() {
        return this.Pays_Coupe;
    }

    public void setPays_Coupe(String Pays_Coupe) {
        this.Pays_Coupe = Pays_Coupe;
    }

    public String getStart_Date() {
        return this.Start_Date;
    }

    public void setStart_Date(String Start_Date) {
        this.Start_Date = Start_Date;
    }

    public String getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(String End_date) {
        this.End_date = End_date;
    }

}
