package kr.co.ezen.javaEx06;

public class Student {

	String name;	//학생이름
	int ban;	//반
	int no;		//번호
	int kor;	//국어점수
	int eng;	//영어점수
	int math;	//수학점수
	
	public Student() {
		
	}
	
	public Student(String name, int ban, int no, int kor, int eng, int math) {
		//super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String info() {
		return name+","+ban+","+no+","+kor+","+eng+","+math+","+total()+","+average();
	}
	public int total() {
		return kor+eng+math;
	}
	
	public float average() {
		return (int)(total()/3f * 10 + 0.5f)/10.0f;
	}
	
	public int getTotal() {
		return this.kor+this.eng+this.math;
	}
	
	public float getAverage() {
		return (int)(getTotal()/3f * 10 + 0.5f)/10.0f;
	}
	
}
