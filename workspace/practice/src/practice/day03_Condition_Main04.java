package practice;

public class day03_Condition_Main04 {
	public static void main(String[] args) {
		int point = 75;
		char grade = ' ';
		/*point 가 90점 초과, point 가 100점 이하일때는
		'A학점' 출력
		point 가 80점 초과, 90점 이하일때는
		'B학점' 출력
		point 가 70점 초과, 80점 이하일때는
		'C학점' 출력
		나머지의 경우, 'F학점' 출력
		*/
	
	//설정추가
		
	/* 90~93 : A-
	 * 94~97 : A0
	 * 98~100 : A+
	 * 위의 기준처럼, A,B,C 모두 -,0,+ 를 옵션으로 붙여주는 식을 추가해보자.
	 */
		char opt = ' ';
		if (point % 10 > 7 || point == 100) {
		opt = '+';
		}
		else if (point % 10 > 3 ) {
		opt = '0';
		}
		else if (point % 10 >= 0) {
		opt = '-';
		}
		else {
			System.out.println("오류입니다.");
		}
		
		if (point >= 90 && point <= 100) {
		grade = 'A';
		}
		else if (point >= 80 && point < 90) {
		grade = 'B';
		}
		else if (point >= 70 && point < 80) {
		grade = 'C';
		}
		else {
			System.out.println("당신은 낙제입니다...다시 공부하세요.");
		}
		if ( point > 70) {
		System.out.println("당신의 학점은 : " + grade + opt + " 입니다.");
		}
	
	}
}