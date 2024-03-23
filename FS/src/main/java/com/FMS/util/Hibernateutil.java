package com.FMS.util;
import com.FMS.entity.Feedback;
import com.FMS.entity.Nutrition;
import com.FMS.entity.Progress;
import com.FMS.entity.User;
import com.FMS.entity.Workout;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class Hibernateutil {

	// Static initialization of sessionFactory
	private   static final SessionFactory sessionFactory=buildSessionFactory();
	
	// Private constructor to prevent instantiation
    private Hibernateutil() {}
    
    // Method to build the session factory
	private static SessionFactory buildSessionFactory()

	{

	try {
		// Configuration and creation of the session factory
	return new Configuration().configure("hibernate.cfg.xml")
			.addAnnotatedClass(User.class)
			.addAnnotatedClass(Workout.class)
			.addAnnotatedClass(Nutrition.class)
			.addAnnotatedClass(Progress.class)
			.addAnnotatedClass(Feedback.class)
			.buildSessionFactory();

	}catch (Throwable e) {
		// Error handling during initialization
        e.printStackTrace();

	throw new ExceptionInInitializerError(e);
	}
	}
	
	// Method to get the session factory
	public static SessionFactory getSessionFactory(){
	 return sessionFactory;

	}

	// Method to get a session from the session factory
	public static Session getSession()
	{
	return getSessionFactory().openSession();

	
	}
	
	}
