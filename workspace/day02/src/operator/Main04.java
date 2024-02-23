package operator;

public class Main04 {

	public static void main(String[] args) {
		int a1 = 100;
		int x1 = 1;
		int y1 = a1 + x1++;
		
		System.out.println("x1 = " + x1); 	// x1 = 2 가 나올 것
		System.out.println("y1 = " + y1);	// y1 = 100+1 = 101 이 나올 것
		System.out.println("=====================================");
		
		int a2 = 100;
		int x2 = 1;
		int y2 = a2 + ++x2;
		
		System.out.println("x2 = " + x2); 	// x2 = 2 가 나올 것
		System.out.println("y2 = " + y2); 	// y2 = 100+(1+1) = 2가 나올 것
	}

}
