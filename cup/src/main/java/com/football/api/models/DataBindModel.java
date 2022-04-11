package com.football.api.models;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.football.webapp.WEB_INF.classes.entities.Joueur;

public class DataBindModel {
    
    /**
     * 
     * @param data ArrayList containing objects to be serialized
     * @return dumped json object
     * @throws JsonProcessingException
     */
    public static String serialize(ArrayList<Object> data) throws JsonProcessingException{
        // Data
        // We could use a mapping function.
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(data);
    }
    
    /**
     * 
     * @param <T>
     * @param data json dumped data
     * @param classType Class type value
     * @return ArrayList containing generic data type
     * @throws JsonProcessingException
     */
    public static <T> ArrayList<T> deserialize(String data, Class classType) throws JsonProcessingException{
          ObjectMapper mapper = new ObjectMapper(); 
          JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, classType);
          return mapper.readValue(data, type);
    }
}
