package com.example.demo.service;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Person;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository repository;
	
	
	
	public void savePerson(Person p) {
		repository.save(p);
	}
	
	//@Transactional
	public void updatePerson(Person p) {
		//p.setId(personId);
		repository.save(p);
		System.out.println(" Person is updated in the repo");
	}
	
	/*public Collection<Person> findAll() {
		return repository.findAll();
	}*/
	
	public Person findByPersonId(Long personId) throws ResourceNotFoundException{
		try {
		Optional<Person> person = repository.findById(personId);
		return person.get();
		} catch (NoSuchElementException e) {
			throw new ResourceNotFoundException(e.getMessage());
		}
	}
	
	
	

}
