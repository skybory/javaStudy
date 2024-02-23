package condition;

public class Main07 {

	public static void main(String[] args) {

		char grade = 'A';
		
		//grade 가 기준값
		switch(grade) {
		
		case 'A' : 								//grade = 'A' 인 경우
			System.out.println("91~100점 사이");
			break; 
		case 'B' : 								//grade = 'B' 인 경우
			System.out.println("81~90점 사이");
			break; 
		case 'C' : 								//grade = 'C' 인 경우
			System.out.println("71~80점 사이");
			break; 		
			
		default :								//else 같은 개념
			System.out.println("70점 이하입니다.");
			break;
		
		}
		
		
	}

}
