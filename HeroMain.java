package access;

public class HeroMain {
    public static void main(String[] args) {
        Hero hero1 = new Hero("도윤" , "마법사" , 50 , 100);
        hero1.info();

        Hero hero2 = new Hero("철수" , "전사" , 70 , 150);
        hero2.info();

        Hero hero3 = new Hero("영희" , "마법사" , 40 , 80);
        hero3.info();

        Hero[] heroes = {hero1, hero2, hero3};

        for (Hero hero : heroes) {
            hero.isStrong();
        }

    }
}
