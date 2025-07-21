package 객체지향;

public class DrinkMain {
    public static void main(String[] args) {
        Drink drink = new Drink();

        drink.name = "콜라";
        drink.price = 2000;
        drink.size = 500;
        drink.info();


        Drink drink2 = new Drink();
        drink.name = "물";
        drink.price = 1000;
        drink.size = 300;
        drink.info();


        Drink drink3 = new Drink();
        drink.name = "사이다";
        drink.price = 1500;
        drink.size = 500;
        drink.info();
    }
}
