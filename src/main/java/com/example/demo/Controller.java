package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class Controller {
	@GetMapping("test")
	public String test() {
		return "test is working";
	}
	@GetMapping
	public String test1() {
		return "test chatbot app is  is working";
	}

}
