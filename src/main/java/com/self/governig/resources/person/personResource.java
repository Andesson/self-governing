package com.self.governig.resources.person;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.self.governig.model.person.Person;

@RestController
@RequestMapping(value = "/person")
public class personResource {
	
	@GetMapping
	public ResponseEntity<Person> findALL(){
		Person p = new Person(1L,"Andesson", "Lins Dionisio", "andessonlins93@gmail.com");
		return ResponseEntity.ok().body(p);
	}

}
