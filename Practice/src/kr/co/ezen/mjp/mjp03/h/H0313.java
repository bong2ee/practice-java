package kr.co.ezen.mjp.mjp03.h;

public class H0313 {

	public static void main(String[] args) {
        for(int i = 1; i<= 99; i++) {
            if((i %10) == 3||(i %10) == 6||(i %10) == 9){
                if(i/10 == 3||i/10 == 6||i/10 == 9)
                    System.out.println(i + " 박수짝짝");// 자릿수 모두
                else
                    System.out.println(i + " 박수짝");//1의 자릿수만
            }
            else if(i/10 == 3||i/10 == 6||i/10 == 9)
                System.out.println(i + " 박수짝");// 10의 자릿수만
        }
    }
}