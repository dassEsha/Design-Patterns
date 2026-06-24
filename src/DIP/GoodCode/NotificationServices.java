package DIP.GoodCode;

public class NotificationServices {
    private NotificationChannel nfChannel;

    public NotificationServices(NotificationChannel channel){
        this.nfChannel = channel;
    }
    public void notify(String msg){
        nfChannel.send(msg);
    }
}
