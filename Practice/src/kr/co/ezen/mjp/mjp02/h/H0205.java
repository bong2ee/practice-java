package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0205 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 3개 입력 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if((a+b)>c && (b+c)>a && (a+b)>b)
			System.out.println("삼각형이 됩니다.");
		else 
			System.out.println("삼각형이 아닙니다.");
		
		scan.close();
	}
}
