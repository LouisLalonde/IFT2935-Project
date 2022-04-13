package com.football.webapp.WEB_INF.views; 
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.CrudOperators.Enum.Operation;
import com.football.webapp.WEB_INF.classes.complex_entities.MeilleurPointeurCoupeDuMonde;
import com.football.webapp.WEB_INF.classes.complex_entities.PermierArbitrePenalite;
<<<<<<< HEAD:cup/src/main/java/com/football/webapp/WEB_INF/views/Home.java
import com.football.webapp.WEB_INF.classes.entities.Arbitre;
import com.football.webapp.WEB_INF.classes.entities.Joueur;
import com.football.webapp.WEB_INF.classes.entities.Match;
import com.football.webapp.WEB_INF.classes.utility.RequestObject;
import com.football.webapp.WEB_INF.services.UserService;

=======
import com.football.webapp.WEB_INF.classes.utility.AbstractedReadRequest;
>>>>>>> 9518d6037c99829c46f7ebee5fb8baa36129fe34:cup/src/main/java/com/football/webapp/WEB_INF/views/LayoutSample.java
import org.hibernate.Session;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
 
/**
 * Sample application that shows examples of the different layout panes
 * provided by the JavaFX layout API.
 * The resulting UI is for demonstration purposes only and is not interactive.
 */
 
 
public class Home extends Application {
    private static Session session;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, Session hibernateSession) {
        session = hibernateSession;
        launch(Home.class, args);
    }
    
    @Override
    public void start(Stage stage) {
        // Constructors
        RequestObject requestObject = new RequestObject();
        UserService userService = new UserService();
        // Use a border pane as the root for scene
        BorderPane border = new BorderPane();
        
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);   // Gap between nodes
        hbox.setStyle("-fx-background-color: #336699;");

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10)); // Set all sides to 10
        vbox.setSpacing(8);              // Gap between nodes
 

        //HBox hbox = addHBox();
        border.setTop(hbox);
        border.setLeft(vbox);
    
 
        Scene scene = new Scene(border);
        stage.setScene(scene);
        stage.setTitle("Projet du cours IFT 2935 -- La coupe du monde des nations du football");
        stage.setHeight(300);
        stage.setWidth(1000);
        stage.show();


        Text title = new Text("Vanessa Bellegarde (20184886), Jonathan Therrien (20157376), Louis Lalonde (20162457), Alexandre Hamila (20181634) ");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(title);

        Text answer = new Text("");
        //answer.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        vbox.getChildren().add(answer);

        Button button1 = new Button("Query 1");
        button1.setPrefSize(100, 20);

        button1.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    title.setText("Trouver le nombre de Carton Jaune donné par Clement Turpin durant toutes les coupes du monde qu'il a arbitré.");

                try {
<<<<<<< HEAD:cup/src/main/java/com/football/webapp/WEB_INF/views/Home.java
                    ArrayList<Integer> arbitres = userService.appUseServices(requestObject.build(session, Operation.READ, "1",  Integer.class))
                    .appUseDataBase().dataBaseService().main();
                    System.out.println(arbitres);
=======
                    ArrayList<Integer> arbitres  = new AbstractedReadRequest().execute(session, Operation.READ, "1", Integer.class);
>>>>>>> 9518d6037c99829c46f7ebee5fb8baa36129fe34:cup/src/main/java/com/football/webapp/WEB_INF/views/LayoutSample.java

                    answer.setText(arbitres.get(0) + " Carton(s) Jaune(s)");
                    
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            }
        });
                   

        Button button2 = new Button("Query 2");
        button2.setPrefSize(100, 20);    

        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("Trouver le ou les joueurs qui a mis le plus de but en combinant les coupes du monde des années 1966 à 1978, retourner son nom, prénom et son pays. ");
                
            try {
<<<<<<< HEAD:cup/src/main/java/com/football/webapp/WEB_INF/views/Home.java

                    ArrayList<MeilleurPointeurCoupeDuMonde> meilleurPointeurCoupeDuMonde = userService.appUseServices(requestObject.build(session, Operation.READ, "2",  MeilleurPointeurCoupeDuMonde.class))
                    .appUseDataBase().dataBaseService().main();
                    System.out.println(meilleurPointeurCoupeDuMonde);
=======
                    ArrayList<MeilleurPointeurCoupeDuMonde> meilleurPointeurCoupeDuMonde = new AbstractedReadRequest().execute(session, Operation.READ, "2", MeilleurPointeurCoupeDuMonde.class);
>>>>>>> 9518d6037c99829c46f7ebee5fb8baa36129fe34:cup/src/main/java/com/football/webapp/WEB_INF/views/LayoutSample.java

                    StringBuilder display = new StringBuilder();


                     for (MeilleurPointeurCoupeDuMonde joueur : meilleurPointeurCoupeDuMonde) {
                         display.append(
                             "( Prenom Joueur: " + 
                             joueur.getPrenom() + " ;  Nom Joueur: " +
                             joueur.getNom() + " ; Pays Joueur: " +
                             joueur.getPays_Equipe() +
                             " ) "
                         );
                    };

                    answer.setText(display.toString());

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            
            }
    });
   
    
        Button button3= new Button("Query 3");
        button3.setPrefSize(100, 20);

        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("Trouver l'arbitre du premier match de la coupe du monde 1974 où un joueur a marqué un penalty, retourner les noms des deux pays jouant lors de ce match ainsi que le nom et prénom de l’arbitre.");
                 
                try {
                    ArrayList<PermierArbitrePenalite> permierArbitrePenalty = userService.appUseServices(requestObject.build(session, Operation.READ, "3",  PermierArbitrePenalite.class))
                    .appUseDataBase().dataBaseService().main();

<<<<<<< HEAD:cup/src/main/java/com/football/webapp/WEB_INF/views/Home.java
                    System.out.println(permierArbitrePenalty);
=======
                    ArrayList<PermierArbitrePenalite> permierArbitrePenalty = new AbstractedReadRequest().execute(session, Operation.READ, "3", PermierArbitrePenalite.class);
>>>>>>> 9518d6037c99829c46f7ebee5fb8baa36129fe34:cup/src/main/java/com/football/webapp/WEB_INF/views/LayoutSample.java
                    StringBuilder display = new StringBuilder();

                    for (PermierArbitrePenalite arbitre : permierArbitrePenalty) {
                        display.append(
                            "( Prenom Arbitre: " + 
                            arbitre.getPrenom() + " ;  Nom Arbitre: " +
                            arbitre.getNom() + " ; Equipe Gaganante: " +
                            arbitre.getEquipe_Gagnante() +" ; Equipe Perdante: " +
                            arbitre.getEquipe_Perdante() + 
                            " ) "
                        );
                    };

                    answer.setText(display.toString());

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }          
               
            }
    });
 
    
        Button button4 = new Button("Query 4");
        button4.setPrefSize(100, 20);

        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                title.setText("Trouver le nombre de but marqué après 00:09:00 minutes par des joueurs dont le poste est milieu_centre (AC) durant l’année 1978.");
            
                try {
                    ArrayList<Integer> buts = userService.appUseServices(requestObject.build(session, Operation.READ, "4",  Integer.class))
                    .appUseDataBase().dataBaseService().main();
                    answer.setText(buts.get(0) + " But(s)");

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            
            }
    });
    
        hbox.getChildren().addAll(button1, button2, button3, button4);
    
    }
 
}
