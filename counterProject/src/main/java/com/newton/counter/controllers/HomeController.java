package com.newton.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index(HttpSession session, Model model) {
		
		if(session.getAttribute("count") == null) {
			 session.setAttribute("count", 1);
		} else {
			 Integer count = (Integer) session.getAttribute("count");
			 session.setAttribute("count", count+1);
		}
		
		model.addAttribute("count", session.getAttribute("count"));
		return "index.jsp";
	}
	
	@RequestMapping("/counter")
	public String count(HttpSession session, Model model) {
		model.getAttribute("count");
		return "counter.jsp";
	}

}
