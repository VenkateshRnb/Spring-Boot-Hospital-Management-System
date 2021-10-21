package com.rnbv.project.hspmanagement.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@GetMapping("/home")
	public String welcomePage() {
		return "Welcome to Hospital Management System";
	}
	
	
	
}
