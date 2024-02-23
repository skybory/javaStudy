package operator;

public class Main06 {

	public static void main(String[] args) {
		int a = 100;
		int b = 200;
		int x = 5;
		int y = 3;
		
	 
		boolean result1 = a != b || a == b;		//true
		boolean result2 = a < b || x > y;		//true
		boolean result3 = a < b || x < y;  		//true
		boolean result4 = a > b || x > y;		//true
		boolean result5 = a > b || x < y; 		//false
		boolean result6 = a < b && x > y;		//true
		boolean result7 = a < b && x < y;		//false
		boolean result8 = a > b && x > y;		//false
		boolean result9 = a > b && x < y;		//false
		boolean result10 = a != b && a == b;	//false
	
	System.out.println("result1 : " + result1);
	System.out.println("result2 : " + result2);
	System.out.println("result3 : " + result3);
	System.out.println("result4 : " + result4);
	System.out.println("result5 : " + result5);
	System.out.println("result6 : " + result6);
	System.out.println("result7 : " + result7);
	System.out.println("result8 : " + result8);
	System.out.println("result9 : " + result9);
	System.out.println("result10 : " + result10);

	
	System.out.println("=================================");
	
		boolean r1 = a >= b;					//false
		boolean r2 = x >= y;					//true
		boolean result11 = r1 && r2; 			//false
		boolean result12 = r1 || r2;			//true
		
		System.out.println(result11);			//false
		System.out.println(result12);			//true
	

		System.out.println("=================================");
		
		boolean success = true;					//success 라는 boolean 변수에 true 를 할당해줌.
		boolean fail = !success;				//fail 이라는 boolean 변수에 success(=true) 의 부정을 할당함. 측 false 가 할당됨.
		
		System.out.println(fail); 				//false
	
	
		
		
	}

}
