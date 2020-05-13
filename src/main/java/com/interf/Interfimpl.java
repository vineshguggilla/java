package com.interf;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vin.VinFoundationPojo;


public class Interfimpl implements Interf1 {

	@SuppressWarnings("deprecation")
	public void saveoperation(VinFoundationPojo pojo) {

		Configuration con = new Configuration().configure();

		SessionFactory Session = con.buildSessionFactory();

		org.hibernate.Session s2 = Session.openSession();

		Transaction tx = s2.beginTransaction();

		s2.save(pojo);

		tx.commit();

		Session.close();

	}

}
