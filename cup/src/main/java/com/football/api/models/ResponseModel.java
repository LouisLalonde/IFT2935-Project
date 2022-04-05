package com.football.api.models;
import java.util.HashMap;

public class ResponseModel {
    
    public HashMap<String, Object> success(String status, Object payload){
        HashMap<String, Object> res = new HashMap<>();
        res.put("status", status);
        res.put("response", payload);
        return res;
    }
}
