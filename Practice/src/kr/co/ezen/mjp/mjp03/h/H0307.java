package kr.co.ezen.mjp.mjp03.h;

public class H0307 {

	public static void main(String[] args) {
		
	
	int[] arr = new int[10];
	int sum = 0;
	
	for(int i=0; i<arr.length; i++) {
		int random = (int)(Math.random()*10 + 1);
		arr[i] = random;
		sum += arr[i];
		System.out.println("배열에 든 수 : " + arr[i]);
		
	}
	System.out.println("평균 : " + sum/arr.length);
			
	}
}
