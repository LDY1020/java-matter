package 객체지향;

public class DrinkMain2 {
    public static void main(String[] args) {
        Drink[] drink = new Drink[3];

       drink[0] = new Drink();
        drink[0].name = "콜라";
        drink[0].price = 2000;
        drink[0].size = 500;
        drink[0].info();

       drink[1] = new Drink();
        drink[1].name = "물";
        drink[1].price = 1000;
        drink[1].size = 500;
        drink[1].info();

       drink[2] = new Drink();
        drink[2].name = "사이다";
        drink[2].price = 2500;
        drink[2].size = 500;
        drink[2].info();


    }
}
