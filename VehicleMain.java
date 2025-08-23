package poly.poly3;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bus() , new AIrplane() , new Train() , new Vehicle()};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if(vehicle instanceof Bus){
                Bus bus = (Bus) vehicle;
                bus.tapCard();
            }else if(vehicle instanceof Train){
                Train train = (Train) vehicle;
                train.reservaSeat();
            }
        }

    }

}
