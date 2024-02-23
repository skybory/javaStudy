package Scanner;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("int type 입력 ");
		int i = scanner.nextInt();
		System.out.println("int 결과 : " + i);
		
		System.out.println("double type 입력 : ");
		double d = scanner.nextDouble();
		System.out.println("double 결과 : " + d);
		
		System.out.println("String 입력 : ");
		String s = scanner.next();
		System.out.println("String 결과 : " + s);
		
		scanner.close(); 		//( 외부와의 통신이 있을 때 )스캐너는 닫아줘야함 
	}

}
