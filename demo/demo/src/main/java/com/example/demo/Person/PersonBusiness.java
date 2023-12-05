package com.example.demo.Person;

public class PersonBusiness extends Person {

    public PersonBusiness(String adress, Integer plz, String street, String businessName, Integer id) {
        super(adress, plz, street);
        this.businessName = businessName;
        this.id = id;
    }

    String businessName;
    Integer id;

    public String getBusinessName() {
        return businessName;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "PersonBusiness{" +
                "businessName='" + businessName + '\'' +
                ", id=" + id +
                ", adress='" + adress + '\'' +
                ", plz=" + plz +
                ", street='" + street + '\'' +
                '}';
    }
}
