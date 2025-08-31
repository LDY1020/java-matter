package 다형성활용;

public class AnimalMain {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();

        Cat cat = new Cat();
        trainer.setTrain(cat);

        Dog dog = new Dog();
        trainer.setTrain(dog);

    }
}
