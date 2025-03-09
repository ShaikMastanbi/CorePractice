package com.immutable;

final public class Employee {
    final private int id;
    final private String name;
    final private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        //deep copy of Address class because address class is mutable,to provide immutableness address we need to take deep copy
        Address add=new Address(address.getCity());
        this.address = add;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
