package com.bridglabz.problem9;

public interface Notification {
    void send();
}

class Email implements Notification{
     private String msg;

     Email(String msg){
         this.msg=msg;
     }

     @Override
    public void send(){
         System.out.println(msg+" sent by Email");
     }
}

class SMS implements Notification{
    private String msg;

    SMS(String msg){
        this.msg=msg;
    }

    @Override
    public void send(){
        System.out.println(msg+" sent by Email");
    }
}

class PushNotification implements Notification{
    private String msg;

    PushNotification(String msg){
        this.msg=msg;
    }

    @Override
    public void send(){
        System.out.println(msg+" sent by Email");
    }

}
