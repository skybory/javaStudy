package overload;

public class Member {
	
	private String job;
	private int age;
	
	//기본생성자
	Member() {
		
	}
	
	//int형 파라미터 1개 받아오는 생성자
	Member(int age) {
		this.age = age;
	}
	
	// String 타입 파라미터 1개 받아오는 생성자
	Member(String job) {
		this.job = job;
	}
	
	//String 타입 하나, int 타입 하나 받아오는 생성자
	Member(String job, int age) {
		this.job = job;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [job=" + job + ", age=" + age + "]";
	}
	
	
}
