package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery2 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String query = " select count(id) from Employee ";
		Query hqlQuery = session.createQuery(query);
		 Object result = hqlQuery.uniqueResult();
		System.out.println(result);
		
	}
}
