package com.football.api;
import java.util.HashMap;

import com.football.api.controller.DataBaseController;
import com.football.api.controller.QueryBuilderController;
import com.football.api.models.DatabaseModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Main class for the API
 */
public class Index {
    private String port = "3080";
    private HashMap<String, Object> data;

    public Index(){};

    public Index(HashMap<String, Object> data){
        this.data = data;
    }
    

    public DataBaseController appUseDataBase(){
        return new DataBaseController(data);
    }

    public QueryBuilderController appUseQueryBuilder(){
        return new QueryBuilderController();
    }
    
    public Session startApi(){
        SessionFactory factory =  DatabaseModel.buildSessionFactory();
        Session session = factory.openSession();
        System.out.println("⚡️[server]: Server listening on the port::" + port);
        return session;
    }
}
