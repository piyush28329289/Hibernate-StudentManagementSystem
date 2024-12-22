package com.Studentproject.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dataconfigue {
	private static final SessionFactory sessionfactory=getsessionfactory();
			private Dataconfigue() {
		
	}
	public static SessionFactory getsessionfactory() {
		Configuration cfg =new Configuration().configure();
		return cfg.buildSessionFactory();
	}
	public static SessionFactory getinstanceofsessionfactory() {
		return sessionfactory;
	}

}
