package kr.co.ezen.mjp.mjp04.h;

public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(this.year+ "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
	}
	
	public static void main(String[] args) {
		
		Song song = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
	
}
