package com.football.controller;
import com.football.controller.interfaces.DataHandler;
import com.football.services.QueryBuilder;

public class QueryBuilderController implements DataHandler{

    public QueryBuilderController controller(){
        return new QueryBuilderController();
    }

    @Override
    public String handle(String data){
        // Handle the data
        return data;
    }

    public QueryBuilder queryBuilderService(){
        return new QueryBuilder();
    }

}
