package com.sit.client;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery3 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String query = " select distinct department from Employee ";
		Query hqlQuery = session.createQuery(query);
		 Object result = hqlQuery.list();
		System.out.println(result);
		

	}
}
