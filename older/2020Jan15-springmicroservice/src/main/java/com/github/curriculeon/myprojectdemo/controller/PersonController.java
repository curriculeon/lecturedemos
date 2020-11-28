package com.github.curriculeon.myprojectdemo.controller;

import com.github.curriculeon.myprojectdemo.model.Person;
import com.github.curriculeon.myprojectdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by leon on 1/15/2020.
 */
@Controller
public class PersonController {
    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/person/")
    public ResponseEntity<?> findAll() {
        Iterable<Person> allPeople = service.findAll();
        ResponseEntity<?> response = new ResponseEntity<>(allPeople, HttpStatus.OK);
        return response;
    }

    @GetMapping("/person/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Person person = service.findById(id);
        ResponseEntity<?> response = new ResponseEntity<>(person, HttpStatus.OK);
        return response;
    }

    @RequestMapping(value = "/person/", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody Person person) {
        person = service.create(person);
        ResponseEntity<?> response = new ResponseEntity<>(person,HttpStatus.CREATED);
        return response;
    }


    @RequestMapping(value = "/person/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable Long id) {
        Person person = service.delete(id);
        ResponseEntity<?> response = new ResponseEntity<>(person,HttpStatus.OK);
        return response;
    }

    @RequestMapping(value = "/person", method = RequestMethod.PUT)
    public ResponseEntity<?> update(@PathVariable Long id, Person newPersonData) {
        Person person = service.update(id, newPersonData);
        ResponseEntity<?> response = new ResponseEntity<>(person, HttpStatus.OK);
        return response;
    }



}
