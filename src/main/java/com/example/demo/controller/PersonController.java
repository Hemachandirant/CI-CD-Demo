package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	
	@RequestMapping("/getName")
	public String getName() {
		return "Hai! It is working";
	}
	@RequestMapping("/getVersion")
	public String getVersion() {
		return "The version is 1.0";
	}
}
