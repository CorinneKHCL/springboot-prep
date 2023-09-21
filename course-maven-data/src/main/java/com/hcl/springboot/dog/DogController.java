package com.hcl.springboot.dog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DogController {
	
	// dependency to service which is injected
	@Autowired
	private DogService dogService;
	
	@RequestMapping("/dogs")
	//eventually will get breeds from database
	public List<Dog> getAllBreeds() {
		return dogService.getAllDogs();
	}
	
	// CRUD operations
	//allowing id to be a var to match any options
	@RequestMapping("/dogs/{id}")
	public Dog getDog(@PathVariable String id) {
		return dogService.getDog(id);
	}
	
	// post request
	@RequestMapping(method=RequestMethod.POST, value="/dogs")
	public void addDog(@RequestBody Dog dog) {
		dogService.addDog(dog);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/dogs/{id}")
	public void updateDog(@RequestBody Dog dog) {
		dogService.updateDog(dog);
	}
	
	//allowing id to be a var to match any options
	@RequestMapping(method=RequestMethod.DELETE, value="/dogs/{id}")
	public void deleteDog(@PathVariable String id) {
		dogService.deleteDog(id);
	}
}
