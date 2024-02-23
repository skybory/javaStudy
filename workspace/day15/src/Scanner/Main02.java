package Scanner;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		/*
		 *  scanner.next()
		 *   - 공백 전 까지 입력을 받음
		 *  scanner.nextLine()
		 *   - 한 줄 전체를 입력 받음
		 *  
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 입력 : ");
		String str1 = scanner.nextLine();	//한줄전체를 출력
		System.out.println(str1);
		
		System.out.println("문자열 입력 : ");
		String str2 = scanner.next();		//띄어쓰기 전까지 출력
		System.out.println(str2);
		
		
		scanner.close();
		
		
		
	}

}
