package object;

class Student{
	// 은닉된 멤버변수 -> 현재 블록 안에서만 접근 가능
	private String name;	//은닉
	private int age;		//캡슐화
	
	// 간접적으로 접근하기 위한 메서드 추가
	
	// set ... : 은닉된 멤버변수에 값을 넣는 방법
	// get ... : 은닉된 멤버변수의 값을 읽는 방법
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setAge (int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
}
public class Main06 {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setAge(25);
		std1.setName("홍길동");
		System.out.println(std1.getName());
		System.out.println(std1.getAge());
		
		
	}

}
