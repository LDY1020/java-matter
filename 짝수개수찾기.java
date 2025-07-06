package 메서드문제;

public class 짝수개수찾기 {

	public static void main(String[] args) {
		countEven(2 , 4 , 6 , 9 , 11);

	}
	public static void countEven(int a , int b , int c , int d , int f) {
		int count = 0;
		if(a % 2 == 0) {
			count++;
		}if(b % 2 == 0) {
			count++;
		}if(c % 2 == 0) {
			count++;
		}if(d % 2 == 0) {
			count++;
		}if(f % 2 == 0) {
			count++;
		}
		System.out.println("짝수 갯수 : " + count);
	}
	

}
