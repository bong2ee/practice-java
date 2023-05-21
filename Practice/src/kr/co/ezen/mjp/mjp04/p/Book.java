package kr.co.ezen.mjp.mjp04.p;

public class Book {

	String title;
	String author;
	
	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}
	
	public static void main(String[] args) {
		
		Book book1 = new Book("어린왕자", "생텍쥐페리");
		Book book2 = new Book("춘향뎐", "작자미상");
		
		String a = book1.title + " " + book1.author;
		String b = book2.title + " " + book2.author;
		
		System.out.println(a);
		System.out.println(b);
	}
}
