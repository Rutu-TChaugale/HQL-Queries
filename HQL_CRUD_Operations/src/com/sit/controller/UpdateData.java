package com.sit.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sit.configuration.HibernateUtil;
import com.sit.model.Student;

public class UpdateData {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		Query query = session.createQuery("from Student");
		List<Student> list = query.getResultList();
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		
		Query query2 = session.createQuery("update Student set name='Rutika',email='rutu@gmail.com',addr='Kop'where id=1");
		query2.executeUpdate();
		System.out.println("updated Successfully !!");
		tx.commit();
	}

}
