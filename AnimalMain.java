package 객체지향;

public class AnimalMain {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.name = "초코";
        a.age = 10;
        a.type = "강아지";
        a.introduce();
    }
}
