package com.football.api.models;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Provides data processing logic for the DataBase service
 */
public class DatabaseModel {

	public DatabaseModel(){}
	
	/**
	 * Create a session for the current request
	 * @return
	 */
	public static SessionFactory buildSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
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
	 * @param transaction
	 */
	public static void commitTransaction(Transaction transaction) {
		transaction.commit();
	}

	/**
	 * 
	 * @param session
	 * @param transaction
	 */
	public static void endTransaction(Session session, Transaction transaction) {
		transaction.commit();
		session.close();
	}

	public static void rollbackTransaction(Transaction transaction) {
		transaction.rollback();
	}
    
}
