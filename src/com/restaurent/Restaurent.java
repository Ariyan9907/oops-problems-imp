package com.restaurent;


public class Restaurent {
    private String name;
    private Menu menu;

    public Restaurent(String name){
        this.name=name;
        this.menu= new Menu();
    }

    public String getName() {
        return name;
    }

    public Menu getMenu() {
        return menu;
    }
}
