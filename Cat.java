package access;

public class Cat extends Animal{

    public String sound;

   public Cat(String name ,  String sound){
        super(name);
        this.sound = sound;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(" - 소리:" + sound);
    }
}
