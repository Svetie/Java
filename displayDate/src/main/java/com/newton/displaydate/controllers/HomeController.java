package com.newton.displaydate.controllers;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String tempDate(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String tempTime(Model model) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(date));
		model.addAttribute("time", sdf.format(date));
		
		return "time.jsp";
	}
}
