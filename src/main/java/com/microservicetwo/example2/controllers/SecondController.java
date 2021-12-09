package com.microservicetwo.example2.controllers;

import javax.ws.rs.Produces;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicetwo.example2.models.JavaResponse;

@RestController
@RequestMapping("/consumer")
public class SecondController {
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/message")
	public JavaResponse test() {
		
		System.out.println("===============microserive2==========");
		
		
		JavaResponse j = new JavaResponse();
		j.setResponse("Hello Welcome To  Second Service");
		return j;
	}
}
