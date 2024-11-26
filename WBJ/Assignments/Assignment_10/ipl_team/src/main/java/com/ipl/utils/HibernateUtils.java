package com.ipl.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	static {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to initialize Hibernate SessionFactory.");
		}
	}
	
	public static SessionFactory getFactory() {
		return factory;
	}
	
	public static void closeFactory() {
		if(factory != null) {
			factory.close();
		}
	}
}
