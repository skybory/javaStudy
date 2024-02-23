package wondering;

public class number1 {

	public static void main(String[] args) {
		// 공부하다가 갑자기 든 생각.
		// 정수형 변수 int에 할당된 값 4 와 실수형 변수 double에 할당된 값 4.1 의 대소비교는 가능할까?
	
		int a = 4;
		double b = 4.1D;
		if ( a < b == true) {
			System.out.println("참입니다.");
		}
		else {
			System.out.println("거짓입니다");
		}
		int result1 = (int) (b - a);
		double result2 = b - a;
		
		System.out.println("result1의 값은 : " + result1);
		System.out.println("result2의 값은 : " + result2);
	}

}
// 	참입니다.
//	결론 : 가능하다.