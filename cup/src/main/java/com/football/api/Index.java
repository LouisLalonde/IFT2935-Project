package com.football.api;
import com.football.api.controller.DataBaseController;
import com.football.api.controller.QueryBuilderController;
import com.football.api.models.DatabaseModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

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

    public Session startApi(){
        SessionFactory factory =  DatabaseModel.buildSessionFactory();
        Session session = factory.openSession();
        System.out.println("⚡️[server]: Server listening on the port::" + port);
        return session;
    }
}
