package com.example.demo.Service;

import com.example.demo.Person.Person;
import com.example.demo.Person.PersonPrivate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    public List<Person> personList;
    public PersonService(){
        personList = new ArrayList<>();
        Person person1 = new PersonPrivate("NY",18181,"FillStreet", "Olaf", "Friedel");
        Person person2 = new PersonPrivate("NY",18181,"FillStreet", "Kevin", "Friedel");
        Person person3 = new PersonPrivate("NY",18181,"FillStreet", "Merte", "Friedel");
        Person person4 = new PersonPrivate("NY",18181,"FillStreet", "Dingel", "Friedel");
        Person person5 = new PersonPrivate("NY",18181,"FillStreet", "Jost", "Friedel");
        personList.addAll(Arrays.asList(person1,person2,person3,person4,person5));
    }
    public Optional<Person> getPerson(Long id){
        Optional optional = Optional.empty();
        for (Person person: personList){
            if(id == person.getId()){
                optional = Optional.of(person);
                return optional;
            }
        }
        return optional;
    }
}
