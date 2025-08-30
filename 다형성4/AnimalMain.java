package 다형성.다형성4;

public class AnimalMain {

    public static void main(String[] args) {
        Animal[] animals = {new Dog("초코") , new Cat("냥이") , new Eagle("매워")};

        for (Animal animal : animals) {
            animal.sound();
            if(animal instanceof Pet){
                Pet pet = (Pet) animal;
                pet.play();
            }

        }
    }
}
