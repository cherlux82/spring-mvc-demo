package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String shoForm() {
		return "helloworld-form";
	}

	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processForm")
	public String letsShoutDude(@RequestParam("studentName") String name, Model model) {

		name = name.toUpperCase();

		String result = "Hey my friend! " + name;
		model.addAttribute("message", result);

		return "helloworld";
	}
}
