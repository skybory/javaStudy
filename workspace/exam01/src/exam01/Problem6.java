package exam01;

public class Problem6 {

	public static void main(String[] args) {
		/*6. 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을
		완성하시오.(15)
		[배열]
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{10,10,10,10,10},
		{20,20,20,20,20},
		{30,30,30,30,30}
		};
		[출력 결과]
		total=325
		average=16
		 * 
		 */
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int count = 0;				//배열에 담긴 값이 몇개인지 세 주는 변수 count 만들기
		int total = 0;
		int average = 0;
		for(int i = 0; i<arr.length; i++) {				//i의 값의 범위는 배열이 바뀌면 같이 바뀌도록 설정
			for(int j = 0; j < arr[i].length; j++) {	//j값의 범위도 마찬가지로 배열에 따라 바뀌게 설정
				total += arr[i][j];
				count++;			//total값에 배열의 값을 하나씩 더할때마다, count를 1만큼 올림 --> 배열안에 담긴 값의 갯수를 알 수 있음
			}
		}

System.out.println("total=" + total);
System.out.println("average=" + total/count);
	}

}
