package com.hcl.springboot.toy;

import com.hcl.springboot.dog.Dog;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Toy {

	@Id
	private String id;
	private String breed;
	private int weight;
	
	@ManyToOne
	Dog dog;
	
	// constructors
	public Toy() {
		
	}
	
	public Toy(String id, String breed, int weight, String dogId) {
		super();
		this.id = id;
		this.breed = breed;
		this.weight = weight;
		
		this.dog = new Dog(dogId, "", 0);
	}
	
	// getters & setters
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Dog getDog() {
		return dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}
}
