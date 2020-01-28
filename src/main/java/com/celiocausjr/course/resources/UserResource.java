package com.celiocausjr.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.celiocausjr.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u1 = new User(1L, "Celio", "celio@gmail.com", "5656956", "565356");
		return ResponseEntity.ok().body(u1);
		
				
		
	}
	
	
}
