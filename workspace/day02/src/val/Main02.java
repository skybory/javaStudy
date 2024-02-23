package val;

public class Main02 {

	public static void main(String[] args) {
		// 변수의 선언
		int num1; 
		// 변수의 할당
		num1 = 100;
		
		System.out.println("num1 : " + num1 + " 입니다.");

		
		// 변수의 선언과 할당
		boolean b = true;
		System.out.println("b : " + b);	
		
		System.out.println("===============================");
		
		String language = "JA" + "VA";
		System.out.println("language : " + language);

		int age = 20;
		String name = "자바학생";

		String result = name + age;
		String result1 = age + name;
		
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println("===============================");
		
		boolean isKorean = true;
		System.out.println("isKorean : "  + isKorean );
		
		
		// char는 홑따옴표(')로 감싸진 한 글자만 대입할 수 있다.
		char first = '이';
		System.out.println("char : " + first);
		
		System.out.println("================================");
		
		//long의 L은 지우면 에러가 나지만, double의 D는 지워도 에러가 안난다(double이 실수형의 기본형이기 때문). float 또한 에러가 남
		//정수형의 기본형은 int , 실수형의 기본형은 double
		long num2 = 12345678900000L;
		double num3 = 128.4D;
		float num4 = 3.14F;
		
		
		System.out.println("num 2 : " + num2);
		System.out.println("num 3 : " + num3);
		System.out.println("num 4 : " + num4);
	
		
		System.out.println("==================================");
		
		int num10 = 100;
		num10 = 200;
		//변수명 중복으로 오류 발생 Duplicate local variable num10
		//int num10 =500;
	
		int num11 = 100;
		num11 = 200;
		//선언되지 않은 변수의 사용 => ERROR 
		//num12 = 500;
	
		System.out.println("==================================");
		
		int num15;
		//할당되지 않은 변수를 대입하였으므로 에러 발생
		//int num16 = num15;
		//할당되지 않은 변수를 출력하였으므로 에러 발생
		//System.out.println(num15);

	
	}

}

