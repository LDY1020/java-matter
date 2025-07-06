package 메서드문제;

public class 평균값출력 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 매개변수로 받아 평균이 80점 이상이면 "합격", 아니면 "불합격" 출력하는 메서드를 작성하라.
		checkPass(75, 80, 85);  // 출력: 합격
        checkPass(60, 70, 65);  // 출력: 불합격	 
        

	}
	public static void checkPass(int a , int b , int c) {
		int sum = a + b + c;
		double avreage = sum / 3.0;
		if(avreage >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
