package 배열문제;

import java.util.Scanner;

public class 최대최소 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] number = new int[5];
		
		for(int i = 0; i < 5; i++) {
			number[i] = scanner.nextInt();
		}
		
		int max = number[0] , min = number[0];
		for(int i = 0; i < 5; i++) {
			if(number[i] > max) {
				max = number[i];
			}
			if(number[i] < min) {
				min = number[i];
			}
		}
		System.out.println("최대값:" + max);
		System.out.println("최대값:" + min);
		

	}

}
