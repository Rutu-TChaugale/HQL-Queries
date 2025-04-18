package com.sit.client;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery25 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String query = " select sum(salary) from Employee where location = 'pune' ";
		Query hqlQuery = session.createQuery(query);
		List result = hqlQuery.list();
		System.out.println(result);

	}

}
