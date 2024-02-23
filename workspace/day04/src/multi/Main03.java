package multi;

public class Main03 {

	public static void main(String[] args) {
		/*
		 * 1. 1~10 까지의 숫자의 합은 ?
		 	for 문으로도 해보고 while 문으로도 해보자
		 */
		int sum1 = 0;
		for ( int i = 1; i <= 10; i++) {
			sum1 += i;
			
		}
		System.out.println("for 문 : 1~10 사이의 합 : " + sum1);
		
		
		int while_sum1 = 0;
		int while_i = 0;
		while ( while_i <= 10) {
			while_sum1 += while_i;
			while_i ++;
		}
		System.out.println("while 문 : 1~10 사이의 합 : " + while_sum1);
		System.out.println("=====================================");
		
		/*
		 * 2. 1~10 까지의 홀수의 합
		 */
		
		int sum_odd = 0;
		for ( int i = 1; i<= 10; i++) {
			if (i % 2 == 1) {				//홀수 구하는 조건식
				sum_odd += i;
			}
		}
		System.out.println("for 문 : 1~10 사이의 홀수의 합 : " + sum_odd);
		

		int while_sum_odd = 0;
		int while_i_2 = 0;
		while ( while_i_2 <= 10) {
			if ( while_i_2 % 2 == 1)
			while_sum_odd += while_i_2;
			while_i_2 ++;
		}
		System.out.println("while 문 : 1~10 사이의 홀수의 합 : " + while_sum_odd);
		System.out.println("=====================================");
		
		
		/*
		 * 3. 1~10 까지의 짝수의 합
		 */
		
		int sum_even = 0;
		for ( int i = 1; i<= 10; i++) {
			if (i % 2 == 0) {
				sum_even += i;
			}
		}
		System.out.println("for 문 : 1~10 사이의 짝수의 합 : " + sum_even);
		
		int while_sum_even = 0;
		int while_i_even = 0;
		while ( while_i_even <= 10) {
			if ( while_i_even % 2 == 0)
			while_sum_even += while_i_even;
			while_i_even ++;
		}
		System.out.println("while 문 : 1~10 사이의 짝수의 합 : " + while_sum_even);

		
		System.out.println("=====================================");
		/*
		 * 4. 구구단 2단.
		 * 화면 : 	2 * 1 = 2
		 * 		 	2 * 2 = 4
		 * 			...
		 * 			2 * 9 = 18
		 */
		System.out.println("for 문 구구단 2단");
		
		for ( int i = 1; i < 10; i ++) {
			int j = 2;
			int result = j * i;	
		System.out.println(j + " * " + i + " = " + result );	
		}
		
		System.out.println("=====================================");
		System.out.println("while 문 구구단 2단");
		int while_result = 0;
		int while_i2 = 1;
		int while_j = 2;
		while (while_i2 < 10) {
			while_result = while_j * while_i2;
			System.out.println(while_j + " * " + while_i2 + " = " + while_result );	
			while_i2++;
		}
		
		/*
		 * 5. while 문으로 작성
		 * "10번찍어 안넘어가는 나무 없다"
		 * 결과 : 	나무를 1번 찍었습니다.
		 * 			나무를 2번 찍었습니다.
		 * 			...
		 * 			나무를 10번 찍었습니다.	
		 * 			나무가 넘어갑니다.
		 */
			
			//12시까지 해보기
		System.out.println("=====================================");
		System.out.println("while 문 '10번 찍어 안넘어가는 나무 없다'");
		int treeHit = 1;
		while (treeHit <= 10) {
			System.out.println("나무를 " + treeHit + "번 찍었습니다.");			
			if (treeHit == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
			treeHit++;
		}
		
		//for 문으로 해볼수있나?
		System.out.println("=====================================");
		System.out.println("for 문 '10번 찍어 안넘어가는 나무 없다'");
		
		for(int tree = 1; tree <= 10; tree++) {
			System.out.println("나무를 " + tree + "번 찍었습니다.");
			if ( tree == 10) {
				System.out.println("나무가 넘어갑니다.");
			}
		}
		System.out.println("=====================================");
		
	
	}

}
