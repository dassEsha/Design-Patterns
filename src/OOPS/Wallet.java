package OOPS;

public class Wallet implements PaymentMethod{
    String walletId;

    Wallet(String id){
        this.walletId = id;
    }
    @Override
    public void pay() {
        System.out.println("Making Payment via wallet");
    }
}
