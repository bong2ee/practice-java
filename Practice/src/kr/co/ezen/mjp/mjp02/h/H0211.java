package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0211 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("달을 입력하세요(1~12) >> ");
		int month = scan.nextInt();
		
		if(month > 0 && month <= 12) {
			if(month >= 3 && month <= 5) {
				System.out.println("봄");
			} else if(month >= 6 && month <= 8) {
				System.out.println("여름");
			} else if(month >= 9 && month <= 11) {
				System.out.println("가을");
			} else {
				System.out.println("겨울");
			}
		}
		else {
			System.out.println("잘못입력하셨습니다.");
			}
		
		scan.close();
	}
}
