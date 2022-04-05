package com.football.api.models;
import com.football.api.models.CrudOperators.*;
import com.football.webapp.WEB_INF.classes.Student;
import org.hibernate.query.Query;
/**
 * Provides data logic processing for the QueryBuilder service
 */
public class QueryModel {

    public QueryModel(){};

    public Student create(String query){
        Student student = new Student();
        student.setFirstName("Jason");
        student.setLastName("Roy");
        student.setRoll(01);
        student.setStandard("A");
        return student;
    }

    public String read(String query){
        // Constructors
        return query;
    }

    public String update(String query){
        Update builder = new Update();
        return "";
    }
    
    public String delete(String query){
        Delete builder = new Delete();
        return "";
    }
    
}
