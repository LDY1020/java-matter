package access.access2;

public class Car extends Vehicle{

    public String fuel;

    Car(String name , int speed , String fuel){
        super(name , speed);
        this.fuel = fuel;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(" - 연료:" + fuel);
    }
}
