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
     * @param session Hibernate sesson object
     * @param operation CRUD operation enum type
     * @param queryNumber Number of the query to be mapped in the switch case
     * @param classType Returned data class type from the SQL query
     * @return HashMap<String, Object>
     */
    public HashMap<String, Object> build(Session session, Operation operation, String queryNumber,
     Class classType) {
        return new HashMap<String, Object>() {{
            put("session", session);
            put("operation", operation);
            put("classType", classType);
            put("body", new HashMap<String, String>() {{
                put("queryNumber", queryNumber);
                put("mapClass", classType.getName());
                }});
        }};
    }
}
