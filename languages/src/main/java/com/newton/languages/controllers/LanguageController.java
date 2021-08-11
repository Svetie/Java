package com.newton.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newton.languages.models.Language;
import com.newton.languages.services.LanguageService;

@Controller
public class LanguageController {
	
	// tell the controller about service
	private final LanguageService langService;
	
	public LanguageController(LanguageService langService) {
		this.langService = langService;
	}
	
	
	@RequestMapping("/languages")
	public String index(Model model, @ModelAttribute("language") Language lang) {
		List<Language> allLangs = this.langService.allLanguages();
		model.addAttribute("allLangs", allLangs);
		return "index.jsp";
	}
	
	@PostMapping("/languages")
	public String createALanguage(@Valid @ModelAttribute("language") Language lang, 
			BindingResult result) {
        if (result.hasErrors()) {
            return "index.jsp";
        } else {
            langService.createLanguage(lang);
            return "redirect:/languages";
        }
    }
	
	@RequestMapping("/languages/{id}")
	public String showALang(@PathVariable("id") Long id, Model model) {
		Language lang = this.langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "show.jsp";
	}
	
	 @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String updateALanguage(@PathVariable("id") Long id, 
			@Valid @ModelAttribute("lang") Language lang, BindingResult result) {
		if (result.hasErrors()) {    
            return "edit.jsp";
        } else {
            this.langService.updateLanguage(lang);
            return "redirect:/languages";
        }
	}
	
	@RequestMapping("/languages/{id}/edit")
	public String editALanguage(@PathVariable("id") Long id, Model model) {
		Language lang = this.langService.findLanguage(id);
		model.addAttribute("lang", lang);
		return "edit.jsp";
	}
	
	@RequestMapping("/languages/{id}/delete")
	public String deleteALanguage(@PathVariable("id") Long id) {
		this.langService.deleteLanguage(id);
		return "redirect:/languages";
	}
	

}
