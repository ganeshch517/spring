package com.hi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hi.model.Person;
import com.hi.repository.PersonRepository;

@Service
public class personService {

	@Autowired
	private PersonRepository personRepo;
	
	public String savePerson(Person person) {
		personRepo.save(person);
		return person.getName()+"'s details have been saved!!";
	}
	
	public List<Person> getAllPersons() {
		return personRepo.findAll();
	}

	public ResponseEntity<?> getPersonById(int id) {		
		Optional<Person> p = personRepo.findById(id);
		if(p.isPresent()) {
			return new ResponseEntity<>(p.get(),HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("No person with the id: "+id+" is present!!",HttpStatus.NOT_FOUND);
		}		
	}

	public ResponseEntity<?> deletePersonById(int id) {		
		Optional<Person> p = personRepo.findById(id);
		if(p.isPresent()) {
			personRepo.deleteById(id);
			return new ResponseEntity<>("person with id: "+id+" successfully deleted!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>("No person with the id: "+id+" is present!! So could not delete person....",HttpStatus.NOT_FOUND);
		}		
	}
	
	
}
