package condition;

public class Main08 {

	public static void main(String[] args) {

		char grade = 'B';
		
		//grade 가 기준값
		switch(grade) {
		
		case 'A' : 								//grade = 'A' 인 경우
			System.out.println("91~100점 사이");
		case 'B' : 								//grade = 'B' 인 경우
			System.out.println("81~90점 사이");
		case 'C' : 								//grade = 'C' 인 경우
			System.out.println("71~80점 사이");
		default :								//else 같은 개념
			System.out.println("70점 이하입니다.");
		
			
			/*
			 case '*' 는 입구. 입구에 맞으면 들어올 수 있음.
			 break; 는 출구다.
			 
			 그러나 break를 하지 않으면, 벗어 나오지 못함.(출구가 없음)
			 따라서 break가 없이 case 'B' 를 만족시키면, case B부터 들어가서 빠져나오지 못함. 
			  			 
			 */
		}
		
		
	}

}
