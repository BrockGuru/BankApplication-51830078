package com.bookapp.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateSessionFactory {
private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	public HibernateSessionFactory() {
		
	}
	public static SessionFactory getSessionFactory(){
		return factory;
	}
	

}
