package com.example.petclinic.serviceimpl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.example.petclinic.domain.Animal;
import com.example.petclinic.repository.AnimalRepository;
import com.example.petclinic.service.AnimalService;

@Service
@Profile("dev")
public class AnimalServiceImpl extends CRUDService<Animal> implements AnimalService {

	public AnimalServiceImpl(AnimalRepository repository) {
		super(repository);
	}
	
}