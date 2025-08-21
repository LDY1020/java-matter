package access.access2;

public class Vehicle {

    public String name;
    public int speed;

    public Vehicle(String name , int speed){
        this.name = name;
        this.speed = speed;
    }

    public void printInfo(){
        System.out.println("이름:" + name + ", 속도:" + speed + "km" );
    }
}
