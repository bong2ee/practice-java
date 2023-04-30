package kr.co.ezen.mjp.mjp03.p;

public class P0312 {
	
	public static void main(String[] args) {
		
		int arr[] = makeArray();
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] makeArray() {
		int temp[] = new int[4];
		
		for(int i=0; i<temp.length; i++)
			temp[i] = i + 1;
		return temp;
	}
}
