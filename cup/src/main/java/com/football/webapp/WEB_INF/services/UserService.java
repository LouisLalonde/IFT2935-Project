package com.football.webapp.WEB_INF.services;
import com.football.api.Index;

/**
 * Provide the methods to establish communication with the api
 */
public class UserService {

    public Index appUseServices(){
        return new Index();
    }

}
