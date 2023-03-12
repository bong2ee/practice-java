package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0206 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1~99 사이의 정수 입력 >> ");
		int num = scan.nextInt();
		int a = num/10;
		int b = num%10;
		
		if(num > 0 && num <= 99) {
			if((a%3)==0 && (b%3)==0){
				System.out.println("박수짝짝");
			} else if ((a%3)==0 || (b%3)==0) {
				System.out.println("박수짝");
			}
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		scan.close();
		
	}
}
