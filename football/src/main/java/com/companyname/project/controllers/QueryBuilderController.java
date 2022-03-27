package main.java.com.companyname.project.controllers;

import main.java.com.companyname.project.controllers.interfaces.DataHandler;
import main.java.com.companyname.project.services.QueryBuilder;

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