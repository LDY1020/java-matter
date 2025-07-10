package 메서드Matter;

public class 문자등급판별 {

	public static void main(String[] args) {
		//점수를 받아서 A~F 등급을 출력하는 메서드를 만들어라.
		System.out.println(printScore(93));
		System.out.println(printScore(85));
		System.out.println(printScore(74));
		System.out.println(printScore(65));
		System.out.println(printScore(30));
	}
	
	
	public static int printScore(int a) {
		if(a >= 90) {
			System.out.println("A");
	}
		if(a > 79 && a <= 89){
			System.out.println("B");
		}
		if(a > 69 && a <= 79) {
			System.out.println("C");
		}
		if(a > 59 && a <= 69) {
			System.out.println("D");
		}if(a < 60) {
			System.out.println("F");
		}
		return a;
	}
}
		


	
