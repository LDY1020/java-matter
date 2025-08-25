package poly.poly5;

public class Bird implements Movable , Flyable{

    @Override
    public void fly() {
        System.out.println("새가 날개를 퍼덕이며 띤다");
    }

    @Override
    public void move() {
        System.out.println("새가 두 발로 뛴다");
    }
}
