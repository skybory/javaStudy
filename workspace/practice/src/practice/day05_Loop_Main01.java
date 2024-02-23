package practice;

public class day05_Loop_Main01 {

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
		
		//while 로 만들어보자.
		
		int i = 1;
		int [][]multiple = new int [9][9];
		while (i < multiple.length) {
			int j = 0; 
			while( j < multiple[i].length){
				
				int product = (i+1) * (j+1);
			System.out.println((i+1) + " * "+ (j+1) + " = " + product);
			j++;	
			
			}
			System.out.println("-------------------------------");
			
			i++;
		}
		
	}

}
