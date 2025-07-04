package 배열문제;

import java.util.Scanner;



public class 최댓값구하기{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("정수 5개 입력:");

        // 입력 받기
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 최댓값 찾기
        int max = numbers[0]; // 초기값 설정
        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // 최댓값 갱신
            }
        }

        System.out.println("최댓값: " + max);
    }
}