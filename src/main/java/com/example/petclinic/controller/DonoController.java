package com.example.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.petclinic.service.DonoService;

@Controller
@RequestMapping("/dono")
public class DonoController {
	
	private final DonoService donoService;
	
	public DonoController(DonoService donoService) {
		this.donoService = donoService;
	}
	
	@RequestMapping("")
	public String dono(Model model) {
		model.addAttribute("donos", donoService.findAll());
		return "dono/list";
	}
	
}