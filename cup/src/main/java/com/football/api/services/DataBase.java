package com.football.api.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.DatabaseModel;
import com.football.api.models.QueryModel;
import com.football.api.models.ResponseModel;
import com.football.webapp.WEB_INF.classes.*;
import com.football.api.models.DataBindModel;
import java.util.ArrayList;
import java.util.HashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
/**
 * Handle the different data base operations
 */
public class DataBase {

    public enum Operation {
        CREATE,
        READ,
        UPDATE,
        DELETE
      }

    public DataBase(){};

    /**
     * 
     * @param operation
     * @param queryData
     * @return
     * @throws JsonProcessingException
     */
    public HashMap<String, Object> executeQuery(Session session, Operation operation, HashMap<String, String> queryData) throws JsonProcessingException{
        // Constructors
        ResponseModel responseModel = new ResponseModel();
        QueryModel queryModel = new QueryModel();
        // Data
        // Logic
        // Beginning the connection
        // SessionFactory factory =  DatabaseModel.buildSessionFactory();
        // Session session = factory.openSession();
        Transaction transaction = DatabaseModel.buildTransaction(session);

        switch(operation) {
            case CREATE:
                // Creating the query/object
                Object object =  queryModel.create(queryData);
                try {
                    // Executing the query
                    session.persist(object);
                    // commiting the transaction
                    DatabaseModel.commitTransaction(transaction);
                    return responseModel.success("");
                } catch(Exception e){
                    DatabaseModel.rollbackTransaction(transaction);
                    return responseModel.error(e);
                }
            case READ:
                try {
                    String queryNumber = queryData.get("queryNumber");
                    Class mapCalss = Class.forName(queryData.get("mapCalss"));

                    String readQuery =  queryModel.read(queryNumber);
                    Query query = session.createNativeQuery(readQuery, mapCalss);
                    ArrayList<Object> objects = (ArrayList<Object>) query.list();
                    // Serializing the return objects
                    String serialized = DataBindModel.serialize(objects);
                    // commiting the transaction
                    DatabaseModel.commitTransaction(transaction);
                    return responseModel.success(serialized);
                } catch(Exception e) {
                    DatabaseModel.rollbackTransaction(transaction);
                    return responseModel.error(e);
                }
            case UPDATE:
                try {
                    // commiting the transaction
                    DatabaseModel.commitTransaction(transaction);
                    return responseModel.success("");
                } catch (Exception e){
                    DatabaseModel.rollbackTransaction(transaction);
                    return responseModel.error(e);
                }
            case DELETE:
                try {
                    // commiting the transaction
                    DatabaseModel.commitTransaction(transaction);
                    return responseModel.success("");
                } catch (Exception e){
                    DatabaseModel.rollbackTransaction(transaction);
                    return responseModel.error(e);
                }
            default:
                return responseModel.error("Wrong operation");
          }
    }
}
