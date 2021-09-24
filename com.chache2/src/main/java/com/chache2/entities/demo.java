package com.chache2.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cache.ehcache.internal.EhcacheRegionFactory;
import org.hibernate.cfg.Configuration;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		   
		  SessionFactory ss = configure.buildSessionFactory();
		  
		  Session os = ss.openSession();
		   Transaction bs = os.beginTransaction();
		   
		 Student student = os.get(Student.class, 1);
		 System.out.println(student);
		   
		   
		   bs.commit();
		   os.close();

		   
		   Session os1 = ss.openSession();
		 
		   
		 Student student1 = os1.get(Student.class, 1);
		 System.out.println(student1);
		   
		   
		
		   os.close();

		   Session os2 = ss.openSession();
			 
		   
			 Student student2 = os1.get(Student.class, 1);
			 System.out.println(student2);
			   
			   
			
			   os.close();
	}

}
