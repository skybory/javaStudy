package condition;

public class Main10 {

	public static void main(String[] args) {
		//조건문 간단하게 풀어보기
		
		/*
		 * 1. 1은 "축구", 2는 "농구", 3은 "야구"
		 * 4는 "배구", 그 외에는 "배드민턴" 이 출력되도록 프로그램을 만드시오.
		 * 
		 * 
		 * 
		 */
		int sport = 4;
		switch (sport) {
		case 1 : 
			System.out.println("축구");
			break;
		case 2 : 
			System.out.println("농구");
			break;
		case 3 : 
			System.out.println("야구");
			break;
		case 4 : 
			System.out.println("배구");
			break;
		default : 
			System.out.println("배드민턴");
			break; 							// 여기는 break 가 없어도 됨 ( 어차피 switch 문이 끝나기 때문 )
		}
		
		/*
		 * 2. 숫자가 3이면 "안녕"이 세 줄
		 * 	 숫자가 2이면 "안녕"이 두 줄
		 * 	 숫자가 1이면 "안녕"이 한 줄,
		 * 	 그 외에는 "잘가"를 출력
		 * 
		 * 
		 */
		
		int hi = 4;
		switch (hi) {
		case 3 : System.out.println("안녕");
		case 2 : System.out.println("안녕");
		case 1 : System.out.println("안녕");
		break;
		
		default :
			System.out.println("잘가");
			
	
		}
		
	}

}
