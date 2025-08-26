package poly.poly7;

public abstract class Device {

    public String name;

    Device(String name){
        this.name = name;
    }

    public abstract void turnOn();

    public void info(){
        System.out.println("장치 이름 : "  + name);
    }
}
