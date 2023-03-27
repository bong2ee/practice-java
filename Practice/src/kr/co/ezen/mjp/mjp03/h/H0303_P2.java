package kr.co.ezen.mjp.mjp03.h;

import java.util.Scanner;

public class H0303_P2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int s = scan.nextInt();
		for(int i=0; i<s; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(s-i)*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		scan.close();
	}

}
