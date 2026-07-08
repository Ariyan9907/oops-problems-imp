package com.restaurent;

public class Main {
    public static void main(String[] args) {
        Restaurent restaurent = new Restaurent("Zomato");

        FoodItem pizza = new FoodItem(1, "Fizza", 250);
        FoodItem pepsi = new FoodItem(2, "Pepsi", 38);

        restaurent.getMenu().add(pizza);
        restaurent.getMenu().add(pepsi);

        System.out.println("Manu is Showing below");
        restaurent.getMenu().displayManu();

        PrimiumCustomer customer = new PrimiumCustomer("Aryan");

        Order order = new Order(101, customer, restaurent);
        order.addItem(new OrderItem(pizza,2));
        order.addItem(new OrderItem(pepsi,3));

        order.displayOrder();

        //payment
        PayingPermit payingPermit = new PayingPermit();
        payingPermit.permit(new UPI());

        //notification
        Notification notification = new Email("Confirmed");
        notification.send();

        DeliveryPartner partner = new DeliveryPartner(1, "Ramesh");
        partner.deliver(order);


    }
}
