package com.football.api.controller;
import com.football.api.controller.interfaces.DataHandler;
import com.football.api.services.DataComputation;

public class DataComputationController implements DataHandler {

    public DataComputationController controller(){
        return new DataComputationController();
    }
    
    @Override
    public String handle(String data){
        // Handle the data
        return data;
    }

    public DataComputation dataComputationService(){
        return new DataComputation();
    }
    
}
