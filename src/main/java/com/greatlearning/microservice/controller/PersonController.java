package com.greatlearning.microservice.controller;

import com.greatlearning.microservice.entity.PersonJava;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @GetMapping("/{id}")
    public ResponseEntity<List<PersonJava>> getPerson(@PathVariable int id){
        List<PersonJava> persons = new ArrayList<>();
        for (int i = id; i < id+1000000; i++) {
            persons.add(new PersonJava(i,"Manoj" + i, true) );
        }
        return  new ResponseEntity<>(persons, HttpStatus.OK);
    }
}
