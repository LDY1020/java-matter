package 다형성활용;

public class Dog implements Animal{


    @Override
    public void sound() {
        System.out.println("멍멍!");
    }
}
