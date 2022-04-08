package com.football.api.models;
import java.util.HashMap;

public class ResponseModel {
    
    /**
     * 
     * @param payload
     * @return
     */
    public HashMap<String, Object> success(Object payload){
        HashMap<String, Object> res = new HashMap<>();
        res.put("status", "200");
        res.put("body", payload);
        return res;
    }

    /**
     * 
     * @param payload
     * @return
     */
    public HashMap<String, Object> error(Object payload){
        HashMap<String, Object> res = new HashMap<>();
        res.put("status", "400");
        res.put("body", payload);
        return res;
    }
}
