package com.example.demo.Person;

import jakarta.persistence.Entity;

@Entity
public class PersonBusiness extends Person {

    public PersonBusiness(String adress, Integer plz, String street, String businessName) {
        super(adress, plz, street);
        this.businessName = businessName;
    }

    String businessName;

    public String getBusinessName() {
        return businessName;
    }


    @Override
    public String toString() {
        return "PersonBusiness{" +
                "businessName='" + businessName + '\'' +
                ", adress='" + adress + '\'' +
                ", plz=" + plz +
                ", street='" + street + '\'' +
                '}';
    }
}
