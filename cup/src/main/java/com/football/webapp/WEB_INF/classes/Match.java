package com.football.webapp.WEB_INF.classes;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */
public class Match {
    String lieu;
    int rang;
    ArrayList<String> equipes_participantes;
    // Nom equipe = score
    HashMap<String, Integer> score_final;
    String arbitre_principal;
    ArrayList<String> arbitres_assistants;

}
