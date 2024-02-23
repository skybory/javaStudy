package exam01;

public class Problem7 {

	public static void main(String[] args) {

		/*7.num 배열에 저장된 요소의 홀수와 짝수의 합을 각각 구하시오. (10)
		[배열]

		[출력 결과]
		짝수 : 20
		홀수 : 25
		*/
		int evenSum = 0;
		int oddSum = 0;
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};		
		for(int i = 0; i<num.length; i++) {
			if (num[i] % 2 == 1) {
				oddSum += num[i];
			}
			else if (num[i] % 2 == 0) {
				evenSum += num[i];
			}
			else
				break;
		}
		
		System.out.println("짝수 : " + evenSum);
		System.out.println("홀수 : " + oddSum);
	}

}
