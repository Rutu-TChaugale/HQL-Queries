package com.sit.controller;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.sit.configuration.HibernateUtil;

public class DeleteData {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("delete from Student where id=3");
		query.executeUpdate();
		tx.commit();
	}

}
