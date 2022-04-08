package com.football;
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
    }
}

