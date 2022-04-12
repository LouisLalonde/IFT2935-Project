package com.football.webapp.WEB_INF.views; 
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.football.api.models.CrudOperators.Enum.Operation;
import com.football.webapp.WEB_INF.classes.complex_entities.MeilleurPointeurCoupeDuMonde;
import com.football.webapp.WEB_INF.classes.complex_entities.PermierArbitrePenalite;
import com.football.webapp.WEB_INF.classes.entities.Arbitre;
import com.football.webapp.WEB_INF.classes.entities.Joueur;
import com.football.webapp.WEB_INF.classes.entities.Match;
import com.football.webapp.WEB_INF.classes.utility.AbstractedReadRequest;
import org.hibernate.Session;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.layout.Region;
 
 
/**
 * Sample application that shows examples of the different layout panes
 * provided by the JavaFX layout API.
 * The resulting UI is for demonstration purposes only and is not interactive.
 */
 
 
public class LayoutSample extends Application {
    private static Session session;
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, Session hibernateSession) {
        session = hibernateSession;
        launch(LayoutSample.class, args);
    }
    
    @Override
    public void start(Stage stage) {
 
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
                    ArrayList<Integer> arbitres  = new AbstractedReadRequest().execute(session, Operation.READ, "1", Integer.class);
                    System.out.println(arbitres);

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

                    ArrayList<MeilleurPointeurCoupeDuMonde> meilleurPointeurCoupeDuMonde = new AbstractedReadRequest().execute(session, Operation.READ, "2", MeilleurPointeurCoupeDuMonde.class);
                    System.out.println(meilleurPointeurCoupeDuMonde);

                    StringBuilder display = new StringBuilder();


                    // for (MeilleurPointeurCoupeDuMonde joueur : meilleurPointeurCoupeDuMonde) {
                    //     display.append(
                    //         "( " + 
                    //         joueur.getPrenom() + " ; " +
                    //         joueur.getNom() + " ; " +
                    //         joueur.getPays_Equipe() +
                    //         " ), "
                    //     );
                    // };

    
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

                    ArrayList<PermierArbitrePenalite> permierArbitrePenalty = new AbstractedReadRequest().execute(session, Operation.READ, "3", PermierArbitrePenalite.class);
                    System.out.println(permierArbitrePenalty);
                    StringBuilder display = new StringBuilder();


                    // for (Arbitre arbitre : arbitres) {
                    
                    //     display.append(
                    //         "( " + 
                    //         arbitre.getPrenom() + " ; " +
                    //         arbitre.getNom() + " ; " +
                    //         //match.getEquipe_Gagnante() + " ; " +
                    //         //match.getEquipe_Perdante() +
                    //         " ), "
                    //     );
                        
                    //   };


                    answer.setText(display.toString());
                    //System.out.println(display.toString());


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
                    ArrayList<Integer> buts  = new AbstractedReadRequest().execute(session, Operation.READ, "4", Integer.class);

                    answer.setText(buts.get(0) + " But(s)");

                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                }
            
            }
    });
    

        hbox.getChildren().addAll(button1, button2, button3, button4);
    
    }
 
}
