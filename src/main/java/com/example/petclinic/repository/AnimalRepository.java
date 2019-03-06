package com.example.petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.petclinic.domain.Animal;

@Repository 
public interface AnimalRepository extends CrudRepository<Animal, Long>{

}