package 메서드Matter;

public class 짝수홀수출력 {

	public static void main(String[] args) {
		//정수 하나 받아서 짝수면 true, 홀수면 false를 리턴하는 메서드 만들기
		System.out.println(isEven(4)); // true
		System.out.println(isEven(5)); // false


	}
	
	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
