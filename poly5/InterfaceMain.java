package poly.poly5;

import poly.poly4.Animal;

public class InterfaceMain {

    public static void main(String[] args) {

        Car car = new Car();
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        moveVehicle(car);
        moveVehicle(bird);
        moveVehicle(airplane);

        flyVehicle(bird);
        flyVehicle(airplane);

    }

    private static void moveVehicle(Movable movable){
        System.out.println("움직임 테스트 시작");
        movable.move();
        System.out.println("움직임 테스트 종료");

    }

    private static void flyVehicle(Flyable flyable){
        System.out.println("날기 테스트 시작");
        flyable.fly();
        System.out.println("날기 테스트 종료");

    }
}
