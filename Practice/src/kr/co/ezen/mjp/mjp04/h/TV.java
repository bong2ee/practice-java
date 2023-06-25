package kr.co.ezen.mjp.mjp04.h;

public class TV {

	String brand;
	int year;
	int inch;
	
	public TV(String b, int y, int i) {
		this.brand = b;
		this.year = y;
		this.inch = i;
	}
	
	public void show() {
		System.out.println(this.brand + "에서 만든 " 
				+ this.year + "년형 " + this.inch + "인치 TV");
	}
	
	public static void main(String[] args) {
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
