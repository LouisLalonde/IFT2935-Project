package com.football.services;
import com.football.models.DatabaseModel;
import com.football.models.ResponseModel;
import java.io.IOException;
import java.util.HashMap;

/**
 * Handle the different data base operations
 */
public class DataBase {

    public DataBase(){};

    /**
     * Execute the query with the JDBC driver
     * @param query
     * @return
     */
    public HashMap<String, String> executeQuery(String query){
        // Constructors
        ResponseModel responseModel = new ResponseModel();
        // Data
        // Logic
        return responseModel.success("200", "");
    }

    public HashMap<String, String> init(String schema){
        // Constructors
        DatabaseModel databaseModel = new DatabaseModel();
        ResponseModel responseModel = new ResponseModel();
        // Data
        // Logic
        databaseModel.initSchema(schema);
        return responseModel.success("200", "");
        
    }

    public HashMap<String, String> getDataBaseConfig() throws IOException{
        // Constructors
        DatabaseModel databaseModel = new DatabaseModel();
        ResponseModel responseModel = new ResponseModel();
        // Data
        // Logic
        HashMap<String,String> config = databaseModel.getPropValues();

        return responseModel.success("200", config.toString());
    }
    
}
