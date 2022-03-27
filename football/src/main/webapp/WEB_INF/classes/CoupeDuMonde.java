package main.webapp.WEB_INF.classes;

import java.util.ArrayList;

/**
 * 
 */
public class CoupeDuMonde {
    Date date;
    String lieu;
    String meteo;
    int cout;
    ArrayList<Equipe> equipes;

    public CoupeDuMonde(Date date, String lieu, String meteo, int cout, ArrayList<Equipe> equipes){
        this.date = date;
        this.lieu = lieu;
        this.meteo = meteo;
        this.cout = cout;
        this.equipes = equipes;
    }
    
}
