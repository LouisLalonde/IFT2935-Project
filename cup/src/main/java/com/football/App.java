package com.football;
import java.util.ArrayList;
import java.util.HashMap;
import com.football.api.services.DataBase.Operation;
import com.football.webapp.WEB_INF.classes.Student;
import com.football.webapp.WEB_INF.services.UserService;
import com.football.webapp.WEB_INF.views.UI;

/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(String[] args){
        // Front-end logic goes here.
        UI.main(args);
    }

    public static void backEnd(UserService userService){
        // Starting the back-end
        userService.appUseServices().startApi();
    }

    public static void main(String[] args) throws Exception {
        // Constructors
        UserService userService = new UserService();
        // Data
        // Logic
        // Starting the back-end API
        backEnd(userService);
        // Starting the front-end
        frontEnd(args);
        // Testing the creation of a student in the data base 
        // userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(Operation.CREATE, new HashMap<String, String>() {{
        //     put("", "");
        // }});
    }
}

