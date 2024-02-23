package hiding;

public class Main01 {

	public static void main(String[] args) {
//실행 클래스
	/*
	 * 1. Member 클래스에 name, age 필드 생성
	 * 2. 2개의 파라미터가 있는 생성자 (우클릭기능)
	 * 3. getter, setter 만들기 ( 필드를 private 처리하기 ) (우클릭기능)
	 * 4. main() 메서드 에서 객체 생성 후, name과 age를 출력
	 * 
	 * 
	 */
	Member std1 = new Member("자바학생",20);
	
	
	System.out.println("이름 : " + std1.getName());
	System.out.println("나이 : " + std1.getAge());
	
	std1.setName("김자바");
	System.out.println("바뀐 이름 : " + std1.getName());
	}

}
