package poly.poly2;

public class PaymentMain {

    public static void main(String[] args) {
        Payment[] payments = {new CardPayment() , new CashPayment() , new KaKaoPayment()};

        for (Payment payment : payments) {
            payment.pay(10000);
        }

    }
}
