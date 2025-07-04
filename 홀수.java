package 배열문제;

import java.util.Scanner;

public class 홀수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[7];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int count = 0; // 홀수 개수 세기용

        for (int i = 0; i < 7; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (numbers[i] % 2 != 0) { // 홀수면
                sum += numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                count++;
            }
        }

        if (count > 0) {
            System.out.println("홀수 합 : " + sum);
            System.out.println("최솟값 : " + min);
        } else {
            System.out.println(-1);
        }
    }
}