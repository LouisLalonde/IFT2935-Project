package main.java.com.companyname.project.controllers;
import main.java.com.companyname.project.controllers.interfaces.DataHandler;
import main.java.com.companyname.project.services.DataComputation;

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
