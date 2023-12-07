package com.example.demo.Controller;

import com.example.demo.Person.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

//@RestController
public class PersonController{
    private PersonService personService;


    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    //@GetMapping
    public Person getPerson(Long id){
        Optional person = personService.getPerson(id);
        if(person.isPresent()){
            return (Person) person.get();
        }
        return null;
    }
}
