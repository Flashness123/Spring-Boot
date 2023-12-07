package com.example.demo.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public abstract class Person {
    public Person(){}
    public Person(String adress, Integer plz, String street) {
        this.adress = adress;
        this.plz = plz;
        this.street = street;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String adress;
    Integer plz;
    String street;


    public String getAdress() {
        return adress;
    }

    public Integer getPlz() {
        return plz;
    }

    public String getStreet() {
        return street;
    }
    public Long getId(){return id;}

    @Override
    public String toString() {
        return "Person{" +
                "id= " + id + '\'' +
                "adress='" + adress + '\'' +
                ", plz=" + plz +
                ", street='" + street + '\'' +
                '}';
    }
}
