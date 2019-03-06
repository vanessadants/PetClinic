package com.example.petclinic.service;

import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public interface AbstractCRUDService<T> {

	Set<T> findAll();

    T findById(Long id);

    T save(T object);

    void delete(T object);

    void deleteById(Long id);
    
}