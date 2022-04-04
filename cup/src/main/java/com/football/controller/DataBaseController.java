package com.football.controller;
import com.football.services.DataBase;
import com.football.controller.interfaces.DataHandler;

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
