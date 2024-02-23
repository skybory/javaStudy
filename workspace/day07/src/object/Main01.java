package object;

class Member {
/*
 * 멤버변수는 지역변수와 구별하기 위하여 가급적 this를 통하여 접근한다.
 * 메서드에 접근할 때 this 키워드를 사용하는 것이 필수적인 것은 아니다. 
 * 
 */
	
	
	String name;
	int age;
	
	String getName() {
		return this.name;		//전역변수 앞에 this를 쓰는것이 관례 (웬만하면 그냥 써라)
	}
	void setName(String name) {
		this.name = name;		//전역변수 name에 파라미터로 넘겨받은 지역변수 name을 대입
	}
	int getAge() {
		return this.age;		//age를 받아오는 메서드 getAge
	}
	void setAge(int age) {		//age의 값을 설정(변경)하는 메서드
		this.age = age;
		
	}
	void say() {
		System.out.println(getName());
		System.out.println(this.getAge());
	}
}



public class Main01 {

	public static void main(String[] args) {
		Member tae;
		tae = new Member();
		tae.say();
		Member youn = new Member();
		youn.setAge(4);
		youn.setName("taeyoun");
		youn.say();
		System.out.println("=====================");
		Member member = new Member();
		member.setName("자바학생");
		// member.name = "";					  지양하는 코딩
		member.setAge(20);						//멤버변수에 간접적으로 값 할당
		//System.out.println(member.age); 		  지양하는 코딩
		System.out.println(member.getName());	//50%지향하는 코딩
		System.out.println(member.getAge()); 	//50%지향하는 코딩
		member.say(); 							//100%지향하는 코딩
		
		
		
		
		
		
		
		
		
	}

}
