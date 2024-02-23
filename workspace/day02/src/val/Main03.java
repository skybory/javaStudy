package val;

public class Main03 {

	public static void main(String[] args) {
		// 일반 변수
		int width = 100;
		// 상수, 상수 선언은 무조건 대문자로만 선언함(관례)
		final double PI = 3.14D; 
	
		// Main 숫자가 다르면 변수가 리셋되는것 같음
		
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
		
		// 값의 변경
		width = 200;
		// 상수는 재할당 불가
		// PI = 3.141592D; 에러발생!
		
		System.out.println("width = " + width);
		System.out.println("PI = " + PI);
	
	}

}

