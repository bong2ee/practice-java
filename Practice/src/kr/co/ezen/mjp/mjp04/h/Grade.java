package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

public class Grade {
		int math;
		int science;
		int english;
		
		public Grade(int m, int s, int e) {
			this.math = m;
			this.science = s;
			this.english = e;
		}
	
		public int average() {
			int a = (this.math + this.science + this.english)/3;
			return a;
		}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 "+me.average());
		
		scan.close();
		
	}

}
