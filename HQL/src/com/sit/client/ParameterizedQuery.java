package com.sit.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.sit.entity.Employee;

public class ParameterizedQuery {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		// Define the parameterized HQL query
		String hql = "FROM Employee WHERE salary > :threshold";
		Query<Employee> query = session.createQuery(hql, Employee.class);
		query.setParameter("threshold", 25000.0); // Set the threshold parameter

		// Execute the query
		List<Employee> employees = query.getResultList();

		// Display the results
		System.out.println("Employees with salary greater than 25000:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// Commit transaction
		session.getTransaction().commit();
	}
}
