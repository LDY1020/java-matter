package 메서드Matter;

public class 정수배열 {

	public static void main(String[] args) {
		//정수 배열 받아서, 최솟값 리턴하는 메서드
		int[] nums = {5, 2, 8, 1, 4};
		System.out.println(findMin(nums)); 

	}
	
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			}
		
		return min;
	}

}
