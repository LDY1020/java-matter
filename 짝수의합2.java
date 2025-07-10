package 메서드Matter;

public class 짝수의합2 {

	public static void main(String[] args) {
		System.out.println(sumEven(1 , 2 , 3 , 4 , 5));

	}
	
	public static int sumEven(int a , int b , int c , int d , int f) {
		int sum = 0 ;
		for(int i = 1; i < 6; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
