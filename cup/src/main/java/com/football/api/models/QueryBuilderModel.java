package com.football.api.models;
import java.util.HashMap;
import com.football.api.models.CrudOperators.*;
/**
 * Provides data logic processing for the QueryBuilder service
 */
public class QueryBuilderModel {

    public QueryBuilderModel(){};

    /**
     * Build a create query
     * @param queryData
     * @return
     */
    public Object create(HashMap<String, String> queryData){
        // Constructors
        Create create = new Create();
        // Logic
        return "";
    }

    /**
     * Build a read query
     * @param queryNumber
     * @return
     */
    public String read(String queryNumber){
        // Constructors
        Read read = new Read();
        // Logic
        switch(queryNumber) {
            case "1":
            // Query 1   
            //return  "with R1 as (select ID_Arbitre from football.Arbitre where(Prenom='Clement' AND Nom='Turpin')) select * from R1;";         
            return "with R1 as (select ID_Arbitre from football.Arbitre where(Prenom='Clement' AND Nom='Turpin')), R2 as (select ID_arbitre, nom_type_sanction from football.Sanction,football.Type_sanction where(type_sanction.id_type_sanction = sanction.id_type_sanction AND type_sanction.Nom_Type_Sanction='Carton Jaune')), R3 as (select ID_arbitre, nom_type_sanction from r2 natural join r1), R4 as (select count(nom_type_sanction) as nbr_carton_jaune from R3 group by (ID_Arbitre)) select * from R4;";
            case "2":
            // Query 2
              return "with r1 as ( select ID_Match from football.Match where(Match.Annee >= 1966 AND Match.Annee <= 1978)), r2 as (select id_match,id_but,buteur from football.But natural join r1), r3 as (select count(ID_Match) as nb_but,Buteur from r2 group by(Buteur)), r4 as (select max(nb_but) from r3), r5 as (select Buteur from r3 inner join r4 on (r3.nb_but = r4.max)), r6 as (select Prenom, Nom, ID_Joueur, ID_Equipe from football.Joueur inner join r5 on (Joueur.ID_Joueur = r5.buteur)), r7 as (select Prenom, Nom,pays_equipe from r6 natural join football.Equipe) select * from r7; ";
            case "3":
            // Query 3
                return "with r1 as (select ID_Match, Equipe_Gagnante, Equipe_Perdante, Arbitre, Annee from football.Match where (Annee = 1974)), r2 as (select id_match,nom_type_but from football.But,football.Type_But where(But.id_type_but = Type_But.id_type_but AND Type_But.Nom_Type_But = 'Penalty')), r3 as (select arbitre,equipe_gagnante,equipe_perdante from r1 natural join r2), r4 as (select Equipe1.Pays_Equipe as Equipe_Gagnante, Equipe2.Pays_Equipe as Equipe_Perdante, Arbitre.Nom, Arbitre.Prenom from r3 join football.Equipe as Equipe1 on (r3.Equipe_Gagnante = Equipe1.ID_Equipe) join football.Equipe as Equipe2 on (r3.Equipe_Perdante = Equipe2.ID_Equipe) join football.Arbitre on(r3.Arbitre=Arbitre.ID_Arbitre)) select * from r4; ";
            case "4":
            // Query 4
                return "with r1 as (select ID_Match, Annee from football.Match where (Annee = 1978)), r2 as (select Buteur, Temps, ID_Match, ID_But from football.But, football.Joueur where (But.Buteur = Joueur.ID_Joueur AND Joueur.Poste = 'milieu_centre' AND But.Temps > '00:09:00')), r3 as (select id_but,annee from r2 join r1 on (r2.ID_Match = r1.ID_Match)) select count(ID_But) as nbr_but from r3 group by (Annee); ";
          }
        return "";
    }

    /**
     * Build an update query
     * @param query
     * @return
     */
    public String update(String query){
        // Constructors
        Update update = new Update();
        return "";
    }
    
    /**
     * Build a delete query
     * @param query
     * @return
     */
    public String delete(String query){
        Delete delete = new Delete();
        return "";
    }
    
}
