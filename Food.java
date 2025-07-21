package 객체지향;

public class Food {
    String name;
    int price;
    boolean isHot = false;

    void info(){
        System.out.println("음식명:" + name + ", 가격:" + price + "," + isHot);
    }
}
