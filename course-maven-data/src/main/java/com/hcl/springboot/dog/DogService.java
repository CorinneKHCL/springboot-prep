package com.hcl.springboot.dog;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// business service (singletons -- kept in memory as one instance)
// other controllers might need to declare dependencies
@Service
public class DogService {
	
	@Autowired
	private DogRepository dogRepo;
	
	public List<Dog> getAllDogs(){
		List<Dog> dogs = new ArrayList<>();
		dogRepo.findAll()
		.forEach(dogs::add);
		return dogs;
	}
	
	public Dog getDog(String id) {
		return dogRepo.findById(id).get();
	}
	
	public void addDog(Dog dog) {
		dogRepo.save(dog);
	}
	
	public void updateDog(Dog dog) {
		dogRepo.save(dog);
	}

	public void deleteDog(String id) {
		dogRepo.deleteById(id);
		
	}

}
