package com.football.api.models;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.football.webapp.WEB_INF.classes.Student;

public class DataBindModel {
   
    public static String serialize(ArrayList<Object> data) throws JsonProcessingException{
        // Data
        // We could use a mapping function.
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(data);
    }

    public <T> ArrayList<T> deserialize(String data, Class classType) throws JsonProcessingException{
          // We could use a mapping function.
          ObjectMapper mapper = new ObjectMapper(); 
          JavaType type = mapper.getTypeFactory().constructCollectionType(ArrayList.class, classType);
          return mapper.readValue(data, type);
    }
}
