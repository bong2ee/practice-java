package kr.co.ezen.mjp.mjp03.h;

import java.util.InputMismatchException;
import java.util.Scanner;

public class H0315 {

	public static void main(String[]args){
		  
		Scanner scan =new Scanner(System.in);
	 
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력 >> ");
			try {
				int n=scan.nextInt();
				int m=scan.nextInt();
				System.out.print(n+"x"+m+"="+n*m);
				break;
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.println("실수는 입력하면 안됩니다.");
			}
		}

	  
	  scan.close();
	  
	}
}
