package 다형성.다형성3;

public class VehicleMain {

    public static void main(String[] args) {
        Vehicle[] vehicles = {new Airplane() , new Bus() , new Train()};

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            if(vehicle instanceof Airplane){
                Airplane airplane = (Airplane) vehicle;
                airplane.flyMode();
            }

        }
    }
}
