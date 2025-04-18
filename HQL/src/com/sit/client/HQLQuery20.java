package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery20 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		String query = " select salary, name from Employee  where department = 'Test'order by salary asc ";
		Query hqlQuery = session.createQuery(query);
		Query results = hqlQuery.setMaxResults(1);
		List<Object[]> result = results.list();
		for (Object[] employees : result) {
			System.out.println(employees[0] + " ---> " + employees[1]);
		}

	}
}
