package com.fastfire.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtils {

	static EntityManagerFactory emf;
	
	static {
		try {
			emf = Persistence.createEntityManagerFactory("pu");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
}
