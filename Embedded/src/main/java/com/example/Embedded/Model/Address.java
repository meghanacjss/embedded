package com.example.Embedded.Model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

    private int addressId;
    private int zipCode;
    private String city;
}
