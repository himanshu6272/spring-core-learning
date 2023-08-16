package org.example.referencetype;

public class B {
    private String name;
    private String city;

    public B(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public B() {
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
