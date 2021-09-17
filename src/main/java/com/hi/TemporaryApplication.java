package com.hi;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hi.model.Person;
import com.hi.repository.PersonRepository;

@SpringBootApplication
public class TemporaryApplication {
	
	@Autowired
	private PersonRepository personRepo;

	public static void main(String[] args) {
		SpringApplication.run(TemporaryApplication.class, args);
	}

	@PostConstruct
	public void saveSomePersons() {
		List<Person> persons = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			Person p = new Person("Name"+i,i+22,"Angara part-"+i);
			persons.add(p);
		}
		personRepo.saveAll(persons);
	}
	
}
