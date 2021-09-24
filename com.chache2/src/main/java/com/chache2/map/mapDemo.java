package com.chache2.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import net.sf.ehcache.hibernate.EhCacheRegionFactory;

public class mapDemo {
	public static void main(String[] args) {
		

	Configuration configure = new Configuration().configure("hibernate.cfg.xml");
	   
	  SessionFactory ss = configure.buildSessionFactory();
	  
	  
	  Emp em1=new Emp();
	  Emp em2=new Emp();
	  em1.setEmp_name("parvaiz");
	  em2.setEmp_name("sajad");

	  
	  
	  Project pr1=new Project();
	  Project pr2=new Project();
	  pr1.setProj_name("capture");
	  pr2.setProj_name("kapav");
	  List<Project> lp=new ArrayList<Project>();
	  lp.add(pr1);
	  lp.add(pr2);
	  em1.setProj(lp);
	  List<Emp> le=new ArrayList<Emp>();
	  le.add(em1);
	  le.add(em2);
	  pr1.setEmplist(le);
	  
	  
	  

	   Session os = ss.openSession();
	   Transaction bs = os.beginTransaction();
	   
	   os.save(pr1);
	   os.save(pr2);
	   os.save(em1);
	   os.save(em2);
	   
	   
	   bs.commit();
	   os.close();

}
}