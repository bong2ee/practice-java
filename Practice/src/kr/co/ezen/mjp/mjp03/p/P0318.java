package kr.co.ezen.mjp.mjp03.p;

public class P0318 {

	public static void main(String[] args) {
		
		String[] str = {"23", "12", "3.14", "998"};
		int i = 0;
		try {
			for(i=0; i<str.length; i++) {
				int j = Integer.parseInt(str[i]);
				System.out.print(j);
			}
		} catch(NumberFormatException e) {
			System.out.println(str[i] + "는 정수로 변환할 수 없습니다.");
		}
	}
}
