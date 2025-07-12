package 배열문제;

import java.util.Scanner;

public class 점수 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];

		// 점수 입력
		for(int i = 0; i < n; i++) {
		    arr[i] = scanner.nextInt();
		}

		// 최댓값 구하기
		int max = arr[0];
		for(int i = 0; i < n; i++) {
		    if(arr[i] > max) {
		        max = arr[i];
		    }
		}

		// 점수 변형해서 총합 구하기
		double sum = 0;
		for(int i = 0; i < n; i++) {
		    sum += ((double)arr[i] / max) * 100;
		}

		// 평균 출력
		System.out.println(sum / n);
		
	}
}