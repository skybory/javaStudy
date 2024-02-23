package operator;

public class Main01 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 8;
		
		int result1 = num1 + num2; //덧셈
		int result2 = num1 - num2; //뺄셈
		int result3 = num1 * num2; //곱셈
		int result4 = num1 / num2; //몫
		int result5 = num1 % num2; //나머지
		
		// 12 + 8 = 결과값 (result1)
		System.out.println("12 + 8 = " + result1);
		// 12 - 8 = 결과값 (result2)
		System.out.println("12 - 8 = " + result2);
		// 12 * 8 = 결과값 (result3)
		System.out.println("12 * 8 = " + result3);
		// 12 / 8 = 결과값 (result4)
		System.out.println("12 / 8 = " + result4);
		// 12 % 8 = 결과값 (result5)
		System.out.println("12 % 8 = " + result5);
		
		//0으로 나누기
		int num = 100;
		int zero = 0;
		int result6 = num1 / zero;
		System.out.println("100 / 0 = " + result6);
		
		//자바는 실행하고 class파일로 변환됨.. 코드상의 문제는 없지만(실행하기 전) 실행시키면 문제가 생김(실행시킨 후)

	}

}
