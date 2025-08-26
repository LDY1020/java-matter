package poly.poly7;

import java.util.concurrent.Callable;

public class DeviceMain {

    public static void main(String[] args) {
        Device[] devices = {new Phone("아이폰") , new Laptop("그램") , new TV("삼성 TV")};

        for(Device device : devices){
            device.info();
            device.turnOn();
            if(device instanceof Chargeable) {
                Chargeable c = (Chargeable) device;
                c.charge();
                if(device instanceof Connectable){
                    Connectable co = (Connectable) device;
                    co.connectWifi();
                }
            }
        }
    }
}
