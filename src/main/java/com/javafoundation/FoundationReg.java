package com.javafoundation;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forvalidation.Validationof;
import com.interf.Interf1;
import com.vin.VinFoundationPojo;

@Controller
public class FoundationReg {

	
             

	@Autowired
	Interf1 dao;

	final static Logger logge =Logger.getLogger(FoundationReg.class);
	
	@RequestMapping(value = "/foundation")
	public String Registration(VinFoundationPojo vin, Model m) throws Exception {
		
	logge.info("enter into the program");

		Validationof vin1 = new Validationof();

		boolean isvalid = vin1.mobilevalidation(vin.getMobileno());

		if (!isvalid) {

			logge.debug("please enter valid mobile number");
			
			m.addAttribute("message", "please enter valid mobile number");

			return "Register";

		}

		boolean mailvalid = vin1.isValid(vin.getMail());

		if (!mailvalid) {
			logge.debug("please enter valid mail");
			m.addAttribute("message", "please enter valid mail");

			return "Register";

		}

		boolean validateAadharNumber = vin1.validateAadharNumber(vin.getAdhar());

		if (!validateAadharNumber) {
			logge.debug("please enter valid AadharNumber number");
			m.addAttribute("message", "please enter valid AadharNumber");

			return "Register";

		}
		
		
		
		boolean isvalidPan = vin1.isValidPan(vin.getPan());
		
		if(!isvalidPan) {
			
			m.addAttribute("message", "please enter valid PAN Number");
		
			return "Register";
			
		}



		dao.saveoperation(vin);
		m.addAttribute("message", "successfully Registered");
		
		logge.info("exit into the program");

		return "login";

	}


	}



