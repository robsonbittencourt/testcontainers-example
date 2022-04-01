package com.rbittencourt.testcontainers.example.person;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
