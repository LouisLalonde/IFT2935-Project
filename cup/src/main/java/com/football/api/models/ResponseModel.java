package com.football.api.models;
import java.util.HashMap;

/**
 * Provides data logic for the ResponseService
 */
public class ResponseModel {
    
    /**
     * Generate an object for when the response is successfull
     * @param payload
     * @return HashMap<String, Object>
     */
    public HashMap<String, Object> success(Object payload){
        HashMap<String, Object> res = new HashMap<>();
        res.put("status", "200");
        res.put("body", payload);
        return res;
    }

    /**
     * Generate an object for when the response is unsuccessfull
     * @param payload
     * @return HashMap<String, Object>
     */
    public HashMap<String, Object> error(Object payload){
        HashMap<String, Object> res = new HashMap<>();
        res.put("status", "400");
        res.put("body", payload);
        return res;
    }
}
