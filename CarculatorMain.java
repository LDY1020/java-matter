package 객체지향;

public class CarculatorMain {
    public static void main(String[] args) {
        Carculator c = new Carculator();

        c.add(10 , 5);
        c.showResult();

        c.subract(10 , 5);
        c.showResult();

        c.multiply(10 , 5);
        c.showResult();

        c.divide(10 , 5);
        c.showResult();


    }
}