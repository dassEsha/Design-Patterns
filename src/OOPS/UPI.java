package OOPS;

public class UPI implements PaymentMethod {
   String upiId;

   UPI(String id){
       this.upiId = id;
   }
    @Override
    public void pay() {
        System.out.println("Making Payment via UPI" +upiId);
    }
}
