//TODO: In einer Bestellung soll erfasst werden können, welcher Kunde welche Produkte in welcher Stückzahl bestellt.
package com.example.demo.Bestellung;

import com.example.demo.Person.Person;
import com.example.demo.Product.Product;

import java.time.LocalDateTime;

public class Bestellung {

    public Bestellung(Person customer, Product product, LocalDateTime orderdate, Integer quantity, Customstate state) {
        this.customer = customer;
        this.product = product;
        this.orderdate = orderdate;
        this.quantity = quantity;
        this.state = state;
    }

    Person customer;
    Product product;
    LocalDateTime orderdate;
    Integer quantity;
    Customstate state;

    @Override
    public String toString() {
        return "Bestellung{" +
                "customer=" + customer +
                ", product=" + product +
                ", orderdate=" + orderdate +
                ", quantity=" + quantity +
                ", state=" + state +
                '}';
    }
}
