package poly.poly3;

public class Bus extends Vehicle{

    @Override
    public void move(){
        System.out.println("버스가 도로 위를 달린다");
    }
    public void tapCard(){
        System.out.println("교통카드 결제");
    }
}
