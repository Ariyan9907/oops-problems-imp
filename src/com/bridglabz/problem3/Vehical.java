package com.bridglabz.problem3;

public class Vehical{
    private int regNum;
    private String brand;
    private String fuelType;

    public Vehical(){

    }

    public Vehical(int regNum, String brand, String fuelType) {
        this.regNum = regNum;
        this.brand = brand;
        this.fuelType = fuelType;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    void start(){
        System.out.println("Vehical is started");
    }

    void stop(){
        System.out.println("Vehical is stoped");
    }
}

class Car extends Vehical{
    private int seatingCapacity;

    public Car(int regNum, String brand, String fuelType, int seatingCapacity) {
        super(regNum, brand, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    void display(){
        System.out.println("Number:"+getRegNum()+"Brand:"+getBrand()+"fuelType:"+getFuelType()+"Seating Capacity:"+getSeatingCapacity());
    }
}

class Bike extends Vehical{
    private int enginCapacity;

    public Bike(int regNum, String brand, String fuelType, int enginCapacity) {
        super(regNum, brand, fuelType);
        this.enginCapacity = enginCapacity;
    }

    public int getEnginCapacity() {
        return enginCapacity;
    }

    public void setEnginCapacity(int enginCapacity) {
        this.enginCapacity = enginCapacity;
    }

    void display(){
        System.out.println("Number:"+getRegNum()+"Brand:"+getBrand()+"fuelType:"+getFuelType()+"Engine Capacity:"+getEnginCapacity());
    }
}

class Truck extends Vehical{
    private int loadCapacity;

    public Truck(int regNum, String brand, String fuelType, int loadCapacity) {
        super(regNum, brand, fuelType);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    void display(){
        System.out.println("Number:"+getRegNum()+"Brand:"+getBrand()+"fuelType:"+getFuelType()+"Load Capacity:"+getLoadCapacity());
    }
}



