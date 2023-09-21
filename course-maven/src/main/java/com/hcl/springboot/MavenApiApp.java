package com.hcl.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// step 1 : tell spring this is a spring app with annotation
// starting oint for spring app
@SpringBootApplication
public class MavenApiApp {

	public static void main(String[] args) {
		// step 2: tell springboot to start app and create servlet and host app 
		// in servlet and make it available
		// call this static method & sets up default config, app context, 
		// performs class path scan, starts tomcat server
		SpringApplication.run(MavenApiApp.class, args);
		
		// step 3: add a controller (java class)
		// leverages spring mvc which lets you build server side code 
		// as REST API as .json or full html page

	}

}
