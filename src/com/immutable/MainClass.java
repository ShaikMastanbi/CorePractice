package com.immutable;

public class MainClass {
    public static void main(String[] args) {
        Address a1=new Address("bgl");

        Employee e=new Employee(1,"sai",a1);
        a1.setCity("Hyd");
        System.out.println(e);

        System.out.println(e);
    }
}
