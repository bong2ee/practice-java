package kr.co.ezen.mjp.mjp04.h;

import java.util.Scanner;

class Phone {
	private String name;
	private String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}
	
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	
	
	
}
public class PhoneBook {
	Scanner scan = new Scanner(System.in);
	Phone[] phone;
	String name;
	String tel;
	
	public void input() {
		System.out.print("인원수 >> ");
		int m = scan.nextInt();
		phone = new Phone[m];
		for(int i=0; i<m; i++)
			phone[i] = new Phone();
	}

	public void save() {
		for(int i=0; i<phone.length; i++) {
			System.out.print("이름과 전화번호(빈칸없이 입력) >> ");
			name = scan.next();
			tel = scan.next();
			phone[i].setName(name);
			phone[i].setTel(tel);
		}
		System.out.println("저장되었습니다....");
	}
	
	public void search() {
	      boolean state = false;
	      while(true) {
	         System.out.print("검색할 이름>>");
	         name = scan.next();
	         
	         if(name.equals("그만")) break;
	         
	         for(int i=0; i<phone.length; i++) {
	            if(name.equals(phone[i].getName())) {
	               System.out.println(name+"의 번호는 "+phone[i].getTel()+"입니다.");
	               state = true;
	            }
	         }
	         
	         if(state == false)
	            System.out.println(name+"이(가) 없습니다.");      
	      }
	   }
	         
	  
	public static void main(String[] args) {
		PhoneBook pb = new PhoneBook();
		pb.input();
		pb.save();
		pb.search();
	}
}
