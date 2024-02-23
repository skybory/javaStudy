package practice;

public class Day06_Method_Main04 {

	public static void main(String[] args) {
		System.out.println("계산 결과 : " + calculate(10, 2, '/'));

	}

	public static double calculate(double num1, double num2, char op) {
		double result = 0;
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if (num2 != 0) {
					result = num1 / num2;
				} else {
					System.out.println("0으로 나눌 수 없습니다.");
					break;
				}
			}
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		return result;
	}

}