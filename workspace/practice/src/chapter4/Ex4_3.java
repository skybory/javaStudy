package chapter4;
import java.util.Scanner;
public class Ex4_3 {

	public static void main(String[] args) {
		System.out.println("숫자를 하나 입력하세요 >>");
		
		Scanner scanner = new Scanner(System.in);	// Scanner 클래스에서 객체 scanner 생성, 화면을 통해 입력받는 System.in 사용
		int input = scanner.nextInt();				// input 값에 객체 scanner 에서 받은 int형 값 대입.
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0 입니다.");
		}
		
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다");
		}
	} //main 의 끝

}
