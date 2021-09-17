package com.hi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;

@Entity
@Table
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String address;
	
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}	
}
