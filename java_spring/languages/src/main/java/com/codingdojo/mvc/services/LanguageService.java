package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;



import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	// adding the language repository as a dependency
	private final LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	// returns all the languages
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}

	// creates a language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}

	// retrieves a language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	// updates language
//	public Language updateLanguage(Long id, String name, String creator, double version) {
//		Optional<Language> optionalLanguage = languageRepository.findById(id);
//		if (optionalLanguage.isPresent()) {
//			Language language = optionalLanguage.get();
//			language.setName(name);
//			language.setCreator(creator);
//			language.setVersion(version);
//			return languageRepository.save(language);
//		} else {
//			return null;
//		}
//	}
	
	// above code pretty much null
	
//	public void updateLanguage(@Valid Language language) {
//		System.out.println("im working");
//		languageRepository.save(language);
//	}

	// deletes language
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
}
