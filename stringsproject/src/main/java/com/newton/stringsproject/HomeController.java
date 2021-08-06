package com.newton.stringsproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// prepended route
@RequestMapping("/")
public class HomeController {
	
	// main route
	@RequestMapping("")
	// method that maps the request route above
	public String hello() {
		return "Hello client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with strings";
	}
}
