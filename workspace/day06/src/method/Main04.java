package method;

public class Main04 {

	public static void main(String[] args) {
		//4번 더하기 빼기 곱하기 몫 까지만.
System.out.println("계산 결과 : " + calculate(5,2,'+'));		

	}


	public static double calculate ( double num1, double num2, char op) {
	double result = 0;

	if (op == '+' || op == '-' || op == '*' || op == '/') {
		if (op == '+') {
			result = num1 + num2;
		}
		else if ( op == '-' ) {
			result = num1 - num2;
		}
		else if (op == '*') {
			result = num1 * num2;
		}
		else if (op == '/') {
			if ( num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else
			result = num1 / num2;
			
		}
		
	}
	if (op != '+' && op != '-' && op != '*' && op != '/')
	{System.out.println("연산자를 잘못 입력하셨습니다.");}
	
	return result;
	
	
	}

}