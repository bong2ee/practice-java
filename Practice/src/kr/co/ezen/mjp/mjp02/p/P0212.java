package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0212 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성적 입력 : ");
		int score = scan.nextInt();
		
		if(score >= 90)
			System.out.println("A");
		else if(score >= 80)
			System.out.println("B");
		else if(score >= 70)
			System.out.println("C");
		else if(score >= 60)
			System.out.println("D");
		else 
			System.out.println("F");
		
		scan.close();
		
		
	}
}
