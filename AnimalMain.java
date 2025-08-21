package access;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("초코" , "멍멍");
        Cat cat = new Cat("냥이" , "야옹");

        dog.printInfo();
        cat.printInfo();
    }
}
