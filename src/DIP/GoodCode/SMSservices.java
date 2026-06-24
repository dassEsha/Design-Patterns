package DIP.GoodCode;

public class SMSservices implements NotificationChannel{
    @Override
    public void send(String msg){
        System.out.println("Sending Messages.." +msg);
    }
}
