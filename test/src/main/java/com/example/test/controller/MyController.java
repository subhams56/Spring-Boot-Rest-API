package com.example.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/casual")
	public String casualOperation()
	{
		return "Casual Operations!!!";
	}
	@GetMapping("/secured")
	public String restrictedOperation()
	{
		return "Secured Operations!!!";
	}
}
