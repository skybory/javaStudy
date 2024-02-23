package method;

public class Main02 {

	public static void main(String[] args) {
		int[] numbers = {3,7,1,9,4};
		int max = findMax(numbers);
		System.out.println("최대값: "+ max);

	}
	public static int findMax(int [] numbers) {
	//최댓값 찾는 시스템
	int Max = numbers[0];
	/*
	 *  for (int num : array) {
	 * if (num > max ) {
	 * max = num;
	 * 	}
	 * } 
	 *  array 라는 배열에 있는 숫자를 하나씩 꺼내서 적용시킴. 모든 요소에 대한 반복문을 돌린 후, 종료함.
	 *   
	 *  
	 */
	
	for (int i=1; i<5; i++) {
		if (Max < numbers[i] ) {
			Max = numbers[i];
		}
	//Max 에 최대값 대입 완료.
	}
	return Max;
	}
}
