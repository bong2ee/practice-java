package kr.co.ezen.mjp.mjp03.p;

import java.util.Scanner;

public class P0314 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 입력 >> ");
			int a = scan.nextInt();
			int b = scan.nextInt();
			try {
				System.out.println(a + "/" + b + " = " + a/b);
				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
				
			}
		}
		scan.close();
		
	}
}