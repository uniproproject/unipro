package com.unipro.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unipro.model.Person;

@Controller
public class LoginController {

	public LoginController() {

	}

	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String loginForm(Model model) {
		Person person = new Person();
		model.addAttribute(person);

		return "login";

	}
	
	
	@RequestMapping(value = "/", method=RequestMethod.POST)
	public String processLoginForm(Person person, Model model) {
		String view = "student";
		
		if (person.getName().equalsIgnoreCase("diego")) {
			view = "professor";
		}
		
		model.addAttribute(person);
		
		return  view;

	}
}
