package com.football;
import java.util.ArrayList;
import java.util.HashMap;
import com.football.api.services.DataBase.Operation;
import com.football.webapp.WEB_INF.classes.Student;
import com.football.webapp.WEB_INF.services.UserService;
/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(){
        // Front-end logic goes here.
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
        // Testing the creation of a student in the data base 
        userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(Operation.CREATE, new HashMap<String, String>() {{
            put("", "");
        }});
        // Testing the read of the student table
        HashMap<String, Object> res =  userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(
            Operation.READ, new HashMap<String, String>() {{
                put("queryNumber", "1");
                put("mapCalss", "com.football.webapp.WEB_INF.classes.Student");
            }});
        System.out.println("Sdtout ---");
        String jsonObjects = (String) res.get("body");
        System.out.println(jsonObjects);
        // Converting the json objects to the given class
        ArrayList<Student> students = userService.appUseServices().appUseDataBase().dataBindService().DataBindModel().deserialize(jsonObjects, Student.class);
        System.out.println(students);
    }
}

