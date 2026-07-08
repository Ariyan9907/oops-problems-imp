package com.bridglabz.problem2;

interface Payable {
    void pay();
}

class UPI implements Payable{

    @Override
    public void pay() {
        System.out.println("Paying via UPI");
    }
}

class CreditCard implements Payable{

    @Override
    public void pay() {
        System.out.println("Paying via Credit card");
    }
}

class DebitCard implements Payable{

    @Override
    public void pay() {
        System.out.println("Paying via Debit card");
    }
}

class NetBanking implements Payable{

    @Override
    public void pay() {
        System.out.println("Paying via Net Banking");
    }
}

class PayingPermit{
    public void permit(Payable payment){
        payment.pay();
    }
}
public class Checkout{
    public static void main(String[] args) {
        PayingPermit payingPermit = new PayingPermit();

        payingPermit.permit(new UPI());
        payingPermit.permit(new CreditCard());
        payingPermit.permit(new DebitCard());
        payingPermit.permit(new NetBanking());

    }
}
