package operator;

public class Main05 {

	public static void main(String[] args) {

		int num1 = 123;
		int num2 = 456;
		
		// 비교연산에 대한 결과는 boolean 이다
		
		boolean result1 = num1 == num2;
		System.out.println("result1 : " + result1);		//false
		
		boolean result2 = num1 < num2;
		System.out.println("result2 : " + result2);		//true
		
		boolean result3 = num1 > num2;
		System.out.println("result3 : " + result3);		//false
		
		boolean result4 = num1 <= num2;
		System.out.println("result4 : " + result4);		//true
		
		boolean result5 = num1 >= num2;
		System.out.println("result5 : " + result5);		//false
		
		boolean result6 = num1 != num2;
		System.out.println("result6 : " + result6);		//true
		
		
	}

}
