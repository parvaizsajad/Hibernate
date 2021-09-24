package com.chache2;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.chache2.entities.Courses;
import com.chache2.entities.Student;
import com.chache2.entities.map.Answer;
import com.chache2.entities.map.Question;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
  Configuration configure = new Configuration().configure("hibernate.cfg.xml");
		   
  SessionFactory ss = configure.buildSessionFactory();
  
	/*
	 * Student student=new Student(); student.setId(0); student.setName("parvaiz");
	 * student.setAddress("bangalore"); Courses cs=new Courses();
	 * cs.setBechlors("BCA"); cs.setMasters("MCA"); student.setCourses(cs);
	 * 
	 * 
	 * //Map Answer an=new Answer(); Question qs=new Question();
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * qs.setAuestion("what is python"); qs.setQid(1);
	 * 
	 * 
	 * an.setAnswer("object oriented programming language"); an.setQuestion(qs);
	 * 
	 * 
	 * Answer an1=new Answer(); an1.setAnswer("easy to use");
	 * 
	 * an1.setQuestion(qs);
	 * 
	 * 
	 * List<Answer> la=new ArrayList<Answer>(); la.add(an); la.add(an1);
	 * qs.setAns(la);
	 */
//qs 2






   Session os = ss.openSession();
   Transaction bs = os.beginTransaction();

	/*
	 * os.save(qs); os.save(an); os.save(an1);
	 */
   Question q=os.get(Question.class, 1);
   System.out.println(q.getAuestion());
   for(Answer an:q.getAns()) {
	   System.out.println(an.getAnswer());
   }


  bs.commit();

 
   
   
   os.close();
    }
}
