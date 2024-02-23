package loop;

public class Main02 {

	public static void main(String[] args) {
		//while 문 연습하기
		//1~10 까지의 누적된 합 구하기
		int sum = 0;
		int i = 1; 			//초기값
		while ( i <= 10) {
				sum += i;
				i++;
		}
		System.out.println(sum);
	}

}
