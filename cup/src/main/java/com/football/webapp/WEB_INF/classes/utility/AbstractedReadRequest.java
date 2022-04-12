package com.football.webapp.WEB_INF.classes.utility;
import java.util.ArrayList;
import java.util.HashMap;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.DataBindModel;
import com.football.api.models.CrudOperators.Enum.Operation;
import com.football.webapp.WEB_INF.services.UserService;

import org.hibernate.Session;

public class AbstractedReadRequest {
    
    public <T> ArrayList<T> execute(Session session, Operation operation, String queryNumber,
    Class classType) throws JsonProcessingException{
        try {
            UserService userService = new UserService();
            HashMap<String, Object> requestObject = new RequestObject().build(session, operation,
                new HashMap<String, String>() {{
                put("queryNumber", queryNumber);
                put("mapClass", classType.getName());
                }}
            );
    
            HashMap<String, Object> res =  userService.appUseServices(requestObject).appUseDataBase().dataBaseService().executeQuery();
            String jsonObjects = (String) res.get("body");
            // Converting the json objects to the given class
            return DataBindModel.deserialize(jsonObjects, classType);
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
