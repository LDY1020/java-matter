package 메서드Matter;

public class 짝수의합 {

	public static void main(String[] args) {
		//두 개의 정수를 받아서, 두 수 사이에 있는 모든 짝수의 합을 리턴하는 메서드 만들기
		System.out.println(evenSumBetween(3, 9));
		System.out.println(evenSumBetween(10, 4));

	}
	
	public static int evenSumBetween(int a , int b) {
		int start = Math.min(a, b);
		int end = Math.max(a, b);
		int sum = 0;
		
		for(int i = start; i < end; i++) {
			if(i % 2 == 0) {
				sum += i;
				
			}
			
		}
		return sum;
	}
}
