package main.webapp.WEB_INF.classes;
import java.util.HashMap;

/**
 * Main class for the App.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ProjectGetPropertyValues properties = new ProjectGetPropertyValues();
        HashMap<String, String> variables =  properties.getPropValues();
        System.out.println(variables);
    }
}
