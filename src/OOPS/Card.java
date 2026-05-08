package OOPS;

public class CreditCard {
    private String cardNo;
    private String userName;

    public CreditCard(String cardNo,String name){
        this.cardNo = cardNo;
        this.userName = userName;
    }
    public String getCardNo(){
        return cardNo;
    }
    public String getUserName(){
        return userName;
    }
}
