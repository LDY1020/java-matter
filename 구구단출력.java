package 메서드문제;

public class 구구단출력 {

	public static void main(String[] args) {
		gugudan(5);

	}
	public static void gugudan(int a) {
		for(int i = 1; i < 10; i++) {
			System.out.println(a + "x" + i + "=" + a*i);
		}
	}

}
