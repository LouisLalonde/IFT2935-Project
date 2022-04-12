package com.football;
import com.football.webapp.WEB_INF.services.UserService;
import com.football.webapp.WEB_INF.views.LayoutSample;
import org.hibernate.Session;

/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(String[] args, Session session){
        // Front-end logic goes here.
        LayoutSample.main(args, session);
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
        // Starting the front-end
        frontEnd(args, session);
    }
}

