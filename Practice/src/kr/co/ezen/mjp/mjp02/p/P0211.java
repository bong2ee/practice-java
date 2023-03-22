package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0211 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int i = scan.nextInt();
		if(i % 3 == 0)
			System.out.println(i + "는 3의 배수 입니다.");
		else 
			System.out.println(i + "는 3의 배수가 아닙니다.");
		
		scan.close();
	}
}
