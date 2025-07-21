package 객체지향;

public class Carculator {
    int result;


    void add(int a , int b){
        result = a + b;
    }
    void subract(int a , int b){
        result = a - b;
    }
    void multiply(int a , int b){
        result = a * b;
    }
    void divide(int a , int b){
        if(b == 0){
            System.out.println("0으로 나눌수없습니다");
        }
        else{
            result = a / b;
        }
    }
    void showResult(){
        System.out.println("결과 : " + result);
    }
}
