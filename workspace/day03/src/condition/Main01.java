package condition;

public class Main01 {

		
	public static void main(String[] args) {

int myage = 19;
		
		if ( myage == 19 ) {
			System.out.println("19살 입니다");  	//myage = 19 이면, 19살을 출력함
		}
		
		if ( myage != 20 ) {
			System.out.println("20살이 아닙니다");	//myage = 20 이면, 20살이 아닙니다.
			
		}
		//my age 가 19살보다 크다면, "성인입니다" 를 출력
		
		if ( myage > 19 ) {
			System.out.println("성인입니다");
		}

		//myage가 19살보다 작거나 같으면 "학생입니다" 출력
		if (myage <= 19) {
			System.out.println("학생입니다");
		}
		
	}

}
