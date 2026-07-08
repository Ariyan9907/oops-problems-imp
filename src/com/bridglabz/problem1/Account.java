package com.bridglabz.problem1;

public class Account {
    private int accNo;
    private String name;
    private int balance;

    Account(int accNo,String name,int balance){
        this.accNo=accNo;
        this.name=name;
        if(balance>=0){
            this.balance=balance;
        }

    }

    void deposit(int amt){
        if(amt<=0){
            System.out.println("Enter valid amount to deposite");
            return;
        }
        balance+=amt;
        System.out.println("Balance: "+balance);
    }

    void withdraw(int amt){
        if(amt>balance){
            System.out.println("Insufficiant amount");
            return;
        }

        balance-=amt;
        System.out.println("Remaining Balance: "+balance);
    }

    void display(){
        System.out.println("Account holder detais:");
        System.out.println("Account number:"+accNo);
        System.out.println("Holder Name:"+name);
        System.out.println("Balance:"+balance);
    }



}
