package access.access2;

public class VehicleMain {

    public static void main(String[] args) {
        Bike bike = new Bike("MTB" , 30 , "산악자전거");
        Car car = new Car("소나타" , 120  , "휘발유");

        bike.printInfo();
        car.printInfo();
    }
}
