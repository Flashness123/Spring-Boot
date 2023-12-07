//TODO:Aufgaben erledigt: 1,2,3,4

package com.example.demo;

import com.example.demo.Bestellung.Bestellung;
import com.example.demo.Bestellung.Customstate;
import com.example.demo.Comparator.HardwareDescriptionComparator;
import com.example.demo.Comparator.HardwareWeightComparator;
import com.example.demo.Person.Person;
import com.example.demo.Person.PersonPrivate;
import com.example.demo.Product.Category;
import com.example.demo.Product.HardwareProduct;
import com.example.demo.Product.Product;
import com.example.demo.Repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.*;

@SpringBootApplication
public class DemoApplication {
	private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner demo(PersonRepository personRepository) {
		return (args) -> {

			Person person1 = new PersonPrivate("NY", 18181, "FillStreet", "Olaf", "Friedel");
			System.out.println("Hello World");
			System.out.println(person1.getAdress());
			System.out.println("Test Hardware Erstellen: ");
			HardwareProduct product1 = new HardwareProduct(0, "DVD", 15, "", Category.LAPTOP);
			HardwareProduct product2 = new HardwareProduct(1, "SSD", 150, "", Category.LAPTOP);
			HardwareProduct product3 = new HardwareProduct(2, "PC", 1500, "", Category.RECHNER);

			List<HardwareProduct> sortiment = new ArrayList<>();
			sortiment.add(product1);
			sortiment.add(product2);
			sortiment.add(product3);

			System.out.println("Before Sorting : " + sortiment);
			HardwareDescriptionComparator hardwareDescriptionComparator = new HardwareDescriptionComparator();
			Collections.sort(sortiment, hardwareDescriptionComparator);
			System.out.println("After Sorting : " + sortiment);

			System.out.println("Before Sorting : " + sortiment);
			HardwareWeightComparator hardwareWeightComparator = new HardwareWeightComparator();
			Collections.sort(sortiment, hardwareWeightComparator.reversed()); //reversed
			System.out.println("After Sorting : " + sortiment);

			LocalDateTime timenow = LocalDateTime.now();

			Bestellung bestellung = new Bestellung(person1, product1, timenow, 20, Customstate.BESTELLT);
			System.out.println(bestellung);

//			personRepository.save(new Person("Meier", "Michael" ,"michael.meier@gmx.de",LocalDate.of(1975, 6, 18), "01067", "Dresden"));
//			personRepository.save(new Person("Richter", "Heinz","heinzi@web.de",LocalDate.of(1960, 5, 28), "01029", "Dresden"));
//			personRepository.save(new Person("Lindner", "Elisa", "elisa.lin@gmail.com",LocalDate.of(2000, 10, 5),"01109", "Dresden"));
//			personRepository.save(new Person("Köhler", "Martina", "koehler@gmx.de", LocalDate.of(1965, 12, 28),"01796", "Pirna"));
			personRepository.save(new PersonPrivate("NY",18181,"FillStreet", "Olaf", "Friedel"));
			personRepository.save(new PersonPrivate("NY",18181,"FillStreet", "Kevin", "Friedel")); // Automatically asigned Id = 2
			personRepository.save(new PersonPrivate("NY",18181,"FillStreet", "Merte", "Friedel"));
			personRepository.save(new PersonPrivate("NY",18181,"FillStreet", "Dingel", "Friedel"));
			personRepository.save(new PersonPrivate("NY",18181,"FillStreet", "Jost", "Friedel"));

			System.out.println("--------------------------------------------------------------------------------");

			log.info("Person found with getAllPeople(): ");
			for (Person person : personRepository.getAllPeople()) {
				log.info(person.toString());
			}

			log.info("Person found with standart findAll(): ");
			for (Person p : personRepository.findAll()) {
				log.info(p.toString());
			}

			log.info("Person found with getPeopleById(): ");
			Long id = Long.valueOf(2);
			for (Person p : personRepository.getPeopleById(id)) {
				log.info(p.toString());
			}



			System.out.println("--------------------------------------------------------------------------------");


		};
	}
}

