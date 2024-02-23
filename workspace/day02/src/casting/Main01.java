package casting;

public class Main01 {

	public static void main(String[] args) {
		
		short s = 100;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		System.out.println("s = " + s);		//100
		System.out.println("i = " + i);		//100
		System.out.println("l = " + l);		//100
		System.out.println("f = " + f);		//100.0
		System.out.println("d = " + d);		//100.0
	
		System.out.println("===================================");
		
		int myage1 = 20;
		double myage2 = myage1;
		System.out.println("myage1 : " + myage1);
		System.out.println("myage2 : " + myage2);
		
		System.out.println("===================================");
		
		char c1 = 'a';						//	c1 = 'a'
		int num1 = c1;						// 	a값을 int형으로 바꿔야 하는데, a 값이 아스키코드로 97 이기에 num1 = 97 	
		System.out.println("num1 : " + num1);
	}

}
