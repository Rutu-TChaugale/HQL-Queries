package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class HQLQuery1 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String hqlQuery = "select name from Employee ";
		Query query = session.createQuery(hqlQuery);
		List<String> list = query.list();

		for (String string : list) {
			System.out.println(string);
		}

	}
}
