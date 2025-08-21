package access.access2;

public class Bike extends Vehicle{

    public String type;

    Bike(String name , int speed , String type){
        super(name , speed);
        this.type = type;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(" - 종류:" + type);
    }
}
