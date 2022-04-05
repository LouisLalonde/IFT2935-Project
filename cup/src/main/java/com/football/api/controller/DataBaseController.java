package com.football.api.controller;
import com.football.api.services.DataBase;
import com.football.api.services.DataBind;
import com.football.api.controller.interfaces.DataHandler;

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

    public DataBind dataBindService(){
        return new DataBind();
    }
    
}
