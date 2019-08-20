package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	// adding the language repository as a dependency
	private final LanguageRepository languagerepository;
	private CrudRepository<Language, Long> languageRepository;

	public LanguageService(LanguageRepository languagerepository) {
		this.languagerepository = languagerepository;
	}

	// returns all the languages
	public List<Language> allLanguages() {
		return languagerepository.findAll();
	}

	// creates a language
	public Language createLanguage(Language l) {
		return languagerepository.save(l);
	}

	// retrieves a language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languagerepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

	// updates language
	public Language updateLanguage(Long id, String name, String creator, double version) {
		Optional<Language> optionalLanguage = languagerepository.findById(id);
		if (optionalLanguage.isPresent()) {
			Language language = optionalLanguage.get();
			language.setName(name);
			language.setCreator(creator);
			language.setVersion(version);
			return languagerepository.save(language);
		} else {
			return null;
		}
	}
	
	// above code pretty much null
	
	public void updateLanguage(@Valid Language language) {
		languageRepository.save(language);
	}

	// deletes language
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}

}
