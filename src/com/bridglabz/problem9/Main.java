package com.bridglabz.problem9;

class NotificationService{
    void display(Notification notification){
        notification.send();
    }
}

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        Email hi = new Email("Hi");
        notificationService.display(hi);

        SMS hello = new SMS("Hello");
        notificationService.display(hello);

        PushNotification bye = new PushNotification("Bye");
        notificationService.display(bye);


    }
}
