package condition;

public class Main09 {

	public static void main(String[] args) {

		/*switch 문을 사용해서
	grade 가 A 또는 B 또는 C 이면 -> Pass 한번 출력
	그렇지 않은 등급이면 -> Not-Pass 한번 출력
	25분까지
		*/
		
		/*break 를 쓰지 않는 방법으로
		(보고 배우기 좋음!!! 나보다 나은 방법)
		
		char grade = 'D';
		switch (grade) {
		case 'A' :
		case 'B' :
		case 'C' :
			System.out.println("Pass");
			break;
		default :
			System.out.println("Not-Pass");
			break;
*/
		char grade = 'D';
		switch (grade) {
		case 'A' :
			System.out.println("Pass");
			break;
		case 'B' :
			System.out.println("Pass");
			break;
		case 'C' :
			System.out.println("Pass");
			break;

			default :
				System.out.println("Not-Pass");
				break;
		}
		
	}

}
