package array;

public class Main01 {

	public static void main(String[] args) {
		/*
 		* 배열의 생성
 		*/
		
		//배열의 선언과 크기 지정 및 값의 할당에 대한 개별처리
		int[] dooly;					//배열의 선언
		int[] chaaa;
		char[] poo;
		double[] aghai;
		
		dooly = new int[3];				//크기 지정
		dooly[0] = 75;					//값 할당
		dooly[1] = 82;
		dooly[2] = 91;
		
		//배열의 선언과 크기 지정의 일괄처리
		int[] douneo = new int[3];		//배열의 선언 및 크기 지정
		//이거 왜 3보다 작게 해도 오류가 안뜨지???
		douneo[0] = 88;					//값 할당
		douneo[1] = 64;
		douneo[2] = 50;
		
		//배열의 생성의 일괄처리
		int[] ddocy = new int[] {100,100,90};	//배열의 선언 및 크기 지정 및 값 할당
		
		/*
		 * 배열의 활용
		 */
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		// sum1 : 둘리의 총합		총합과 평균 출력
		// sum2 : 도우너의 총 합
		// sum3 : 또치의 총 합
		// 반복문으로 둘리,도우너,또치의 총합과 평균 출력하기.
		// 3시까지!
		
		
		for (int i=0; i<dooly.length; i++) { 			// 유지보수 차원에서 i < 3 보다 (이를 하드코딩이라고 부른다) , i < dooly.length 라고 표현하는게 좋음
			sum1 += dooly[i];
		}
		for (int i=0; i<douneo.length; i++) {
			sum2 += douneo[i];
		}
		for (int i=0; i<ddocy.length; i++) {
			sum3 += ddocy[i];
		}
		
		int doolyAverage = sum1 / dooly.length; 
		int douneoAverage = sum2 / douneo.length;
		int ddocyAverage = sum3 / ddocy.length;
		
		System.out.println("둘리의 총 합 : " + sum1 + ", 둘리의 평균 : " + doolyAverage);
		System.out.println("도우너의 총 합 : " + sum2 + ", 도우너의 평균 : " + douneoAverage);
		System.out.println("또치의 총 합 : " + sum3 + ", 또치의 평균 : " + ddocyAverage);
		
	}

}
