package OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("IshaaDebitCard", new DebitCard("78988783","Isha Das"));
        ps.addPaymentMethod("IshaaCreditCard", new CreditCard("44534352", "Isha Das"));
        ps.addPaymentMethod("upisbi@ok", new UPI("9090890"));
        ps.addPaymentMethod("IshaaWallet",new Wallet("898999"));
    ps.makePayment("upisbi@ok");
    ps.makePayment("IshaaWallet");
    }
}
