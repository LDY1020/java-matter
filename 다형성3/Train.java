package 다형성.다형성3;

public class Train extends Vehicle{

    @Override
    public void move(){
        System.out.println("기차가 달립니다");
    }
    public void reserveSeat(){
        System.out.println("좌석 예약 완료");
    }
}
