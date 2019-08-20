package com.codingdojo.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.services.LanguageService;


@Controller
public class LanguageController {
	private final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}

	// show all languages
	@RequestMapping("/languages")
	public String index(Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}

	// render page to create new language
	@RequestMapping("/languages/new")
	public String newLanguage(@ModelAttribute("language") Language language) {
		return "/languages/new.jsp";
	}

	// create new language
	@RequestMapping(value = "/languages", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if (result.hasErrors()) {
			return "/languages/new.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}

	// show one language
	@RequestMapping(value = "/languages/show/{id}")
	public String findLanguage(Model model, @PathVariable("id") Long id) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/show.jsp";
	}

	// renders edit page
	@RequestMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/edit.jsp";
	}

	// edit one language  
	@PutMapping("/languages/{id}")
	public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		System.out.println("im awakeeeeee");
		if (result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {

			languageService.createLanguage(language);
			System.out.println("im awakeeeeee");
			return "redirect:/languages";
		}
	}

	// delete one language
	@RequestMapping(value = "/languages/{id}", method = RequestMethod.DELETE)
	public String destroy(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

}
