package poly.poly7;

public class Phone extends Device implements Chargeable , Connectable{

    Phone(String name){
        super(name);
    }

    @Override
    public void turnOn() {
        System.out.println("스마트폰 전원을 킨다");
    }


    @Override
    public void charge() {
        System.out.println("스마트폰을 충전시킨다");
    }

    @Override
    public void connectWifi() {
        System.out.println("스마트폰이 Wifi에 연결된다");
    }
}
