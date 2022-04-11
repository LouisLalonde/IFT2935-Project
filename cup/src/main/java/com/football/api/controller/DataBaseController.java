package com.football.api.controller;
import com.football.api.services.DataBase;
import com.football.api.services.DataBind;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.controller.interfaces.DataHandler;

public class DataBaseController implements DataHandler{
    private HashMap<String, Object> data;

    public DataBaseController(){}

    public DataBaseController(HashMap<String, Object> data) {
        this.data = handle(data);
    }
    
    
    @Override
    public HashMap<String, Object> handle(HashMap<String, Object> data){
        // Handle the data
        if (data.containsKey("session") & data.containsKey("operation") & data.containsKey("body")) {
            return data;
        } else {
            return null;
        }
    }

    public DataBase dataBaseService() throws JsonProcessingException{
        return new DataBase(data);
    }

    public DataBind dataBindService(){
        return new DataBind();
    }
    
}
