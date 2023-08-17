package org.example.autowiring.xml;

public class Person {
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
