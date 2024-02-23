package condition;

public class Main02 {

	public static void main(String[] args) {
		

		int point = 75;
		
		//포인트가 70점 초과, 80점 이하이면
		//'C학점 입니다.' 출력
		
		if ( point > 70 && point <= 80) {
			System.out.println("C학점 입니다");
		}

		if ( point <= 70 || point > 80 ) {
			System.out.println("범위를 벗어났습니다");
		}
		}
	}

