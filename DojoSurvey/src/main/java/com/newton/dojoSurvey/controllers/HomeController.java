package com.newton.dojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/save")
	public String save(HttpSession session, @RequestParam(value="name") String name,
			@RequestParam(value="location") String location, @RequestParam(value="language") 
			String language, @RequestParam(value="comment") String comment, Model model) {
		
		
		// set values from form into session
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		
//		model.addAttribute("name", name);
//		model.addAttribute("location", location);
//		model.addAttribute("language", language);
//		model.addAttribute("comment", comment);
		return("redirect:/result");
	}
	
	@GetMapping("/result")
	public String result(Model model, HttpSession session) {
		
		// retrieve values from session
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("location", session.getAttribute("location"));
		model.addAttribute("language", session.getAttribute("language"));
		model.addAttribute("comment", session.getAttribute("comment"));
		return "result.jsp";
	}
}
