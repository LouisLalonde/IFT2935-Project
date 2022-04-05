package com.football.api.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.DatabaseModel;
import com.football.api.models.QueryModel;
import org.hibernate.query.Query;
import com.football.api.models.ResponseModel;
import com.football.webapp.WEB_INF.classes.Student;
import com.football.api.models.DataBindModel;
import java.util.ArrayList;
import java.util.HashMap;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
     * Execute an postegres init request to populate the data base with
     * the project schema
     * @param schema
     * @return
     */
    public HashMap<String, Object> init(String schema){
        // Constructors
        DatabaseModel databaseModel = new DatabaseModel();
        ResponseModel responseModel = new ResponseModel();
        // Data
        // Logic
        databaseModel.initSchema(schema);
        return responseModel.success("200", "");
        
    }

    /**
     * Execute the query with the JDBC driver
     * @param query
     * @return
     * @throws JsonProcessingException
     */
    public HashMap<String, Object> executeQuery(Operation operation, String queryData) throws JsonProcessingException{
        // Constructors
        ResponseModel responseModel = new ResponseModel();
        QueryModel queryModel = new QueryModel();
        // Data
        // Logic
        // Beginning the connection
        SessionFactory factory =  DatabaseModel.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = DatabaseModel.buildTransaction(session);

        switch(operation) {
            case CREATE:
                // Creating the query/object
                Student student =  queryModel.create("");
                // Executing the query
                session.persist(student);
                // Closing the connexion
                DatabaseModel.endTransaction(session, transaction);
                return responseModel.success("200", "");
            case READ:
                String readQuery =  queryModel.read(queryData);
                Query query = session.createNativeQuery(readQuery, Student.class);
                ArrayList<Object> objects = (ArrayList<Object>) query.list();
                // Serializing the return objects
                String serialized = DataBindModel.serialize(objects);
                
                return responseModel.success("200", serialized);
            case UPDATE:

                return responseModel.success("200", "");
            case DELETE:

                return responseModel.success("200", "");
            default:
                return responseModel.success("400", "");
          }
    }
}
