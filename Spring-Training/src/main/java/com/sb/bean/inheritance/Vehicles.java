package com.sb.bean.inheritance;

public class Vehicles {
    public void getCars() {
        System.out.println(cars);
        //return cars;
    }

    public void setCars(String cars) {
        this.cars = cars;
    }

    public void getBikes() {
        System.out.println(bikes);
        //return bikes;
    }

    public void setBikes(String bikes) {
        this.bikes = bikes;
    }

    private String cars;
    private String bikes;
}
