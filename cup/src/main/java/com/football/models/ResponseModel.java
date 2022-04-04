package com.football.models;

import java.util.HashMap;

public class ResponseModel {
    
    public HashMap<String, String> success(String status, String payload){
        HashMap<String, String> res = new HashMap<>();
        res.put("status", status);
        res.put("response", payload);
        return res;
    }
}
