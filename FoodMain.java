package 객체지향;

public class FoodMain {
    public static void main(String[] args) {
        Food[] food = new Food[3];

        food[0] = new Food();
        food[0].name = "김치찌개";
        food[0].price = 10000;
        food[0].isHot = true;
        food[0].info();

        food[1] = new Food();
        food[1].name = "된장찌개";
        food[1].price = 15000;
        food[1].isHot = true;
        food[1].info();

        food[2] = new Food();
        food[2].name = "냉면";
        food[2].price = 13000;
        food[2].isHot = false;
        food[2].info();

        for(int i = 0; i < food.length; i++){
            if(food[i].isHot == true){
                System.out.println("뜨거운 음식");
            }
            if(food[i].isHot == false){
                System.out.println("차가운 음식");
            }
        }
        System.out.println("-----따뜻한 음식 목록-----");
        System.out.println(food[0].name);
        System.out.println(food[1].name);




    }

}
