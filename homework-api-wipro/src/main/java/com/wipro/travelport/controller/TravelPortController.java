package com.wipro.travelport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class TravelPortController {
	
	
	@GetMapping("/hello")
	public void Hello() {
		
		System.out.println("hola Mundo");
		
	}

}
