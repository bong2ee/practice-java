package kr.co.ezen.javaEx04;
/*
 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
 */
public class P125_4_3 {

	public static void main(String[] args) {
		int sum = 0;
		int temp = 0;
		for(int i=1; i<=10;i++) {
			sum += i;
			temp += sum;
		} System.out.println(temp);
		
System.out.println("================================================");
		
		int sum1 = 0;
		for(int num=1;num<11;num++) {
			for(int num1=1;num1<num+1;num1++) {
				sum1 += num1;
			}
		} System.out.println(sum1);
		
		
	}

}
