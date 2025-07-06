package 메서드문제;

public class 짝수만출력 {

	public static void main(String[] args) {
		printEven(11, 22, 33);

	}
	public static void printEven(int a , int b , int c) {
		if(a % 2 == 0) {
			System.out.println(a);
		}
		if(b % 2 == 0) {
			System.out.println(b);
		}
		if(c % 2 == 0) {
			System.out.println(c);
			
		}
	}

}
