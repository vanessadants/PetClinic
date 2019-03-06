package com.example.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinic.service.AnimalService;

@Controller
@RequestMapping("/animal")
public class AnimalController {
	
	private final AnimalService animalService;
	
	public AnimalController(AnimalService animalService) {
		this.animalService = animalService;
	}
	
	@RequestMapping("")
	public String animal(Model model) {
		model.addAttribute("animais",animalService.findAll());
		return "animal/list";
	}
	
}