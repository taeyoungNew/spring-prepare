package com.sparta.springprepare.controller;

import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
	
	// HTTP메서드의 GET
	@GetMapping("/api/hello")
	public String hello() {
		return "Hello world";
	}
}
