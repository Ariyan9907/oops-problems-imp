package com.bridglabz.problem3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(101,"BMW","Electric",4);
        car.display();
        Bike bike = new Bike(102,"Pulser","Petrol",250);
        bike.display();
        Truck truck = new Truck(102,"Pulser","Petrol",2000);
        truck.display();
    }
}
