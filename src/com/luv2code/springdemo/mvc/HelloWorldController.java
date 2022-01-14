package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String shoForm() {
		return "helloworld-form";
	}

	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processForm")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		String name = request.getParameter("studentName");

		name = name.toUpperCase();

		String result = "Yo! " + name;
		model.addAttribute("message", result);

		return "helloworld";
	}
}
