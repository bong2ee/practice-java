package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0214 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적 입력 : ");
		char grade;
		int score = scan.nextInt();
		
		switch (score/10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println("등급 : " + grade);
		
		scan.close();
	}
}
