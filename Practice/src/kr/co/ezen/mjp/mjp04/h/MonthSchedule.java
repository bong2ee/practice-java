package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

class Day {
	private String work; // 하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if(work == null) System.out.println("없습니다.");
		else System.out.println(work + "입니다.");
	}
}
public class MonthSchedule {
	   Scanner scan = new Scanner(System.in);
	   
	   Day day[];
	   public MonthSchedule(int date) {
	      day = new Day[date];
	      for(int i=0; i<day.length; i++) {
	         day[i] = new Day();
	      }
	   }
	   
	   
	   
	   public void run() {
	      System.out.println("이번달 스케쥴 관리 프로그램.");
	      while(true) {
	         System.out.print("할일(입력: 1, 보기: 2, 끝내기: 3)>> ");
	         int choice = scan.nextInt();
	         
	         if(choice == 1) {
	            input(); 
	            continue;
	         }
	         else if (choice == 2) {
	            select(); 
	            continue;
	         }
	         else {
	            finish(); 
	            break;
	         }
	      }
	   }
	   
	   public void input() {
	      System.out.println("날짜(1~30)>> ");
	      int d = scan.nextInt();
	      System.out.println("할일(빈칸없이 입력)>> ");
	      String work = scan.next();
	      day[d-1].set(work);
	      
	   }
	   
	   public void select() {
	      System.out.println("날짜(1~30)>> ");
	      int d = scan.nextInt();
	      System.out.print(d+"일의 할 일은 "); day[d-1].show();
	     
	   }

	   public void finish() {
	      System.out.println("프로그램을 종료합니다.");
	   }
	   
	   public static void main(String[] args) {
	      MonthSchedule bong = new MonthSchedule(30);
	      bong.run();
	   }
	   
	}