package com.sit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Employee.findBySalaryGreaterThan", query = "SELECT e FROM Employee e WHERE e.salary > :threshold")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO) // auto increment
	private int id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private double salary;

	@Column(nullable = false)
	private String department;

	@Column(nullable = false)
	private String location;

	@Column(nullable = false)
	private int year;

	public Employee() {
		super();
	}

	public Employee(String name, double salary, String department, String location, int year) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.location = location;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", location=" + location + ", year=" + year + "]";
	}

}
