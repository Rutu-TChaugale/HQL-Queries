package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery14 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String query = " select salary , name from Employee order by salary desc";
		Query hqlQuery = session.createQuery(query);
		List<Object[]> result = hqlQuery.list();
		for (Object[] employees : result) {

			System.out.println(employees[0] + " ---> " + employees[1]);
		}
	}
}
