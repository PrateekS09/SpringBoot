package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;


@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
	
	Optional<Person> findByFirstName(String firstName);
	
	
	@Query("select p from Person p where p.lastName = :lastName")
	Stream<Person> findByLastNameReturnStream(@Param("lastName") String lastName);

	
}
