package com.football.webapp.WEB_INF.classes.utility;
import java.util.HashMap;
import com.football.api.models.CrudOperators.Enum.Operation;

import org.hibernate.Session;

/**
 * Provides the logic for building a request object for the API service
 */
public class RequestObject {

    public RequestObject(){}

    /**
     * Use to create a request object for the API service
     * @param session : Hibernate sesson object
     * @param operation CRUD operation enum type
     * @param body : request transaction data
     * @return HashMap<String, Object>
     */
    public HashMap<String, Object> build(Session session, Operation operation, HashMap<String, String> body) {
        return new HashMap<String, Object>() {{
            put("operation", operation);
            put("session", session);
            put("body", body);
        }};
    }
}
