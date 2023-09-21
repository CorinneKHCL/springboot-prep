package com.hcl.springboot.toy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// business service (singletons -- kept in memory as one instance)
// other controllers might need to declare dependencies
@Service
public class ToyService {
	
	@Autowired
	private ToyRepository toyRepo;
	
	public List<Toy> getAllToys(String id){
		List<Toy> toys = new ArrayList<>();
		toyRepo.findByDogId(id)
		.forEach(toys::add);
		return toys;
	}
	
	public Toy getToy(String id) {
		return toyRepo.findById(id).get();
	}
	
	public void addToy(Toy toy) {
		toyRepo.save(toy);
	}
	
	public void updateToy(Toy toy) {
		toyRepo.save(toy);
	}

	public void deleteToy(String id) {
		toyRepo.deleteById(id);
		
	}

}
