package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

class Add{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		int result = this.a + this.b;
		return result;
	}
	
}
class Sub{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		int result = this.a - this.b;
		return result;
	}
}
class Mul{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		int result = this.a * this.b;
		return result;
	}
}
class Div{
	int a;
	int b;
	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	int calculate() {
		int result = this.a / this.b;
		return result;
	}
}
public class Calculator {
	Scanner scan = new Scanner(System.in);
	void run() {
		System.out.print("두 정수와 연산자를 입력하시오 >> ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		if(c.equals("+")){
		Add add = new Add();
		add.setValue(a, b);
		System.out.println(add.calculate());
		}
		else if(c.equals("-")){
		Sub sub = new Sub();
		sub.setValue(a, b);
		System.out.println(sub.calculate());
		}
		else if(c.equals("*")){
		Mul mul = new Mul();
		mul.setValue(a, b);
		System.out.println(mul.calculate());
		}
		else if(c.equals("/")){
		Div div = new Div();
		div.setValue(a, b);
		System.out.println(div.calculate());;
		}
	
		
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.run();
		
	}
	
}
