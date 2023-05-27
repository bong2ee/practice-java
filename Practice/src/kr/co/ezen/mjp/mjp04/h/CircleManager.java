package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

class Circle {
	
	double x;
	double y;
	int radius;
	
	public Circle(double x, double y, int r) {
		this.x = x;
		this.y = y;
		this.radius = r;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+ radius);
	}
	

}

public class CircleManager {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	Circle[] arr = new Circle[3];
	
	double x;
	double y;
	int r;
	for(int i=0; i<arr.length; i++) {
	System.out.print("x, y, radius >> ");
	x = scan.nextDouble();
	y = scan.nextDouble();
	r = scan.nextInt();
	arr[i] = new Circle(x, y, r);
	}
	
	
//	for(int i=0; i<arr.length; i++)
//		arr[i].show();
	int temp = 0;
	for(int i=1; i<arr.length; i++) {
		if(arr[temp].radius < arr[i].radius)
			temp = i;
	}
	
	System.out.print("가장 면적이 큰 원은 ");
	arr[temp].show();
	scan.close();
	
	}
}