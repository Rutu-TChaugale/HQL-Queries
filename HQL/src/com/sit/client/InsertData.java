package com.sit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sit.entity.Employee;

public class InsertData {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		Employee e1 = new Employee();
		e1.setName("Anup");
		e1.setSalary(10000);
		e1.setDepartment("Dev");
		e1.setLocation("Pune");
		e1.setYear(2020);

		Employee e2 = new Employee();
		e2.setName("Rani");
		e2.setSalary(26000);
		e2.setDepartment("Test");
		e2.setLocation("Nashik");
		e2.setYear(2021);

		Employee e3 = new Employee();
		e3.setName("Jay");
		e3.setSalary(18000);
		e3.setDepartment("Dev");
		e3.setLocation("Nagpur");
		e3.setYear(2022);

		Employee e4 = new Employee();
		e4.setName("Vishal");
		e4.setSalary(22000);
		e4.setDepartment("Support");
		e4.setLocation("Pune");
		e4.setYear(2023);

		Employee e5 = new Employee();
		e5.setName("Shina");
		e5.setSalary(35000);
		e5.setDepartment("Test");
		e5.setLocation("Nagpur");
		e5.setYear(2023);

		Employee e6 = new Employee();
		e6.setName("Rony");
		e6.setSalary(11000);
		e6.setDepartment("Support");
		e6.setLocation("Nagpur");
		e6.setYear(2022);

		Employee e7 = new Employee();
		e7.setName("Pooja");
		e7.setSalary(38000);
		e7.setDepartment("Dev");
		e7.setLocation("Nashik");
		e7.setYear(2021);

		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(e6);
		session.save(e7);
		tx.commit();
	}
}
