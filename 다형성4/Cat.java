package 다형성.다형성4;

public class Cat extends Animal implements Pet{

    Cat(String name){
        super(name);
    }
    @Override
    public void play() {
        System.out.println("쥐 잡기 놀이");
    }
    @Override
    public void sound(){
        System.out.println("야옹");
    }
}
