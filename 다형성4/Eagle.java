package 다형성.다형성4;

public class Eagle extends Animal{

    Eagle(String name){
        super(name);
    }

    @Override
    public void sound(){
        System.out.println("끼이익");
    }
}

