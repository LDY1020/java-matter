package poly.poly7;

public class Laptop extends Device implements Chargeable{

    Laptop(String name){
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("노트북 전원을 킨다");
    }


    @Override
    public void charge() {
        System.out.println("노트북을 충전시킨다");
    }
}
