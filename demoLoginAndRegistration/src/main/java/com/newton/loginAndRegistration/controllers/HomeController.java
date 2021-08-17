package com.newton.loginAndRegistration.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.newton.loginAndRegistration.models.LoginUser;
import com.newton.loginAndRegistration.models.User;
import com.newton.loginAndRegistration.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
    @GetMapping("/")
    public String index(@ModelAttribute("newUser")User user, @ModelAttribute("newLogin") LoginUser newLogin,Model model) {
//        model.addAttribute("newUser", new User());
//        model.addAttribute("newLogin", new LoginUser());
        return "index.jsp";
    }
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session, 
            RedirectAttributes redirectAttributes) {
    	
    	// send model from form for additional validations
        this.userService.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            redirectAttributes.addFlashAttribute("error", "Failed to register a user");
            return "index.jsp";
        }
        session.setAttribute("user_id", newUser.getId());
        redirectAttributes.addFlashAttribute("success", "User registered!");
        return "redirect:/home";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
        User user = this.userService.login(newLogin, result);
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "index.jsp";
        }
        session.setAttribute("user_id", user.getId());
        return "redirect:/home";
    }
    
    @GetMapping("home")
    public String home(HttpSession session, Model model,  RedirectAttributes redirectAttributes) {
    	Long loggedUserId = (Long)session.getAttribute("user_id");
    	Long userId = (Long)session.getAttribute("user_id"); 
    	
    	if(loggedUserId == null) {
    		redirectAttributes.addFlashAttribute("error", "You have to log in!");
    		return "redirect:/";
    	}
    	User user = this.userService.findUserById(userId);
    	model.addAttribute("user", user);
    	return "home.jsp";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.removeAttribute("user_id");
    	return "redirect:/";
    }
}
