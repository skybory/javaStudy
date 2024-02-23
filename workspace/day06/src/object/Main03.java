package object;

class HelloWorld{
	String message;
	
	void sayHello() {
		System.out.println(message);
	}
	void setEng() {
		message = "Hello java";
	}
	void setKor() {
		message = "안녕하세요. 자바";
	}

}

public class Main03 {

	public static void main(String[] args) {
		HelloWorld hw = new HelloWorld();	// hw 객체 선언 및 할당
		
		hw.setKor();		//	message = "안녕하세요.자바" 할당
		hw.sayHello();		//	message(전역변수) 출력
		System.out.println("----------------------------");
		
		hw.setEng();		// message = "Hello java" 재할당
		hw.sayHello(); 		// message(전역변수) 출력
		System.out.println("----------------------------");
		
		hw.setEng();
		hw.setKor();
		hw.setKor();
		hw.setKor();
		hw.setKor();
		hw.setEng();
		System.out.println(hw.message);
	}

}
