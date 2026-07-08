package com.bridglabz.problem7;

class Room{
    private int number;
    private String roomName;

    public Room(int number, String roomName) {
        this.number = number;
        this.roomName = roomName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}

class House{
    private String houseName;
    private Room room1;
    private Room room2;
    House(String houseName){
        this.houseName=houseName;
        room1=new Room(1,"Bedroom");
        room2=new Room(2,"kitchen");
    }

    void display(){
        System.out.println("House name:"+houseName);
        System.out.println("Room Details:");
        System.out.println("Room number:"+room1.getNumber()+" Room Name:"+room1.getRoomName());
        System.out.println("Room number:"+room2.getNumber()+" Room Name:"+room2.getRoomName());

    }
}

public class Main {
    public static void main(String[] args) {
        House house=new House("Shivleela");
        house.display();
    }
}
