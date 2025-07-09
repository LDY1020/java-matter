package 메서드Matter;

public class 문자열 {

	public static void main(String[] args) {
		//문자열이 특정 글자로 끝나는지 확인하기
		System.out.println(endWithChar("hello", 'o')); 
		System.out.println(endWithChar("java", 'a'));  
		System.out.println(endWithChar("kotlin", 'n')); 
		System.out.println(endWithChar("world", 'z')); 

	}
	
	public static boolean endWithChar(String str , char ch) {
		str.charAt(str.length() - 1);  //chartAt(index)는 특정위치의 문자리턴
		if (str.charAt(str.length() - 1) == ch) {
			return true;
		}
		else {
			return false;
		}
	}
		

	}



