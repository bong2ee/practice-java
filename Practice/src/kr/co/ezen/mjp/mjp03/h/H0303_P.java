package kr.co.ezen.mjp.mjp03.h;

import java.util.Scanner;

public class H0303_P {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 >> ");
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		scan.close();
	}
}
