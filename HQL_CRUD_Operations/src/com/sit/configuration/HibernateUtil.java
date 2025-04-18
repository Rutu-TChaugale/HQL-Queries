package com.sit.configuration;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Environment;

import com.sit.model.Student;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory() {
		if(sessionFactory==null) {
		Map<Object, String> map =new HashMap<>();
		map.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		map.put(Environment.URL, "jdbc:mysql://localhost:3306/hql_crud");
		map.put(Environment.USER, "root");
		map.put(Environment.PASS, "root");
		map.put(Environment.SHOW_SQL, "true");
		map.put(Environment.FORMAT_SQL, "true");
		map.put(Environment.HBM2DDL_AUTO, "update");
		map.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		
		StandardServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(map).build();
		MetadataSources mds=new MetadataSources(registry);
			mds.addAnnotatedClass(Student.class);
		Metadata metadata = mds.getMetadataBuilder().build();
		sessionFactory = metadata.getSessionFactoryBuilder().build();
		}
		return sessionFactory;
		
	}
}
