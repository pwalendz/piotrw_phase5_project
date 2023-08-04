package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to Phase 5 Project app developed by Piotr W!";
	}
}
