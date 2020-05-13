package com.interfgg;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.vin.VinFoundationPojo;

@SuppressWarnings("deprecation")

public class Loginimplforhiber implements Interflogin {

	static SessionFactory sf;
	static {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

	}

	public List<VinFoundationPojo> loginverification(String username, String password) {

		Session s1 = sf.openSession();
		System.out.println("test1");
		Query query = s1.createQuery("from VinFoundationPojo where mail=:mailid and pass=:pass1 ");
		query.setParameter("mailid", username);
		query.setParameter("pass1", password);
		System.out.println("test2");

		List list = query.list();

		s1.close();

		return list;
	}

	public List<VinFoundationPojo> GetAlluser() {

		Session s2 = sf.openSession();

		Query query1 = s2.createQuery("from VinFoundationPojo");

		List<VinFoundationPojo> list = query1.list();

		s2.close();

		return list;
	}

}
