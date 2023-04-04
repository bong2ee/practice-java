package kr.co.ezen.mjp.mjp03.h;

import java.util.Scanner;

public class H0308 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 몇 개? ");
		int s = scan.nextInt();
		int arr[] = null;
		if(s <= 100)
			arr = new int[s];
		else
			System.out.println("다시 입력");
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 +1);
			System.out.print(arr[i]+ " ");
			} 
				
				
		scan.close();
		}
			
	}

