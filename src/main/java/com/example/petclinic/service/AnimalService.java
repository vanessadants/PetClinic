package com.example.petclinic.service;

import org.springframework.stereotype.Service;

import com.example.petclinic.domain.Animal;

@Service
public interface AnimalService extends AbstractCRUDService<Animal> {

}