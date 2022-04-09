package com.football.api.models;
import java.util.HashMap;
import com.football.api.models.CrudOperators.*;
import com.football.webapp.WEB_INF.classes.Student;
/**
 * Provides data logic processing for the QueryBuilder service
 */
public class QueryModel {

    public QueryModel(){};

    /**
     * 
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
     * 
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
              return "SELECT * FROM coupedumonde";
            case "2":
            // Query 2
              return "";
            case "3":
            // Query 3
                return "";
            case "4":
            // Query 4
                return "";
          }
        return "";
    }

    /**
     * 
     * @param query
     * @return
     */
    public String update(String query){
        // Constructors
        Update update = new Update();
        return "";
    }
    
    /**
     * 
     * @param query
     * @return
     */
    public String delete(String query){
        Delete delete = new Delete();
        return "";
    }
    
}
