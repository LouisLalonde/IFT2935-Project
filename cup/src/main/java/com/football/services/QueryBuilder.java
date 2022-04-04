package com.football.services;
import com.football.models.QueryModel;
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
