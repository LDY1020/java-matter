package poly.poly7;

public class TV extends Device{

    TV(String name){
        super(name);
    }
    @Override
    public void turnOn() {
        System.out.println("TV 전원을 킨다");
    }
}
