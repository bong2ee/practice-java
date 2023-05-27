package kr.co.ezen.mjp.mjp04.p;

public class Circle {

	int r;
	String name;
	
	
	
	public Circle(int r, String name) {
		this.r = r;
		this.name = name;
	}

	public double getArea() {
		return 3.14*r*r;
	}


	public static void main(String[] args) {
		
		Circle circle1  = new Circle(10, "자바피자");
		double pArea = circle1.getArea();
		System.out.println(circle1.name + "의 면적은 " + pArea);
		
		Circle circle2 = new Circle(2, "자바도넛");
		double dArea = circle2.getArea();
		System.out.println(circle2.name + "의 면적은 " + dArea);
	}
}
