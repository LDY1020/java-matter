package 다형성활용;

public class Trainer implements Animal{

    private Animal animal;

    public void setTrain(Animal animal){
        System.out.println("훈련 시작!" + animal);
        animal.sound();
    }

    @Override
    public void sound() {
        System.out.println();
    }
}
