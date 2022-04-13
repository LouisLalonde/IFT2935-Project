package com.football.webapp.WEB_INF.classes.entities;
import java.sql.Date;
import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "CoupeDuMonde")
@Table(name = "CoupeDuMonde", schema = "football")
public class CoupeDuMonde {
    @GenericGenerator(name = "generator", strategy = "increment")
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "Annee")
    private Integer annee; 
    @Column(name = "Pays_Coupe")
    private String paysCoupe; 
    @Column(name = "Start_Date")
    private Date startDate; 
    @Column(name = "End_date")
    private Date endDate;

    public CoupeDuMonde(){}


    public CoupeDuMonde(Integer annee, String paysCoupe, Date startDate, Date endDate) {
        this.annee = annee;
        this.paysCoupe = paysCoupe;
        this.startDate = startDate;
        this.endDate = endDate;
    }


    public Integer getAnnee() {
        return this.annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getPaysCoupe() {
        return this.paysCoupe;
    }

    public void setPaysCoupe(String paysCoupe) {
        this.paysCoupe = paysCoupe;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
}
