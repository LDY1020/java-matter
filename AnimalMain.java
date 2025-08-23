package poly;

public class AnimalMain {

    public static void main(String[] args) {
        Animal[] animals = {new Dog() , new Cat() , new Dog()};

        for (Animal animal : animals) {
            animal.sound();;

        }
    }
}
