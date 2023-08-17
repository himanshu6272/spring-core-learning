package org.example.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    @Autowired
    @Qualifier("address1")
    private Address address;

    public Person(Address address) {
        this.address = address;
    }
    public Person() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String toString() {
        return "Person{" +
                "address=" + address +
                '}';
    }
}
