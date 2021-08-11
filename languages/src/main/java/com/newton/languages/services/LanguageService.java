package com.newton.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.newton.languages.models.Language;
import com.newton.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository langRepo;
	
	public LanguageService(LanguageRepository langRepo) {
		this.langRepo = langRepo;
	}
	
	// get all languages
	public List<Language> allLanguages() {
		return langRepo.findAll();
	}
	
	// create a language
	public Language createLanguage(Language lang) {
		return this.langRepo.save(lang);
	}
	
	// retrieve a language
    public Language findLanguage(Long id) {
        Optional<Language> optionalLang = langRepo.findById(id);
        if(optionalLang.isPresent()) {
            return optionalLang.get();
        } else {
            return null;
        }
    }
    
    // delete a language
    public void deleteLanguage(Long id) {
    	this.langRepo.deleteById(id);
    }
    
    // update a book
    public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
		//retrieve a language object from the db that has that id
    	Language lang = this.findLanguage(id);
	
		//update that object
		lang.setName(name);
		lang.setCreator(creator);
		lang.setCurrentVersion(currentVersion);
		
		return this.langRepo.save(lang);
    }
    
    public Language updateLanguage(Language lang) {
    	
    	return this.langRepo.save(lang);
    }
    
}
