package com.javafoundation;

import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.interfgg.Interflogin;
import com.vin.VinFoundationPojo;

@Controller
public class Foundationlogin {

	@Autowired

	Interflogin login;

	@Autowired

	Interflogin login1;

	@RequestMapping(value = "/loginaction")
	public String loginverfication(@RequestParam("Uname") String username, @RequestParam("pass") String password,
			Model m) {

		List<VinFoundationPojo> log = login.loginverification(username, password);

		List<VinFoundationPojo> getAlluser = login.GetAlluser();

		if (!log.isEmpty()) {

			m.addAttribute("mess", username);
			m.addAttribute("user", getAlluser);
			/*
			 * Iterator<VinFoundationPojo> iterator = getAlluser.iterator();
			 * 
			 * if (iterator.hasNext()) {
			 * 
			 * VinFoundationPojo n = iterator.next();
			 * 
			 * System.out.println("vinesh done this own"+n.getAdhar()+" "+n.getAge()+""+
			 * n.getCountry());
			 * 
			 * }
			 */

			ListIterator<VinFoundationPojo> iterator = log.listIterator();

			if (iterator.hasNext()) {

				VinFoundationPojo n = iterator.next();

				System.out.println("vinesh done this own" + n.getAdhar() + " " + n.getAge() + "" + n.getCountry());

			}

		} else {

			m.addAttribute("message", "please enter valid user number");

		}

		return "Profile";

	}

}
