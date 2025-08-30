package 다형성.다형성3;

public class Bus extends Vehicle{

    @Override
    public void move(){
        System.out.println("버스가 달립니다");
    }
    public void tapCard(){
        System.out.println("교통카드 찍음");
    }
}
