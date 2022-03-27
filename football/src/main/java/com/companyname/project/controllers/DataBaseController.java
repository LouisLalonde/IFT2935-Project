package main.java.com.companyname.project.controllers;

import main.java.com.companyname.project.controllers.interfaces.DataHandler;
import main.java.com.companyname.project.services.DataBase;

public class DataBaseController implements DataHandler{

    public DataBaseController controller(){
        return new DataBaseController();
    }
    
    @Override
    public String handle(String data){
        // Handle the data
        return data;
    }

    public DataBase dataBaseService(){
        return new DataBase();
    }
    
}
