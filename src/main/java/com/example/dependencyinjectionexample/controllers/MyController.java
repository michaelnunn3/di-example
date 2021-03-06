package com.example.dependencyinjectionexample.controllers;

import org.springframework.stereotype.Controller;

import com.example.dependencyinjectionexample.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
	
	public MyController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String HelloWorld() {
		return greetingService.sayGreeting();
	}
}
