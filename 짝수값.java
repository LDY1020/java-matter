package 배열문제;

import java.util.Scanner;

public class 짝수값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;
        int count = 0;
        

        System.out.println("정수 10개 입력:");

        // 입력 받기
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
        	if(numbers[i] % 2 == 0) {
        		sum += numbers[i];
        		count++;
        	}
        	
        }
        System.out.println("짝수 개수 :" + count);
    	System.out.println("짝수 합: " + sum);
    }
}