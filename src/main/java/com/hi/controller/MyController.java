package com.hi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hi.model.Person;
import com.hi.service.personService;

@RestController
public class MyController {
	
	@Autowired
	private personService service;
	
	@PostMapping("/save")
	public String savePerson(@RequestBody Person person) {
		return service.savePerson(person);
	}
	
	@GetMapping("/all")
	public List<Person> getAllPersons() {
		return service.getAllPersons();
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getAllPersonById(@PathVariable int id) {
		return service.getPersonById(id);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deletePersonById(@PathVariable int id) {
		return service.deletePersonById(id);
	}
}
