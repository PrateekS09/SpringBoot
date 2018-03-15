package com.example.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonRepository;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {
	
	
	@Autowired
	PersonService service;
	
	
	@GetMapping("/getPersons")
	public Collection<Person> getPersons() {
		return service.findAll();
	}
	
	@GetMapping("/getPersons/{personId}")
	public Person getPerson(@PathVariable Long personId) throws ResourceNotFoundException {
		return service.findByPersonId(personId);
	}
	
	@RequestMapping(value = "/updatePerson/{personId}", method = RequestMethod.PUT)
	//@Produces("application/xml")
	public void updatePerson(@RequestBody Person p, @PathVariable Long personId) {
		service.updatePerson(p, personId);
	}
	
	@RequestMapping(value="/createPerson", method=RequestMethod.POST)
	public void createPerson(@RequestBody Person p) {
		System.out.println("Hiiiiiiii");
		service.savePerson(p);
	}
		


}
