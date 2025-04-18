package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class HQLQuery9 {
	public static void main(String[] args) {
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		String hqlquery = "select salary , name from Employee order by salary desc";
		Query<Object[]> query = session.createQuery(hqlquery);
		
		query.setMaxResults(5);
		
		List<Object[]> results = query.list();

		for (Object[] employees : results) {
			System.out.println(employees[0] + " ---> " + employees[1]);
		}
	}
}
