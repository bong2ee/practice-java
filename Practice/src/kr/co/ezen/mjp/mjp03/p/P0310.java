package kr.co.ezen.mjp.mjp03.p;

public class P0310 {

	public static void main(String[] args) {
		
		int[][] arr = {{30, 80}, {50, 59}, {65, 89},{90, 95}};
		int sum = 0;
		for(int i=0; i<arr.length; i++) 
			for(int j=0; j<arr[i].length;j++) 
				sum += arr[i][j];
			int n = arr.length;
			int m = arr[0].length;
			System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
			
			
		
		
	}
}
