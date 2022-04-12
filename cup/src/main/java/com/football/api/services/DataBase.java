package com.football.api.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.DatabaseModel;
import com.football.api.models.QueryBuilderModel;
import com.football.api.models.ResponseModel;
import com.football.api.models.CrudOperators.Enum.Operation;
import com.football.api.models.DataBindModel;
import java.util.ArrayList;
import java.util.HashMap;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 * Handle the different data base operations
 */
public class DataBase {
    private Session session;
    private Operation operation;
    private HashMap<String, String> queryData;

    public DataBase(){};

    public DataBase(HashMap<String, Object> data) throws JsonProcessingException{
        this.session = (Session) data.get("session");
        this.operation = (Operation) data.get("operation");
        this.queryData = (HashMap<String, String>) data.get("body");
    }

    /**
     * 
     * @return response object containing the related parameters in terms of the response
     * @throws JsonProcessingException
     */
    public HashMap<String, Object> executeQuery() throws JsonProcessingException{
        // Constructors
        ResponseModel responseModel = new ResponseModel();
        QueryBuilderModel queryModel = new QueryBuilderModel();
        // Data
        // Logic
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
                    Class mapClass = Class.forName(queryData.get("mapClass"));
                    String readQuery =  queryModel.read(queryNumber);
                    Query query = session.createNativeQuery(readQuery, mapClass);
                    ArrayList<Object> objects = (ArrayList<Object>) query.list();
                    //System.out.println(objects);
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
