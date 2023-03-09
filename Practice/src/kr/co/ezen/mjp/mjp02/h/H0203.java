package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0203 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
		int num =scan.nextInt();
		System.out.println("50000원"+num/50000+"매");
		num%=50000;
		System.out.println("10000원"+num/10000+"매");
		num%=10000;
		System.out.println("1000원"+num/1000+"매");
		num%=1000;
		System.out.println("100원"+num/100+"매");
		num%=100;
		System.out.println("50원"+num/50+"매");
		num%=50;
		System.out.println("10원"+num/10+"매");
		num%=10;
		System.out.println("1원"+num/1+"매");
		scan.close();

	}
}
