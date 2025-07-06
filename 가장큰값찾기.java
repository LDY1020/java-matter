package 메서드문제;

public class 가장큰값찾기 {

	public static void main(String[] args) {
		int result = max(10 , 20 , 30);
		System.out.println("가장 큰 수는 : " + result);
	
	}


	public static int max(int a, int b , int c) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		return max;
	}

}
