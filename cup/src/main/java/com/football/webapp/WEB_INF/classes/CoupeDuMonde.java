package com.football.webapp.WEB_INF.classes;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "CoupeDuMonde")
public class CoupeDuMonde {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "Annee")
    private Integer Annee; 
    @Column(name = "Pays_Coupe")
    private String Pays_Coupe; 
    @Column(name = "Start_Date")
    private Date Start_Date; 
    @Column(name = "End_date")
    private Date End_date;

    public CoupeDuMonde() {}    

    public CoupeDuMonde(Integer Annee, String Pays_Coupe, Date Start_Date, Date End_date) {
        this.Annee = Annee;
        this.Pays_Coupe = Pays_Coupe;
        this.Start_Date = Start_Date;
        this.End_date = End_date;
    }


    public Integer getAnnee() {
        return this.Annee;
    }

    public void setAnnee(Integer Annee) {
        this.Annee = Annee;
    }

    public String getPays_Coupe() {
        return this.Pays_Coupe;
    }

    public void setPays_Coupe(String Pays_Coupe) {
        this.Pays_Coupe = Pays_Coupe;
    }

    public Date getStart_Date() {
        return this.Start_Date;
    }

    public void setStart_Date(Date Start_Date) {
        this.Start_Date = Start_Date;
    }

    public Date getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
    }

}
