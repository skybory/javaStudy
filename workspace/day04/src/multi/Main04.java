package multi;

public class Main04 {

	public static void main(String[] args) {
		//1부터 100까지의 홀수들의 합
		
		int sum = 0;
		int i = 0; 		//while 문을 쓸꺼기 때문에 초기값을 외부로 빼둠.
		while(true) {
			i++;
			if(i % 2 == 0) {	//짝수
				continue;
			}
			
			if (i >100) {
				break;
			}
			sum += i;
		}
		
		System.out.println(sum);
		
	}

}
