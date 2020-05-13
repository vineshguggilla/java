package com.javafoundation;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vin.VinFoundationPojo;

@Controller
@SuppressWarnings("deprecation")
public class Usercontroller {

	static SessionFactory sf;

	static {

		sf = new Configuration().configure().buildSessionFactory();

	}

	@RequestMapping(value = "/deleteUser")
	public String deleteoperation(@RequestParam("mailIdToDelete") String mail, Model m) {

		Session s = sf.openSession();

		Query q = s.createQuery("delete from  VinFoundationPojo  where mail=:mailid");

		q.setParameter("mailid", mail);

		q.executeUpdate();

		s.beginTransaction().commit();

		Query q2 = s.createQuery("from  VinFoundationPojo");

		List<VinFoundationPojo> list = q2.list();
		m.addAttribute("user", list);

		s.close();
		return "Profile";

	}

	@RequestMapping(value = "/edituser")
	public String editOperation(@RequestParam("mailIdToEdit") String edit, Model mq) {
		Session s = sf.openSession();

		Query q = s.createQuery(" from  VinFoundationPojo  where mail=:mailid");

		q.setParameter("mailid", edit);

		List<VinFoundationPojo> list = q.list();

		mq.addAttribute("userobject", list.get(0));
		s.beginTransaction().commit();

		s.close();

		return "Edituser";

	}

	@RequestMapping(value = "/updateUser")
	public String updateOperation(VinFoundationPojo pojo, Model ms) {

		Session session = sf.openSession();

		session.update(pojo);

		session.beginTransaction().commit();

		Query query4 = session.createQuery("from VinFoundationPojo");

		List<VinFoundationPojo> list2 = query4.list();

		ms.addAttribute("user", list2);

		session.close();

		return "Profile";

	}

	@RequestMapping(value = "/fetchall")
	public String fetchallrecordes(Model mode) {
		Session session1 = sf.openSession();

		Query query4 = session1.createQuery("from VinFoundationPojo");

		List<VinFoundationPojo> list3 = query4.list();

		mode.addAttribute("user", list3);

		session1.close();

		return "Profile";

	}

}
