package com.football;
import java.util.HashMap;
import com.football.api.services.DataBase.Operation;
import com.football.webapp.WEB_INF.services.UserService;
import com.football.webapp.WEB_INF.views.UI;

import org.hibernate.Session;

/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(String[] args, Session session){
        // Front-end logic goes here.
        UI.main(args, session);
    }

    public static Session backEnd(UserService userService){
        // Starting the back-end
        return userService.appUseServices().startApi();
    }

    public static void main(String[] args) throws Exception {
        // Constructors
        UserService userService = new UserService();
        // Data
        // Logic
        // Starting the back-end API
        Session session = backEnd(userService);
        HashMap<String, Object> res =  userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(
                    session, Operation.READ, new HashMap<String, String>() {{
                    put("queryNumber", "1");
                    put("mapClass", "com.football.webapp.WEB_INF.classes.CoupeDuMonde");
                }});
        System.out.println(res);
        //String jsonObjects = (String) res.get("body");
        // Converting the json objects to the given class
        //ArrayList<CoupeDuMonde> coupeDuMondes = userService.appUseServices().appUseDataBase().dataBindService().DataBindModel().deserialize(jsonObjects, CoupeDuMonde.class);
        
        // String jsonObjects = (String) res.get("body");
        // Starting the front-end
        //frontEnd(args, session);
    }
}

