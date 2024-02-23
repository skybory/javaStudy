package method;

public class Main01 {

	public static void main(String[] args) {

	plus();
	plus();
	minus();
	}

	//main 이 끝난 뒤에, 하지만 Main01이 끝나기 전에 ! method를 추가해야 함.
	//Ctrl + F11 누른다고 아래의 프린트가 실행되지는 않음. 재생을 하면 main 메서드를 재생하는것 뿐. 아래의 메서드를 실행하려면 main에서 호출해야함.
	public static void plus() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	public static void minus() {
		int num1 = 50;
		int num2 = 10;
		System.out.println(num1 - num2);
	// plus 메서드와 minus 메서드는 변수가 겹쳐도 상관 없음. {} 를 벗어나면서 데이터를 잃어버리기 때문.
	}
}
