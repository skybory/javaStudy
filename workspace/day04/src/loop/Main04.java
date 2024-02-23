package loop;

public class Main04 {

	public static void main(String[] args) {
		// do~while 문 연습예제 ( do 는 조건문을 늦게 확인하기 때문에 반드시 1회는 작동함 )
		// while 문의 조건에 만족하지 않는 값을 대입해도 1회 시행되는 걸 확인. 
		int sum = 0;
		int i = 1; 		//초기식
		
		do { 
			sum += i;
			i++;		//증감식	
		} while(i <= 10);
		System.out.println(sum);	
	}

}
