package com.football.webapp.WEB_INF.classes;

public class TypeBut {
    private Integer ID_Type_But;
    private String Nom_Type_But;


    public TypeBut(Integer ID_Type_But, String Nom_Type_But) {
        this.ID_Type_But = ID_Type_But;
        this.Nom_Type_But = Nom_Type_But;
    }


    public Integer getID_Type_But() {
        return this.ID_Type_But;
    }

    public void setID_Type_But(Integer ID_Type_But) {
        this.ID_Type_But = ID_Type_But;
    }

    public String getNom_Type_But() {
        return this.Nom_Type_But;
    }

    public void setNom_Type_But(String Nom_Type_But) {
        this.Nom_Type_But = Nom_Type_But;
    }

}
