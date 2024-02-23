package overload;


class Hello {
	// 생성자의 수 만큼 객체생성방법이 늘어나게 된다.
	public Hello() {
		//기본생성자
		System.out.println("Hello");
	}
	
	public Hello(String msg) {
		//파라미터가 있는 생성자
		System.out.println(msg);
	}
}

public class Main02 {

	public static void main(String[] args) {

		Hello h1 = new Hello();
		Hello h2 = new Hello("하이");
		
		
	}

}
