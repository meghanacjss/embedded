package com.example.Embedded.Model;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Person {
@Id
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    @Embedded
    private Address address;


}
