package kr.co.ezen.bong;

import java.util.Scanner;

public class Birthday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("보영이면 1, 지년이면 2를 입력해주세요");
		int who = scan.nextInt();
		if (who == 1 || who == 2) {
			System.out.println("몇 월인가요?");
			int month = scan.nextInt();
			if (who == 1 && month == 7) {
				System.out.println("며칠인가요?");
				int day = scan.nextInt();
				if (who == 1 && month == 7 && day == 15) {
					System.out.println("보영이의 생일은 " + month + "월" + day + "일입니다");
				} else System.out.println(day + "일 아닌데~");
			} else if (who == 2 && month == 9) {
				System.out.println("며칠인가요?");
				int day = scan.nextInt();
				if (who == 2 && month == 9 && day == 8) {
					System.out.println("지년이의 생일은 " + month + "월" + day + "일입니다");
				} else System.out.println(day + "일 아닌데~~~");	
			} else {System.out.println(month + "월 아닌데~"); }
		} else System.out.println("보영이랑 지년이 아니면 나가주세요"); 

		scan.close();
		
	}

}
