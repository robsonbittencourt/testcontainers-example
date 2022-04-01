package com.rbittencourt.testcontainers.example.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Long create(String name) {
        Person person = new Person(name);
        return repository.save(person).getId();
    }

}
