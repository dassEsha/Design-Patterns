package DIP.GoodCode;

public class EmailServices implements NotificationChannel{
    @Override
    public void send(String msg) {
        System.out.println("Sending Email" +msg);
    }
}
