package com.javatraining.encapsulation;

public class PersonDetails {
    public static void main(String args[]){
        Person p = new Person();
        p.setName("Sandeep");
        p.setAge(24);
        p.setMobile("7702688450");
        p.setCity("Rajahmundry");
        System.out.println("Name == "+p.getName());
        System.out.println("Age == "+p.getAge());
        System.out.println("Mobile == "+p.getMobile());
        System.out.println("Address == "+p.getCity());
    }
}
