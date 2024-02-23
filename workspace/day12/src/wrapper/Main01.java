package wrapper;

public class Main01 {

	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		
		
		/*
		 * 
		 * wrapper 클래스의 가장 중요한 기능은 특정 데이터형의
		 * 모양을 하고 있는 문자열을 실제 데이터형으로 변환하는 기능
		 * 
		 */
		int num_a = Integer.parseInt(a);
		float num_b = Float.parseFloat(b);
		
		// 변환된 값은 사칙연산이 가능하다
		int v1 = num_a + 500;
		float v2 = num_b + 500;
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		System.out.println(v1+v2);
		// Deprecated
		Integer i = new Integer(123);		//쓰지 말것을 권장. 다음 버젼에 사라짐.
											//당연히 다른 방법(더 편한 방법)이 존재.
		System.out.println("i 값은 = " + i);
		// 기본 데이터 형과 객체화된 데이터는 서로 연산이 가능.
		int j = i + 300;
		System.out.println("j 값은 = " + j);
	}

}
