package main.java.com.companyname.project.services;
import main.java.com.companyname.project.models.ProxyModel;
/**
 * Handle the different data base operations
 */
public class DataBase {

    public DataBase(){};

    // Execute the query with the JDBC driver
    public void executeQuery(String query){
        // Execute
    }

    public void init(String schema){
        ProxyModel proxy = new ProxyModel();
        proxy.initSchema(schema);
    }
    
}
