package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLQuery23 {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();

		String query = "select department, sum(salary) as totalSalary  from Employee where department in ('Dev', 'Support')  group by department";
		Query hqlQuery = session.createQuery(query);
		List<Object[]> results = hqlQuery.list();

		// Print total salary expenditure for each department
		for (Object[] result : results) {
			String department = (String) result[0];
			double totalSalary = (double) result[1];
			System.out.println("Total salary expenditure in " + department + " department: " + totalSalary);
		}

	}
}
