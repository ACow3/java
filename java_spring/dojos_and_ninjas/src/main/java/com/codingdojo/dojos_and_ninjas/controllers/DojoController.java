package com.codingdojo.dojos_and_ninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojos_and_ninjas.models.Dojo;
import com.codingdojo.dojos_and_ninjas.models.Ninja;
import com.codingdojo.dojos_and_ninjas.services.AppService;

@Controller
public class DojoController {
	@Autowired
	AppService appServ;

	@GetMapping("/dojo/new")
	public String dojoNew(@ModelAttribute("newDojoObj") Dojo dojo) {
		return "dojos/new.jsp";

	}

	@PostMapping("/dojo/new")
	public String createDojo(@Valid @ModelAttribute("newDojoObj") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojos/new.jsp";
		} else {
			appServ.createDojo(dojo);
			return "redirect:/ninja/new";
		}
	}

	@GetMapping("/ninja/new")
	public String newNinja(Model model, @ModelAttribute("newNinjaObj") Ninja ninja) {
		List<Dojo> Dojos = appServ.getAllDojos();
		model.addAttribute("Dojos", Dojos);
		return "/ninjas/new.jsp";
	}

	@PostMapping("/ninja/new")
	public String createNinja(@Valid @ModelAttribute("newNinjaObj") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninjas/new.jsp";
		} else {
			appServ.createNinja(ninja);
			return "redirect:/dojo/new";
		}
		
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo  = appServ.findOneDojo(id);
		model.addAttribute("Ninjas", dojo.getNinjas());
		model.addAttribute("Dojo", dojo);
		return "dojos/ninjasbydojo.jsp";
	}

}