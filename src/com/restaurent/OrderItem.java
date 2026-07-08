package com.restaurent;

public class OrderItem {
    private FoodItem foodItem;
    private int quality;

    public OrderItem(FoodItem foodItem,int quality){
        this.foodItem=foodItem;
        this.quality=quality;
    }

    public double getTotal(){
        return foodItem.getPrice()*quality;
    }

    public void display(){
        System.out.println(foodItem.getId()+"X"+quality);
    }
}
