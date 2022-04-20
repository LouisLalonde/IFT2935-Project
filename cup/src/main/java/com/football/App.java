package com.football;
import com.football.webapp.WEB_INF.services.UserService;
<<<<<<< Updated upstream
import com.football.webapp.WEB_INF.views.Home;
import org.hibernate.Session;

=======
import com.football.webapp.WEB_INF.views.UI;
>>>>>>> Stashed changes
/**
 * Main class for the App.
 */
public class App {

    public static void frontEnd(String[] args, Session session){
        // Front-end logic goes here.
        Home.main(args, session);
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
<<<<<<< Updated upstream
        Session session = backEnd(userService);
        // Starting the front-end
        frontEnd(args, session);
=======
        backEnd(userService);
        UI.main(args);
        // Testing the creation of a student in the data base 
        // userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(Operation.CREATE, new HashMap<String, String>() {{
        //     put("", "");
        // }});
        // // Testing the read of the student table
        // HashMap<String, Object> res =  userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(
        //     Operation.READ, new HashMap<String, String>() {{
        //         put("queryNumber", "1");
        //         put("mapCalss", "com.football.webapp.WEB_INF.classes.Student");
        //     }});
        // System.out.println("Sdtout ---");
        // String jsonObjects = (String) res.get("body");
        // System.out.println(jsonObjects);
        // // Converting the json objects to the given class
        // ArrayList<Student> students = userService.appUseServices().appUseDataBase().dataBindService().DataBindModel().deserialize(jsonObjects, Student.class);
        // System.out.println(students);
>>>>>>> Stashed changes
    }
}

