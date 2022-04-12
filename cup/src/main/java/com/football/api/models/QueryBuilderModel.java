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
              return "SELECT * FROM football.coupedumonde;";
            case "2":
            // Query 2
              return "SELECT * FROM football.joueur;";
            case "3":
            // Query 3
                return "with " + 
                "R1 as (select ID_Arbitre from football.Arbitre where(Prenom='Clement' AND Nom='Turpin'))," +  
                "R2 as (select * from football.Type_Sanction where(Nom_Type_Sanction='Carton Jaune')), " +
                "R3 as (select * from R2 natural join football.Sanction), " +
                "R4 as (select * from R1 natural join R3) " +
                "select count(nom_type_sanction) from R4 group by id_arbitre;";
            case "4":
            // Query 4
                return "SELECT * from football.Arbitre";
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
