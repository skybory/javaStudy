package hiding;

public class Member {

	private String name;		// name 필드 생성
	private int age;			// age 필드 생성
	
	Member(String name, int age) { //2개의 파라미터가 있는 생성	
		this.name = name;
		this.age = age;		
	}

	
	public String getName() {		//getter, setter 만들기
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	//구현 클래스
}
