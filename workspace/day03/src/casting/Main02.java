package casting;

public class Main02 {

	public static void main(String[] args) {
		double a = 10.4D;
		float b = 20.4F;
		/*
		큰 범위의 변수와 작은 범위의 변수가 연산을 수행하면, 작은 범위의 변수가 큰 범위의 데이터형으로 암묵정 형변환을 수행한다.
		그러므로 아래의 a+b 는 double 형의 변수가 되므로, float 형의 값에 대입하는 것이 에러이다.		 
		 */
		// float f = a + b; (값손실 발생)
		
		System.out.println(a+b); 		//double 형 결과값 a+b
		
		float f = (float) (a+b);		//float로 명시적 형변환된 결과값 a+b
		System.out.println(f);
		
		double d = a+b;					//double 형 결과값 a+b
		System.out.println(d);
	}

}
