package main.webapp.WEB_INF.classes;
import java.util.HashMap;
import main.webapp.WEB_INF.services.UserService;

/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(){
        // Front-end logic goes here.
    }

    public static void backEnd(UserService userService){
        userService.appUseServices().startApi();
        // Initializing the data base with the given schema
        userService.appUseServices().appUseDataBase().dataBaseService().init("");
    }

    public static void main(String[] args) throws Exception {
        // Constructors
        ProjectGetPropertyValues properties = new ProjectGetPropertyValues();
        UserService userService = new UserService();
        // Data
        HashMap<String, String> variables =  properties.getPropValues();
        // Logic
        System.out.println(variables);
        // Starting the back-end API
        backEnd(userService);
    }
}
