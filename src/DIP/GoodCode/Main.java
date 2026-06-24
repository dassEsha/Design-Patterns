package DIP.GoodCode;

public class Main {
    public static void main(String[] args){
        NotificationServices email = new NotificationServices(new EmailServices());
        email.notify("Your oder has been shipped");

        NotificationServices sms = new NotificationServices(new SMSservices());
        sms.notify("Your order will be shipped by tomorrow evening!");
    }
}
