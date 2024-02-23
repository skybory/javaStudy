package exam01;

public class Problem2 {

	public static void main(String[] args) {
		//2. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10) 의 결과를 계산하시오.(10)
		
		int sum1 = 0;									//전체 총 합 계산하기
		int sum2 = 0;									//괄호 안의 부분합 계산하기
		for (int i = 1; i <=10; i++) {
				for ( int j = 1; j <= i; j++) {
					sum2 += j;									
		//			System.out.println("sum2 : " + sum2);	// sum2값 확인하기
				}
			sum1 += sum2;								//sum1 값 누적시키기
			sum2 = 0;									//sum2 초기화시켜서 1부터 다시 더하기
		//	System.out.println("sum1 : " + sum1);		//sum1값 확인하기
					
		}
		System.out.println(sum1);						//결과값 출력하기

	}

}
