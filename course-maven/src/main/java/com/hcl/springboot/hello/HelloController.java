package com.hcl.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// add spring controller annotation (rest controller)
// methods in class which map to url requests
@RestController
public class HelloController {
	
	// needs request mapping to url
	// only for get requests
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi! Welcome to this Spring Boot Site.";
	}

}
