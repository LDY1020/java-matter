package poly.poly2;

public class CardPayment extends Payment{

    @Override
    public void pay(int amount){
        System.out.println("카드로" + amount + "원 결제" );
    }
}
