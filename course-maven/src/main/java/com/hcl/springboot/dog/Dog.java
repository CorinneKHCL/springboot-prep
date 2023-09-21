package com.hcl.springboot.dog;

public class Dog {

	private String id;
	private String breed;
	private int weight;
	
	// constructors
	public Dog() {
		
	}
	
	public Dog(String id, String breed, int weight) {
		super();
		this.id = id;
		this.breed = breed;
		this.weight = weight;
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
}
