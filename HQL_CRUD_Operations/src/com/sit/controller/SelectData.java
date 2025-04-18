package com.sit.controller;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Student;

public class SelectData {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		Student stu=session.get(Student.class, 1);
//		
//		System.out.println(stu.getId());
//		System.out.println(stu.getName());
//		System.out.println(stu.getEmail());
//		System.out.println(stu.getAddr());
//		
		
		//select all data from database
		
		Query query = session.createQuery("from Student");
		List<Student> resultList = query.getResultList();
		
		 for (Student obj : resultList) {
			 
			 System.out.println(obj.getId());
			 System.out.println(obj.getName());
			 System.out.println(obj.getEmail());
			 System.out.println(obj.getAddr());
			
		}
		 
		//get single data from databse
		 //1st way 
		 Query query2 = session.createQuery("from Student where id=1");
		 Object result = query2.getSingleResult();
		 System.out.println(result);
		 
		 //2nd way
		 Query query3 = session.createQuery("from Student where id=:id");
		 Query setParameter = query3.setParameter("id", 2);
		 
		Object singleResult = setParameter.getSingleResult();
		
		System.out.println(singleResult);
		
		//3rd way
		Query query4 = session.createQuery("from Student where id=?1");
		Query setParameter2 = query4.setParameter(1, 2);
		
		Object singleResult2 = setParameter2.getSingleResult();
		System.out.println(singleResult2);
		 
		 
	}

}
