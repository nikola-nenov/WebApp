package com.nikola.webtask;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;

public class Main {

	public static void main(String[] args) {

	}

	public static void saveUserToDB(UserInformation user) {
		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}

	public static List<UserInformation> getUsersFromDB() {

		SessionFactory sessionFactory = new AnnotationConfiguration()
				.configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from UserInformation");
		List<UserInformation> result = new ArrayList<UserInformation>(q.list());
		for (UserInformation user : result) {
			System.out.println(user.getRollNo() + " " + user.getIp());
			System.out.println(user.getRollNo() + " " + user.getUserAgent());
			System.out.println(user.getRollNo() + " " + user.getDate());
		}
		session.close();
		return result;
	}
}
