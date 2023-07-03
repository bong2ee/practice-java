package kr.co.ezen.mjp.mjp04.h;

class ArrayUtil {
	public static int [] concat(int[] a, int[] b) {
		int arr[] = new int[(a.length + b.length)];
		int i = 0;
		for(i=0; i<a.length; i++) {
			int aArray = a[i];
			arr[i] = aArray;
		}
		for(int j=0; j<b.length; j++) {
			int bArray = b[j];
			arr[i+j] = bArray;
		}
		return arr;
	}
	public static void print(int[] a) {
		System.out.print("{ ");
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("}");
	}
}

public class StaticEx {
	
	public static void main(String[] args) {
		int [] array1 = {1, 5, 7, 9 };
		int [] array2 = {3, 6, -1, 100, 7 };
		int [] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
	}
}
