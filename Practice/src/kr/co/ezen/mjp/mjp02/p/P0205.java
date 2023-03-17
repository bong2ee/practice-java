package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0205 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("초 단위의 정수 입력: ");
		int time = scan.nextInt();
		int second = time%60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time + "초는 ");
		System.out.println(hour + "시간 ");
		System.out.println(minute + "분 ");
		System.out.println(second + "초입니다. ");
		
		scan.close();
	}

	
	
}
