package com.sb.bean.inheritance;

public class Brands {
    private String cars;
    private String bikes;

    public void getAutos() {
        System.out.println(autos);
    }

    public void setAutos(String autos) {
        this.autos = autos;
    }

    private String autos;

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
}
