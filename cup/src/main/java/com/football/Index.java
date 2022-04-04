package com.football;
import com.football.controller.DataBaseController;
import com.football.controller.DataComputationController;
import com.football.controller.QueryBuilderController;

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
    
    public DataComputationController appUseQuComputation(){
        return new DataComputationController();
    }

    public void startApi(){
        System.out.println("⚡️[server]: Server listening on the port::" + port);
    }
}
