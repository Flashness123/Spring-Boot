package com.example.demo;

import com.example.demo.Person.Person;
import com.example.demo.Person.PersonPrivate;
import com.example.demo.Product.Category;
import com.example.demo.Product.HardwareProduct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		Person person1 = new PersonPrivate("NY",18181,"FillStreet", "Olaf", "Friedel");
		System.out.println("Hello World");
		System.out.println(person1.getAdress());
		System.out.println("Test Hardware Erstellen: ");
		HardwareProduct product1 = new HardwareProduct(0, "DVD",15,"", Category.LAPTOP);
		HardwareProduct product2 = new HardwareProduct(1, "SSD",150,"",Category.LAPTOP);
		HardwareProduct product3 = new HardwareProduct(2, "PC",1500,"",Category.RECHNER);



	}
}
