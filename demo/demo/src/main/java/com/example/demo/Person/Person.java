package com.example.demo.Person;

public abstract class Person {
    public Person(String adress, Integer plz, String street) {
        this.adress = adress;
        this.plz = plz;
        this.street = street;
    }

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

    @Override
    public String toString() {
        return "Person{" +
                "adress='" + adress + '\'' +
                ", plz=" + plz +
                ", street='" + street + '\'' +
                '}';
    }
}
