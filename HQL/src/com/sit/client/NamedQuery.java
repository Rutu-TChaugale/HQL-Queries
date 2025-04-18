package com.sit.client;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.sit.entity.Employee;

public class NamedQuery {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();

		// Create and execute the named query
		Query<Employee> query = session.createNamedQuery("Employee.findBySalaryGreaterThan", Employee.class);
		query.setParameter("threshold", 20000.0); // Set the threshold parameter
		List<Employee> employees = query.getResultList();

		// Display the results
		System.out.println("Employees with salary greater than 20000:");
		for (Employee employee : employees) {
			System.out.println(employee);
		}

		// Commit transaction
		session.getTransaction().commit();
	}
}
