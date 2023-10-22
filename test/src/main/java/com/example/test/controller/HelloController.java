package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@GetMapping("/")
	public String hello() {
	    return "<title>Super Market Rest API</title>"
	    		+ "<h1>Welcome to the Super Market Application</h1>"
	    		+ "<h2>Explore the API using <a href='http://localhost:8080/swagger-ui/index.html'>Swagger</a><h2>"
	    		+"<p>Thanks For Visiting </p>";
	      
	}


}
