package com.football.webapp.WEB_INF.classes;

public class TypeArbitre {
    private Integer ID_Type_Arbitre;
    private String Nom_Type_Arbitre;


    public TypeArbitre(Integer ID_Type_Arbitre, String Nom_Type_Arbitre) {
        this.ID_Type_Arbitre = ID_Type_Arbitre;
        this.Nom_Type_Arbitre = Nom_Type_Arbitre;
    }


    public Integer getID_Type_Arbitre() {
        return this.ID_Type_Arbitre;
    }

    public void setID_Type_Arbitre(Integer ID_Type_Arbitre) {
        this.ID_Type_Arbitre = ID_Type_Arbitre;
    }

    public String getNom_Type_Arbitre() {
        return this.Nom_Type_Arbitre;
    }

    public void setNom_Type_Arbitre(String Nom_Type_Arbitre) {
        this.Nom_Type_Arbitre = Nom_Type_Arbitre;
    }


}
