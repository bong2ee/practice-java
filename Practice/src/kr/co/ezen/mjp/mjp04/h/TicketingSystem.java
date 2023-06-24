package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

class Seat {
	String[] seat;
	public Seat() {
		seat = new String[10];
		for(int i=0; i<seat.length; i++) {
			seat[i] = "---";
		}
	}
	
	public void show() {
		for(int i=0; i<seat.length;i++) 
			System.out.print(seat[i] + " ");
		System.out.println();
	}
	
	public void Set(String name, int num) {
	  	seat[num-1] = name;
	}
	
	public boolean reSet(String name) {
		for(int i=0; i<seat.length; i++) {
			if(name.equals(seat[i])) {
				seat[i]	= "---";
				return true;
			}
		}
		return false;
	}
}	
class Reservation {
	
	Scanner scan = new Scanner(System.in);
	Seat[] s;
	String[] seatGrade = {"S", "A", "B"};
	
	public Reservation() {
		s = new Seat[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new Seat();
		}
	}

	public void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int grade = scan.nextInt();
		System.out.print(seatGrade[grade-1] + ">>");
		s[grade-1].show();
		
		System.out.print("이름>>");
		String name = scan.next();
		System.out.print("번호>>");
		int num = scan.nextInt();
		s[grade-1].Set(name, num);
	}
	
	public void check() {
		for(int i=0; i<s.length; i++) {
			System.out.print(seatGrade[i] + ">>");
			s[i].show();
		}
	}
	
	public void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int grade = scan.nextInt();
		System.out.print(seatGrade[grade-1] + ">>");
		s[grade-1].show();
		System.out.print("이름>> ");
		String name = scan.next();
		boolean result = s[grade-1].reSet(name);
		if(result)
			System.out.println("<<취소를 완료하였습니다.>>");
		else 
			System.out.println("<<존재하지 않는 정보입니다.>>");
	}
	
	public void run() {
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int choice = scan.nextInt();
			switch(choice) {
			case 1 :{
					 reserve();
					 break;
			}
			case 2 :{ 
					 check();
					 break;
			}
			case 3 :{ cancel();
					 break;
			}
			case 4 :
				return;
			}
		}
	}
	
	
}


public class TicketingSystem {
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Reservation r = new Reservation();
		r.run();
	}
}
