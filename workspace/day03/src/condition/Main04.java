package condition;

public class Main04 {
	public static void main(String[] args) {
		int point = 80;
		
		/*point 가 90점 초과, point 가 100점 이하일때는
		'A학점' 출력
		point 가 80점 초과, 90점 이하일때는
		'B학점' 출력
		point 가 70점 초과, 80점 이하일때는
		'C학점' 출력
		나머지의 경우, 'F학점' 출력
		*/
	
	if (point > 90 && point <= 100) {
		System.out.println("A학점");
	}
	else if (point > 80 && point <= 90) {
		System.out.println("B학점");
	}
	else if (point > 70 && point <= 80) {
		System.out.println("C학점");
	}
	else {
		System.out.println("F학점");
	}
	
	}
}