package matter;

public class animalMain {
    public static void main(String[] args) {
        animal[] animal = new animal[3];

        animal[0] = new animal();
        animal[0].name = "초코";
        animal[0].type = "사자";
        animal[0].age = 18;

        animal[1] = new animal();
        animal[1].name = "코코";
        animal[1].type = "호랑이";
        animal[1].age = 11;

        animal[2] = new animal();
        animal[2].name = "냥이";
        animal[2].type = "고양이";
        animal[2].age = 10;

        printAnimal(animal);


    }
    static void printAnimal(animal[] animals){
        for (animal animal : animals) {
            System.out.println("이름:"+animal.name + " 종류:" + animal.type + " 나이:" + animal.age);
        }
    }
}
