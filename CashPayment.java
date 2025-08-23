package poly.poly2;

public class CashPayment extends Payment{

    @Override
    public void pay(int amount){
        System.out.println("현금으로" + amount + "원 결제");
    }
}
