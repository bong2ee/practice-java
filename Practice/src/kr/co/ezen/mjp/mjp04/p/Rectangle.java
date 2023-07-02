package kr.co.ezen.mjp.mjp04.p;

import java.util.Scanner;

public class Rectangle {

	int w;
	int h;
	
	public Rectangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	public int getArea(int w, int h) {
		return w*h;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">> ");
		int w = scan.nextInt();
		int h = scan.nextInt();
		Rectangle rect = new Rectangle(w, h);
		int result = rect.getArea(w, h);
		System.out.println("사각형의 면적은 " + result);
		
		scan.close();
	}
	
}
