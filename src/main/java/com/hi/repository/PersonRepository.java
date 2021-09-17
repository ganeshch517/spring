package com.hi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hi.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
