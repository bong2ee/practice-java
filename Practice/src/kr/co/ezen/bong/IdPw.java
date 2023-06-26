package kr.co.ezen.bong;

import java.util.Scanner;

public class IdPw {
	
	static final String ADMIN_ID = "admin";
	static final String ADMIN_PASSWORD = "1111";
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ID : ");
		String id = scan.nextLine();
		
		
		if (id.equals(ADMIN_ID)) {
			System.out.println("PW : ");
			String pw = scan.nextLine();
			if (pw.equals(ADMIN_PASSWORD)) {
				System.out.println("로그인 성공");
			} else System.out.println("PW 오류");
		} else System.out.println("ID 오류");
	
		scan.close();
	}

}
