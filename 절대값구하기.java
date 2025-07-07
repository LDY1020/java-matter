package 메서드Matter;

import java.lang.Math;

public class 절대값구하기 {

	public static void main(String[] args) {
		//정수 하나를 받아서, 절댓값을 리턴하는 메서드 만들기
		System.out.println(abs(5));   
		System.out.println(abs(-3));  
		
	}
	
	public static int abs(int num) {
		if(num < 0) {
			num = Math.abs(num);
		
		}
		return num;
		
	}

}
