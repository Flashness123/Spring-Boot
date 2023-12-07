//TODO ist fur get, post, delete zustandig bei der klasse pewrson
package com.example.demo.Repository;

import com.example.demo.Person.Person;
import com.example.demo.Person.PersonPrivate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Query("SELECT p FROM Person p")
    List<Person> getAllPeople();
}
