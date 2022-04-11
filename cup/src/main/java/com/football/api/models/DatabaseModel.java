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
	 * Create an hibernate session for the current request
	 * @return SessionFactory
	 */
	public static SessionFactory buildSessionFactory() {
        return new Configuration().configure().buildSessionFactory();
    }

	/**
	 * Initiate a new transaction for the current hibernate session
	 * @param session
	 * @return Transaction
	 */
	public static Transaction buildTransaction(Session session) {
		return session.beginTransaction();
	}

	/**
	 * Commit the current hibernate transaction
	 * @param transaction
	 */
	public static void commitTransaction(Transaction transaction) {
		transaction.commit();
	}

	/**
	 * End the current hibernate transaction
	 * @param session
	 * @param transaction
	 */
	public static void endTransaction(Session session, Transaction transaction) {
		transaction.commit();
		session.close();
	}

	/**
	 * If needed (hibernate throws an error) rollback the current transaction
	 * @param transaction
	 */
	public static void rollbackTransaction(Transaction transaction) {
		transaction.rollback();
	}
    
}
