package com.football.api.services;
import com.football.api.models.QueryBuilderModel;

/**
 * Handles the different queries operations
 */
public class QueryBuilder {

    // CRUD operators from the JDBC driver

    public QueryBuilder(){};

    public QueryBuilderModel QueryModel(){
        return new QueryBuilderModel();
    }

    public String main(String query){
        return "";
    }

}
