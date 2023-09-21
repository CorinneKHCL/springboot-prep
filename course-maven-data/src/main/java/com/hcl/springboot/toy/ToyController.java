package com.hcl.springboot.toy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.springboot.dog.Dog;

@RestController
public class ToyController {
	
	// dependency to service which is injected
	@Autowired
	private ToyService toyService;
	
	@RequestMapping("/dogs/{id}/toys")
	//eventually will get breeds from database
	public List<Toy> getAllBreeds(@PathVariable String id) {
		return toyService.getAllToys(id);
	}
	
	// CRUD operations
	//allowing id to be a var to match any options
	@RequestMapping("/dogs/{dogId}/toys/{id}")
	public Toy getToy(@PathVariable String id) {
		return toyService.getToy(id);
	}
	
	// post request
	@RequestMapping(method=RequestMethod.POST, value="/dogs/{dogId}/toys")
	public void addToy(@RequestBody Toy toy, @PathVariable String dogId) {
		toy.setDog(new Dog(dogId, "", 0));
		toyService.addToy(toy);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/dogs/{dogId}/toys/{id}")
	public void updateToy(@RequestBody Toy toy, @PathVariable String dogId) {
		toy.setDog(new Dog(dogId, "", 0));
		toyService.updateToy(toy);
	}
	
	//allowing id to be a var to match any options
	@RequestMapping(method=RequestMethod.DELETE, value="/dogs/{dogId}/toys/{id}")
	public void deleteToy(@PathVariable String id) {
		toyService.deleteToy(id);
	}
}
