package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0204 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 3개 입력 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a<b && b<c) 
			{System.out.print("중간 값은"+b+"입니다.");}
		else if(b<a && a<c) 
			{System.out.print("중간 값은"+a+"입니다.");}
		else
			{System.out.print("중간 값은"+c+"입니다.");}
	
		scan.close();
	}
}
