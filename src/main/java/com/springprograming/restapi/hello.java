package com.springprograming.restapi;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@PostMapping("/hellow")
	public String hellow() {
		return"hello world";
		
	}
	
	

}
