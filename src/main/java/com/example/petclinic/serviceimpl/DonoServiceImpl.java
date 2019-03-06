package com.example.petclinic.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.petclinic.domain.Dono;
import com.example.petclinic.repository.DonoRepository;
import com.example.petclinic.service.DonoService;

@Service
public class DonoServiceImpl extends CRUDService<Dono> implements DonoService {

	public DonoServiceImpl(DonoRepository repository) {
		super(repository);
	}
	
}