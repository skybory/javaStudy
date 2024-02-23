package loop;

public class Main01 {

	public static void main(String[] args) {
		
		//	1~100까지의 누적된 합
		
		int sum = 0;					//결과값
for ( int i = 1; i <= 100 ; i++) {
	sum += i;							//sum = sum + i; 반복하면서 sum 이 0, 0+1, 0+1+2, ... , 0+1+2+3+...+10 까지 증가함

System.out.println("i : " + i); 		//for 문이 진행되는 동안 i 값을 추적하기 위함.
System.out.println("sum : " + sum); 	//for 문이 진행되는 동안 sum 값을 추적하기 위함.
}
System.out.println(sum);
	}

}
