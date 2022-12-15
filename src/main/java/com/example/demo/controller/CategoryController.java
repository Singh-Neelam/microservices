package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class CategoryController {
	
	

	@GetMapping("/message")
	public ResponseEntity<String> findCategoryById() {
		String message = "open shift project";
			return new ResponseEntity<String>(message,HttpStatus.OK);
		}

}
