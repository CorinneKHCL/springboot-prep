package com.hcl.springboot.dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, String> {
	
}
