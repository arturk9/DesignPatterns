package com.company;


import BuilderPattern.Car;

public abstract class Main {

    public static void main(String[] args) {

        Car car = new Car.Builder()
                .color("red")
                .age(12)
                .build();

        System.out.println(car);
    }
}





