package kr.co.ezen.mjp.mjp03.p;

public class P0304 {

	public static void main(String[] args) {
		
		
		int temp = 0;
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				temp = i*j;
				System.out.println(i + "*" + j + "=" + temp );
			}
			System.out.println("===================");		
		}
	}
}
