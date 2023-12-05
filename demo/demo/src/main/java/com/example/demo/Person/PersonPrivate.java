package com.example.demo.Person;

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
}

