package com.sit.controller;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Student;

public class AddData {
	
	public static void main(String[] args) throws HibernateException {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Student stu= new Student();
	
		stu.setName("sham");
		stu.setAddr("Mumbai");
		stu.setEmail("sham@gmail.com");
		
		session.save(stu);
		tx.commit();
	}

}
