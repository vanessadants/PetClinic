package com.example.petclinic.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.petclinic.domain.Dono;

@Repository
public interface DonoRepository extends CrudRepository<Dono, Long> {

	
}