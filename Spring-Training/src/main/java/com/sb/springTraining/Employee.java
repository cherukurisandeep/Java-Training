package com.sb.springTraining;

public class Employee {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Employee() {System.out.println("def cons");}

    public Employee(int id) {this.id = id;}

    public Employee(String name) {  this.name = name;}


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(name+" with id : "+id);
    }
}
