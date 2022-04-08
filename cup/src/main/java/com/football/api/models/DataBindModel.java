package com.football.api.models;
import java.util.ArrayList;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataBindModel {
    
    /**
     * 
     * @param data
     * @return
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
     * @param data
     * @param classType
     * @return
     * @throws JsonProcessingException
     */
    public <T> ArrayList<T> deserialize(String data, Class classType) throws JsonProcessingException{
          // We could use a mapping function.
          ObjectMapper mapper = new ObjectMapper(); 
          JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, classType);
          return mapper.readValue(data, type);
    }
}
