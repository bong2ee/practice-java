package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0202 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("2자리수 정수 입력(10~99) >> ");
		int num = scan.nextInt();
		
		if((num % 10) == (num / 10))
			System.out.println("Yes! 10자리와 1의 자리가 같습니다.");
		else 
			System.out.println("No! 10자리와 1의 자리가 같지 않습니다.");
		scan.close();
		
	}
}
