package array;

public class Main02 {

	public static void main(String[] args) {

		//20분까지 풀기
		/*
		 * 1. 22,3,8,12 를 배열 안에 선언하고 합계를 구하여라
		 * 
		 */
		System.out.println("문제 1번.");
		int [] array1 = new int [] {22,3,8,12};
		
		int sum1 = 0;
		for ( int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		System.out.println("합계 : " + sum1);
		System.out.println("--------------------------------------");
		
		/*
		 * 2. 60, 90, 88을 배열로 만들어서 합계와 평균을 각각 구하여라
		 * 
		 */
		System.out.println("문제 2번.");
		int [] array2 = new int [] { 60, 90, 88};
		int sum2 = 0;
		int avg;
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		avg = sum2 / array2.length;
		System.out.println("합계 : " + sum2);
		System.out.println("평균 : " + avg);
		System.out.println("--------------------------------------");
		
		/*
		 * 3. 94, 85, 95, 88, 90 를 배열로 선언해서
		 * 이 중에서 최대값을 출력하여라
		 * 
		 */
		
		System.out.println("문제 3번.");
		int [] array3 = new int [] { 94, 85, 95, 288, 90, 100}; // int [] array3 = { 94, 85, 95, 88, 90}; 이렇게 해도 됨.
		int max = array3[0];
		for ( int i = 1; i < array3.length; i++) { 				// int i = 0; 이었는데, array3[0] 값을 자기 자신과 비교하는 불필요한 로직이 생기므로, i=1 로 수정하는게 좋음.
			
		if (max < array3[i]) {
			max = array3[i];
		}
			
		}
		System.out.println("최댓값은 : " + max);
		System.out.println("--------------------------------------");
		/*
		 * 4. 22, 3, 8, 12를 배열로 선언해서
		 * 짝수와 홀수의 합을 각각 구하여라
		 * 
		 */
		System.out.println("문제 4번.");
		
		int [] array4 = new int [] { 22, 3, 8, 12};
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < array4.length; i++) {
			if ( array4[i] % 2 == 0) {
				even += array4[i];
			}
			else if ( array4[i] % 2 == 1) {
					odd += array4[i];
				}
			else {
				System.out.println("에러입니다");
			}
		
			
			}
		System.out.println("짝수의 합은 : " + even);
		System.out.println("홀수의 합은 : " + odd);
		}
		
		
	}

