package com.everis.java.elockers.webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/staff")
public class StaffController {


	@GetMapping(value = "/{id}")
	public findById(@PathVariable("id") Long id) {
		
	
	
	}

}