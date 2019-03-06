package com.example.petclinic.dbinitializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.domain.Dono;
import com.example.petclinic.service.DonoService;

@Component
public class Loader implements CommandLineRunner {

	private final DonoService donoService;
	
	public Loader(DonoService donoService) {
		this.donoService = donoService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		load();
	}

	private void load() {
		
	}
	
}
