package access;

public class Dog extends Animal{

    public String sound;

   public Dog(String name , String sound){
        super(name);
        this.sound = sound;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println(" - 소리:" + sound);
    }
}
