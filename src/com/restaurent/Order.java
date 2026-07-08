package com.restaurent;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private Customer customer;
    private Restaurent restaurant;
    private ArrayList<OrderItem> items;
    private String status;

    public Order(int orderId,Customer customer,Restaurent restaurant){
        this.orderId=orderId;
        this.customer = customer;
        this.restaurant = restaurant;
        this.items = new ArrayList<>();
        this.status = "PLACED";

    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateTotal() {

        double total = 0;

        for (OrderItem item : items) {
            total += item.getTotal();
        }

        total = total - (total * customer.getDiscount());

        return total;
    }

    public void displayOrder() {

        System.out.println("\nOrder ID : " + orderId);
        System.out.println("Customer : " + customer.getName());
        System.out.println("Restaurant : " + restaurant.getName());
        System.out.println("Status : " + status);

        System.out.println("\nItems:");

        for (OrderItem item : items) {
            item.display();
        }

        System.out.println("Total : ₹" + calculateTotal());
    }
}
