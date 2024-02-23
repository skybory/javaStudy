package string;

public class Main04 {

	public static void main(String[] args) {
		// 기본 자료형을 문자열로 변환하는 방법
		// wrapper : String -> 기본자료형
		// 기본자료형 -> String
		
		int a = 1;
		float b = 3.14F;
		boolean c = true;
		double d = 123.4567D;
		long e = 12345675742L;
		
		/*
		 * static 메서드 valueOf
		 * -------------------------------------
		 * 기본 데이터형을 String 객체로 변환해 주는 메서드
		 * 다양한 자료형에 대하여 오버로드 되어 있다.
		 * 
		 */
		//모든 기본형을 String 타입으로 바꿔줌
		String str1 = String.valueOf(a);
		String str2 = String.valueOf(b);
		String str3 = String.valueOf(c);
		String str4 = String.valueOf(d);
		
		//하지만 문자열로 변환하는 가장 손쉬운 방법은 공백을 더하는것이다(문자열+x = 문자열+문자열)
		String str5 = "" + e;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(str1 instanceof String);	//str1 이 String 의 객체인가?
		System.out.println(str2 instanceof String);
		System.out.println(str3 instanceof String);
		System.out.println(str4 instanceof String);
		System.out.println(str5 instanceof String);
	}

}
