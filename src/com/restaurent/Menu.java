package com.restaurent;

import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<FoodItem> foodItems= new ArrayList<FoodItem>();

   public void add(FoodItem item){
       foodItems.add(item);
   }

   public void displayManu(){
       for(FoodItem item:foodItems){
           System.out.println(item.getId()+" "+item.getName()+" "+item.getPrice());
       }
   }

   public List<FoodItem> getFoodItems(){
       return foodItems;
   }
}
