package com.ishaa.main.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        NotificationService emailService = new EmailNotificationService();
        emailService.send("customer89@gmail.com","order confirmed","Thankyou for Purchasing this product");

//        NotificationService sendGridEmailService = new SendGridService();
    NotificationService emailServiceSG = new SendGridAdapter(new SendGridService());
    emailServiceSG.send("divya34@gmail.com","Change Passward","Changing password with 2 step verification process");

    }
}
