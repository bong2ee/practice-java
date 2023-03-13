package kr.co.ezen.mjp.mjp02.h;

import java.util.Scanner;

public class H0208 {
	
	public static boolean inRect(int x, int y, int rectx1, int rectx2, int recty1, int recty2){
		  if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
		    { return true; }
		  else { return false; }
		}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(x1, y1), (x2, y2)를 입력 >> ");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		int rectx1 = 100;
		int recty1 = 100;
		int rectx2 = 200;
		int recty2 = 200;
		
		if(inRect(x1, y1, rectx1, rectx2, recty1, recty2)) {
			System.out.println("충돌합니다.");
		} else if(inRect(x2, y2, rectx1, rectx2, recty1, recty2)){
			System.out.println("충돌합니다.");
		} else {
			System.out.println("충돌하지 않습니다.");
		}
		
		scan.close();
			
	}


}
