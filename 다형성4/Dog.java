package 다형성.다형성4;

public class Dog extends Animal implements Pet{

    Dog(String name){
        super(name);
    }
    @Override
    public void play() {
        System.out.println("공놀이");
    }
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
}
