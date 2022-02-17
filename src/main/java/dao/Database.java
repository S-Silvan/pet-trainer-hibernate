package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Database {
	private static Database jdbc;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
			Configuration configuration=new Configuration();
			configuration.configure("resource/hibernate.cfg.xml");
			sessionFactory=configuration.buildSessionFactory();
		}
		return sessionFactory;
	}
	protected void finalize() {
		if(sessionFactory!=null)
			sessionFactory.close();
	}
}
