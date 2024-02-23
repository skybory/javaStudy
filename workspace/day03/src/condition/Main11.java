package condition;

public class Main11 {

	public static void main(String[] args) {
		
		int a = 0;
		if (5 < 4) {
			a = 50;
		} else {
			a = 40;
		}
		System.out.println(a); 			//5<4 는 false 니깐 a = 40; 시행 
		System.out.println("=================================");
		
		//	삼항연산자 ( 한정적인 쓰임이지만, 한 눈에 보인다는 장점 )
		//	(조건문)?
		int b = (3 < 4)? 50 : 40; 		// b 값에 5<4 가 참이면 50, 거짓이면 40을 할당, 조건문 앞에 ! 붙일 수 있음. 
		System.out.println("b : " +b);
	}

}
