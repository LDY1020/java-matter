package 다형성.다형성3;

public class Airplane extends Vehicle{

    @Override
    public void move(){
        System.out.println("비행기가 납니다");
    }
    public void flyMode(){
        System.out.println("이륙 준비");
    }
}
