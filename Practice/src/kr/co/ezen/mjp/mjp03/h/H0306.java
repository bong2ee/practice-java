package kr.co.ezen.mjp.mjp03.h;

import java.util.Scanner;

public class H0306 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("액수 입력 >> ");
		int won = scan.nextInt();
		
		int[] arr = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		for(int i=0; i<arr.length; i++) {
			int a = won / arr[i];
			System.out.println(arr[i] + "원 " + a + "개");
			won = won % arr[i];
		}
		
	}
}
