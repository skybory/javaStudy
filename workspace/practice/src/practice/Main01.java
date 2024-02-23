package practice;

public class Main01 {

	public static void main(String[] args) {
			//예제 풀어보기
		
		/*
		 * 구구단 출력 : 결과값만 출력
		 * 			2단 ~ 9단
		 * 
		 * 	2 * 1 = 2
		 * 	
		 * 
		 * ...
		 * 2 * 9 = 18
		 * 3 * 1= 3
		 * ...
		 * 
		 * 
		 * 
		 */
		
		//35분까지
		//1. 배열 만들기
		int [][]multiple= new int[9][9];
		for(int i = 2; i< multiple.length;i++) {
			System.out.println("구구단 "+ i + "단 시작합니다.");
			
			for(int j = 1; j < multiple[i].length; j++) {
				//이중 for문 안쪽 ( j에 대하여 )
				int product = i * j;
			System.out.println(i + " * " + j + " = " + product);	
				
			}
		System.out.println("-------------------------------");
			
		}
		
		
				
		
		
		
		
	}

}
