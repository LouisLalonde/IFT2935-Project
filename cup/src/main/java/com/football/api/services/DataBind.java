package com.football.api.services;
import com.football.api.models.DataBindModel;

/**
 * Handles the different mapping operations for the data
 */
public class DataBind {
    
    public DataBind(){};

    public DataBindModel DataBindModel(){
        return new DataBindModel();
    }
}
