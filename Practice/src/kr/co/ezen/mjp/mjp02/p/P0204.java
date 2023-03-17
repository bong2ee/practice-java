package kr.co.ezen.mjp.mjp02.p;

import java.util.Scanner;

public class P0204 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 >>");
		String name = scan.next();
		
		System.out.print("도시 >>");
		String city = scan.next();
		
		System.out.print("나이 >>");
		int age = scan.nextInt();
		
		System.out.print("체중 >>");
		double weight = scan.nextDouble();
		
		System.out.print("독신 여부 >>");
		boolean single = scan.nextBoolean();
		
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(age);
		System.out.println(weight);
		System.out.println(single);
		
		
		scan.close();
	}
}
