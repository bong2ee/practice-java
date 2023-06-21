package kr.co.ezen.bong;

public class CommonMultiple {

	public static void main(String[] args) {
		int count = 0;
		int num = 0;
		while (num++ < 1000) {
			if((num % 7 != 0) || (num % 11 != 0)) continue;
			count++;
			System.out.println(count + "번의 7과 11의 공배수"+num);
			
		}System.out.println("1000미만의 정수 중 7과 11의 공배수의 갯수 : " + count);

	}

}
