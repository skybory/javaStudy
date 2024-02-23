package object;

class Calc {
	
											//	public static 은 전부 지워도 된다.

	int plus(int num1, int num2) {			//	Calc 클래스 안에서 plus 메서드 정의
											// 지역변수 num1, num2 선언
		return num1 + num2;
	}
	 int minus(int num1, int num2) {		//  minus 메서드 정의
		return num1 - num2;
	}
	 int times(int num1, int num2) {		// times 메서드 정의
		return num1 * num2;
	}
	 int divide(int num1, int num2) {		// divide 메서드 정의
	
		 int result= 0;
	if ( num2 != 0) {
		result = num1 / num2;
	}
	else if ( num2 == 0) {
		System.out.println("에러입니다");
	}
	return result;
		
	
	}
	
}

/*
 * Calc 클래스 생성
 *  - 4개의 메서드 정의
 *  - plus(int,int) ,return int
 *  - minus(int,int) ,return int
 *  - times(int,int) ,return int
 *  - divide(int,int) ,return int
 * 	- 결과값 각각 출력
 */


public class Main04 {					// 소스파일의 이름은 public class의 이름과 일치해야한다.

	public static void main(String[] args) {
			
		Calc cal = new Calc();			//객체의 선언과 할당
		int num1 = 100;
		int num2 = 50;
		
		int p = cal.plus(num1,num2);			//객체 생성
		int m = cal.minus(num1,num2);
		int t = cal.times(num1,num2);
		int d = cal.divide(num1, num2);
		
		System.out.println("num1 + num2 = " + p);
		System.out.println("num1 + num2 = " + m);
		System.out.println("num1 + num2 = " + t);
		System.out.println("num1 + num2 = " + d);
	
		//이렇게 하면 안될것같음.
		//System.out.println("a + b = " + Calc.plus(a, b));
		//System.out.println("a - b = " + Calc.minus(a, b));
		//System.out.println("a * b = " + Calc.times(a, b));
		//System.out.println("a / b = " + Calc.divide(a, b));
		
		
	}

}
