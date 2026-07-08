package com.restaurent;

public class DeliveryPartner {
    private int id;
    private String name;

    public DeliveryPartner(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void deliver(Order order) {

        System.out.println(name + " is delivering the order...");

        order.setStatus("OUT FOR DELIVERY");

        System.out.println("Order Delivered Successfully.");

        order.setStatus("DELIVERED");
    }
}
