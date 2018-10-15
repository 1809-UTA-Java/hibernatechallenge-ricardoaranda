package com.revature.hibernate_challenge.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.revature.hibernate_challenge.model.*;
import com.revature.hibernate_challenge.util.*;

public class UserDao {
	@SuppressWarnings("unchecked")
	public List<User> getUsers() {
		Session session = HibernateUtil.getSession();
		return session.createQuery("from User").list();
	}
	
	public User getUserByName(String aName) {
		Session session = HibernateUtil.getSession();
		User found = null;
		List<User> users = new ArrayList<>();
		
		users = session.createQuery(
				"from User where name = :nameVar")
				.setString("nameVar", aName).list();
		if(!users.isEmpty()) {
			found = users.get(0);
		}
		
		session.getTransaction().commit();
		return found;
	}
	
	public void saveUser(User user) {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
		
//		SessionFactory factory = new Configuration()
//				.configure()
//				.addAnnotatedClass(User.class)
//				.buildSessionFactory();
//		
//		try {
//			
//		}
	}
}
