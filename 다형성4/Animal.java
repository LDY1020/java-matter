package 다형성.다형성4;

public abstract class Animal {

    public String name;

    Animal(String name){
        this.name = name;
    }

    public abstract void sound();
}
