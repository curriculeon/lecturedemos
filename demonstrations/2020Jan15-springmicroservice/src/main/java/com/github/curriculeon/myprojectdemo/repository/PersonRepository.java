package com.github.curriculeon.myprojectdemo.repository;

import com.github.curriculeon.myprojectdemo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
