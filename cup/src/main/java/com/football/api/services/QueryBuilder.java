package com.football.api.services;
import com.football.api.models.QueryModel;
/**
 * Handles the different queries operations
 */
public class QueryBuilder {

    // CRUD operators from the JDBC driver

    public QueryBuilder(){};

    public QueryModel QueryModel(){
        return new QueryModel();
    }

    public String main(String query){
        return "";
    }


}
