package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.models.Language;
import com.example.demo.repositories.LanguageRepository;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;
    
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public List<Language> allLanguages() {
        return languageRepository.findAll();
    }

    public Language createLanguage(Language L) {
        return languageRepository.save(L);
    }

    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
	public Language updateLanguage(Long id, String name, String creator, String currentVersion) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
           optionalLanguage.map(target -> {
                target.setName(name);
                target.setCreator(creator);
                target.setCurrentVersion(currentVersion);
                languageRepository.save(target);

                return target; 
                	});
           return optionalLanguage.get();
        } else {
            return null;
        }
	}
	public void deleteLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
        	languageRepository.deleteById(id);
        }
				
	}
}
