package com.sit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String addr;
	private String email;
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//to string 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addr=" + addr + ", email=" + email + "]";
	}
	
	//Constructor using field
//	public Student(int id, String name, String addr, String email) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.addr = addr;
//		this.email = email;
//	}
//	
	

}
