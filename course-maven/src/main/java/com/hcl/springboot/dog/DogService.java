package com.hcl.springboot.dog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// business service (singletons -- kept in memory as one instance)
// other controllers might need to declare dependencies
@Service
public class DogService {
	
	private List<Dog> dogs = new ArrayList<>(Arrays.asList(
			new Dog("havanese", "Havanese", 12),
			new Dog("beagle", "Beagle", 35),
			new Dog("australian shepherd", "Australian Shepherd", 60)
			));
	
	public List<Dog> getAllDogs(){
		return dogs;
	}
	
	public Dog getDog(String id) {
		return dogs.stream().filter(d -> d.getId().equals(id)).findFirst().get();
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
	}
	
	public void updateDog(String id, Dog dog) {
		for (int i=0; i<dogs.size(); i++) {
			Dog d = dogs.get(i);
			if (d.getId().equals(id)) {
				dogs.set(i, dog);
				return;
			}
		}
	}

	public void deleteDog(String id) {
		dogs.removeIf(d -> d.getId().equals(id));
		
	}

}
