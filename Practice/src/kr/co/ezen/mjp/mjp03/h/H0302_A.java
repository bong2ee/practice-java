package kr.co.ezen.mjp.mjp03.h;

public class H0302_A {
	
	public static void main(String[] args) {
		
		int[][] arr = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
		
		
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			for(int j=0; j<arr[i].length; j++) {
				 sum += arr[i][j];
				 System.out.print(arr[i][j] + " ");
			}

			Double avg = (double)sum / arr[i].length;
			System.out.print(avg);
			System.out.println();
		}
	}

}
