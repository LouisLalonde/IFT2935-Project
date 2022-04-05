package com.football.api.models;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Provides data processing logic for the DataBase service
 */
public class DatabaseModel {
	private static String hibernateCFG = "com/football/api/resources/hibernate.cfg.xml";

	public DatabaseModel(){}

	public void initSchema(String schema) {
	}
	
	/**
	 * Create a session for the current request
	 * @return
	 */
	public static SessionFactory buildSessionFactory() {
        return new Configuration().configure(hibernateCFG).buildSessionFactory();
    }

	/**
	 * 
	 * @param session
	 * @return
	 */
	public static Transaction buildTransaction(Session session) {
		return session.beginTransaction();
	}

	/**
	 * 
	 * @param session
	 * @param transaction
	 */
	public static void endTransaction(Session session, Transaction transaction){
		transaction.commit();
		session.close();
	}
    
}
