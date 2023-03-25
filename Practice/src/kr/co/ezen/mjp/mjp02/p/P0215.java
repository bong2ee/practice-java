package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0215 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("커피 주문 : ");
		String coffee = scan.nextLine();
		int price = 0;
		
		switch (coffee) {
		case "에스프레소": case "카푸치노": case "카페라떼": 
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default : 
			System.out.println("없는 메뉴입니다.");
		  
		}
		
		System.out.println(coffee + "의 가격은 " + price + "원 입니다.");
		
		scan.close();
	}
}
