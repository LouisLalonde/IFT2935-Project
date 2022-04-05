package com.football.api;
import com.football.api.controller.DataBaseController;
import com.football.api.controller.DataComputationController;
import com.football.api.controller.QueryBuilderController;

/**
 * Main class for the API
 */
public class Index {
    String port = "3080";
    
    public Index(){};

    public DataBaseController appUseDataBase(){
        return new DataBaseController();
    }

    public QueryBuilderController appUseQueryBuilder(){
        return new QueryBuilderController();
    }
    
    public DataComputationController appUseDataComputation(){
        return new DataComputationController();
    }

    public void startApi(){
        System.out.println("⚡️[server]: Server listening on the port::" + port);
    }
}
