package com.restaurent;

public class PrimiumCustomer extends Customer{

    public PrimiumCustomer(String name) {
        super(name);
    }

    @Override
    public double getDiscount(){
        return 0.05;
    }
}
