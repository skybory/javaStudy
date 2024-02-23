package method;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//두 파라미터의 합을 출력하는 메서드르 생성
		
		plus(10,20);
		minus(5,30);
		minus2(5,30);
		
	}
		//결과가 30 이라고 나옴.
	
	public static void plus(int num1, int num2) {
		System.out.println(num1 + num2);
	
	}

//차를 받아오는 메서드
public static void minus (int num1, int num2) {
	if (num1 >= num2) {
		System.out.println(num1 - num2);
	}
	else if (num1 < num2) {
		System.out.println(num2 - num1);
	}
	else {
		System.out.println("에러입니다.");
	}
}

public static void minus2 ( int num1, int num2) {
	System.out.println(num1 - num2);
}

	// 두 파라미터의 차를 출력하는 메서드를 생성, 호출
}
