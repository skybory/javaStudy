package p207;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	// 생산자 만들기
	public Student(String name, int ban, int no, int kor, int eng, int math) {	
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter setter 만들기
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	//toString 만들기
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}
	
	//info() 만들기
	public String info() {
		total();
		avg();
	return name + ", " + ban + ", " + no + ", " + kor + ", " + eng + ", " + math + ", " + total + ", " + avg;
	}
	
	public void total() {
	int total = kor + eng + math;
	this.total = total;	
	}
	
	public void avg() {
		double temp = (double) total / 3;
		
	avg = Math.round(temp * 10) / 10.0;
	
	this.avg = avg;
	}

}  
