package com.hcl.springboot.toy;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ToyRepository extends CrudRepository<Toy, String> {
	public List<Toy> findByDogId(String dogId);
}
