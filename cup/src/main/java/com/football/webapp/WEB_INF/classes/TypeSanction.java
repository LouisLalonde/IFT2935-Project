package com.football.webapp.WEB_INF.classes;

public class TypeSanction {
    private Integer ID_Type_Sanction;
    private String Nom_Type_Sanction;


    public TypeSanction(Integer ID_Type_Sanction, String Nom_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
        this.Nom_Type_Sanction = Nom_Type_Sanction;
    }


    public Integer getID_Type_Sanction() {
        return this.ID_Type_Sanction;
    }

    public void setID_Type_Sanction(Integer ID_Type_Sanction) {
        this.ID_Type_Sanction = ID_Type_Sanction;
    }

    public String getNom_Type_Sanction() {
        return this.Nom_Type_Sanction;
    }

    public void setNom_Type_Sanction(String Nom_Type_Sanction) {
        this.Nom_Type_Sanction = Nom_Type_Sanction;
    }

}
