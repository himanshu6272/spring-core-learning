package org.example.constructorInjection;

public class Student {
    private int id;
    private String name;
    private String email;
    private String mobile;
    private Address address;

    public Student(int id, String name, String email, String mobile, Address address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
