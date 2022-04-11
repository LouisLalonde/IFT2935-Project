package com.football.webapp.WEB_INF.services;
import java.util.HashMap;
import com.football.api.Index;

/**
 * Provide the methods to establish communication with the api
 */
public class UserService {
    
    public Index appUseServices(){
        return new Index();
    }

    public Index appUseServices(HashMap<String, Object> data){
        return new Index(data);
    }

}
