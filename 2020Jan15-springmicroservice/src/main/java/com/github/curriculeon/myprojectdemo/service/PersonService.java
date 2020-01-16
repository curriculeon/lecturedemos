package com.github.curriculeon.myprojectdemo.service;

import com.github.curriculeon.myprojectdemo.model.Person;
import com.github.curriculeon.myprojectdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by leon on 1/15/2020.
 */
@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    public Person create(Person person) {
        return personRepository.save(person);
    }

    public Person findById(Long id) {
        return personRepository.findById(id).get();
    }

    public Person delete(Long id) {
        Person personToBeDeleted = this.findById(id);
        personRepository.delete(personToBeDeleted);
        return personToBeDeleted;
    }
}
