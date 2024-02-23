package Abstract;

public abstract class Hello {	//아래에 추상 메서드가 하나라도있으면 클래스 앞에 abstract를 넣어줘야함
	// 추상 클래스는 생성자, 멤버변수, 일반 메서드 등을 포함할 수 있다
	// 즉 공통 기능과 가이드라인을 모두 정의하여 다른 클래스에게 상속된다.
	// 추상 클래스는 의도 자체가 상속을 받기 위해 만들어짐.
	// 멤버 변수
	private String msg;
	
	// 파라미터가 있는 생성자
	public Hello(String msg) {
		this.msg = msg;
	}

	
	// 일반 메서드 (Getter&Setter)
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	// 추상 메서드 : 선언만 되고, 구현부를 위한 블록이 존재하지 않는다.
	public abstract void sayHello();	//실제로 하는 일은 없지만, 상속받은 애들이 '반드시' sayHello를 구현하게 명령하는 기능.
	
}
