package com.example.petclinic.dbinitializer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.petclinic.domain.Animal;
import com.example.petclinic.domain.Dono;
import com.example.petclinic.domain.Pessoa;
import com.example.petclinic.domain.Raca;
import com.example.petclinic.domain.TipoAnimal;
import com.example.petclinic.service.AnimalService;
import com.example.petclinic.service.DonoService;

@Component
public class Loader implements CommandLineRunner {

	private final DonoService donoService;
	private final AnimalService animalService;
	
	public Loader(DonoService donoService, AnimalService animalService) {
		this.donoService = donoService;
		this.animalService= animalService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		load();
	}

	private void load() {
		/*Dono d1= new Dono();
		Pessoa p1= new Pessoa();
		p1.setNome("Vanessa Dantas");
		p1.setTelefone("996288959");
		p1.setCidade("Natal");
		p1.setEndereco("R. Beatriz Pinheiro, 1360");
		d1.setPessoa(p1);
		donoService.save(d1);
		
		Dono d2= new Dono();
		Pessoa p2= new Pessoa();
		p2.setNome("Sandra Helena");
		p2.setTelefone("996648480");
		p2.setCidade("Natal");
		p2.setEndereco("R. Beatriz Pinheiro, 1360");
		d2.setPessoa(p2);
		donoService.save(d2);
		
		Animal a1= new Animal();
		Raca r1=new Raca();
		TipoAnimal t1= new TipoAnimal();
		a1.setNome("Lili");
		a1.setDono(d1);
		r1.setDescricao("YorkShire");
		t1.setDescricao("Cachorro");
		r1.setTipoAnimal(t1);
		a1.setRaca(r1);
		animalService.save(a1);*/
		
		
	}
	
}
