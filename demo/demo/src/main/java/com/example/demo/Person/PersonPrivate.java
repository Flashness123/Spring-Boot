package com.example.demo.Person;

import jakarta.persistence.Entity;

@Entity
public class PersonPrivate extends Person {

    public PersonPrivate(String adress, Integer plz, String street, String name, String surname) {
        super(adress, plz, street);
        this.name = name;
        this.surname = surname;
    }
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "PersonPrivate{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", plz=" + plz +
                ", street='" + street + '\'' +
                '}';
    }
}