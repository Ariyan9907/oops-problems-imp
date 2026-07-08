package com.bridglabz.problem4;

public class Main {
    public static void main(String[] args) {
        System.out.println(Utility.add(2,4));;
        System.out.println(Utility.add(5,6,8));
        System.out.println(Utility.add(4.5f,3.2f));
        System.out.println(Utility.add(4,6.2f));

        //type casted
        byte a=2;
        byte b=3;

        System.out.println(Utility.add(a,b));  //mapped to where the nearest type cast method occured that is int,int

    }
}
