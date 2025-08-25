package poly.poly5;

public class Airplane implements Movable , Flyable{
    @Override
    public void fly() {
        System.out.println("비행기가 하늘을 난다");
    }

    @Override
    public void move() {
        System.out.println("비행기가 도로를 달린다");
    }
}
