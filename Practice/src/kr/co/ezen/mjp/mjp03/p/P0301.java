package kr.co.ezen.mjp.mjp03.p;

public class P0301 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		int i;
		for(i=1;i<=10;i++) {
			sum += i;
			if(i == 10)
				System.out.print(i + " = " + sum);
			else
				System.out.print(i + " + ");
		}
		System.out.println();
	}

}
