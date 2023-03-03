package kr.co.ezen.javaEx04;

public class P126_4_5 {

	public static void main(String[] args) {
		for(int i=0; i <= 10; i++) {
			for (int j=0; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
//for문을 while문으로 변경		
//===========================================
		
		int x = 0;
		while(x<=10) {
			int y = 0;
			while(y<=x) {
				System.out.print("*");
				y++;
			} x++;
			System.out.println();
		}

	}

}
