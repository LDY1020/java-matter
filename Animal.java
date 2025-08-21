package access;

public class Animal {

    public String name;

    public Animal(String name){
        this.name = name;
    }

    public void printInfo(){
        System.out.println("이름:" + name);
    }
}
