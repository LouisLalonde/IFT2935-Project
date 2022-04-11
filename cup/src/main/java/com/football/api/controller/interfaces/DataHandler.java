package com.football.api.controller.interfaces;
import java.util.HashMap;

/**
 * Provide an abstract method to the controllers for handling the client data request
 */
public interface DataHandler {
    public HashMap<String, Object> handle(HashMap<String, Object> data);
}
