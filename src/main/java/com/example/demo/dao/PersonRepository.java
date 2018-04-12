package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;


@Repository
@EnableMongoRepositories
public interface PersonRepository extends CrudRepository<Person, Long>{
	
	Optional<Person> findByFirstName(String firstName);


	
}
