package com.football.webapp.WEB_INF.views;
import java.util.ArrayList;
import java.util.HashMap;
import com.football.webapp.WEB_INF.classes.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.DatabaseModel;
import com.football.api.services.DataBase.Operation;
import com.football.webapp.WEB_INF.services.UserService;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javafx.scene.control.Alert.AlertType;
 
public class UI extends Application {
    SessionFactory factory =  DatabaseModel.buildSessionFactory();
    Session session = factory.openSession();
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Query Me!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
        Alert a = new Alert(AlertType.NONE);
        
            @Override
            public void handle(ActionEvent event) {
            UserService userService = new UserService();
            try {
                // Testing the creation of a student in the data base 
                userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(session,
                Operation.CREATE, new HashMap<String, String>() {{
                    put("", "");
                }});
                HashMap<String, Object> res =  userService.appUseServices().appUseDataBase().dataBaseService().executeQuery(
                    session, Operation.READ, new HashMap<String, String>() {{
                    put("queryNumber", "1");
                    put("mapCalss", "com.football.webapp.WEB_INF.classes.Student");
                }});
                String jsonObjects = (String) res.get("body");
                // Converting the json objects to the given class
                ArrayList<Student> students = userService.appUseServices().appUseDataBase().dataBindService().DataBindModel().deserialize(jsonObjects, Student.class);
                a.setAlertType(AlertType.CONFIRMATION);
                StringBuilder display = new StringBuilder();
                for (Student student : students) {
                    display.append(
                        "( " + 
                        student.getId() + " ; " +
                        student.getFirstName() + " ; " +
                        student.getLastName() +
                        " ), "
                    );
                  }
                a.setContentText(display.toString());
                a.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
                // show the dialog
                a.show();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);

 Scene scene = new Scene(root, 1000, 1000);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}