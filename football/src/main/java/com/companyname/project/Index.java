package main.java.com.companyname.project;

import main.java.com.companyname.project.controllers.DataBaseController;
import main.java.com.companyname.project.controllers.DataComputationController;
import main.java.com.companyname.project.controllers.QueryBuilderController;
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
