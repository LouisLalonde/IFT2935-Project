package com.football.api.controller;
import java.util.HashMap;
import com.football.api.controller.interfaces.DataHandler;
import com.football.api.services.QueryBuilder;

public class QueryBuilderController implements DataHandler{

    public QueryBuilderController controller(){
        return new QueryBuilderController();
    }
    
    @Override
    public HashMap<String, Object> handle(HashMap<String, Object> data){
        // Handle the data
        return data;
    }

    public QueryBuilder queryBuilderService(){
        return new QueryBuilder();
    }

}
