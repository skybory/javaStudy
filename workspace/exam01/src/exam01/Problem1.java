package exam01;

public class Problem1 {

	public static void main(String[] args) {
		/*1. 1 부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을
		구하시오.(10)
		*/
		
		int sum = 0;
		for (int i = 1; i<=20; i++) {			// 1부터 20까지의 정수에서
			if (i % 2 != 0 && i % 3 != 0) {		// 2의 배수가 아니거나, 3의 배수가 아니라면
				sum += i;						// sum 에 값을 더한다
		//System.out.println(i);				// i 값 점검
			}
			
		}
		
		System.out.println(sum);				// 결과값 출력
		
		
	
	}

}
