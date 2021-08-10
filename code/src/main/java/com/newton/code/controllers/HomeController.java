package com.newton.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		
		return "index.jsp";
	}
	
	@PostMapping("code")
	public String code(@RequestParam("code") String code, Model model, RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")) {
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}	
	}
}
