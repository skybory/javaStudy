package override;

public class Hello {
	public void say() {
		System.out.println("Hello");
	}
}

//자식클래스 English
class English extends Hello {
	
}

//자식클래스 Korean
class Korean extends Hello {
	public void say() {					//override (같은 이름의 메서드를 만드는것 --> 덮어씌우기)
		System.out.println("안녕하세요");
	}

}
	
 