package level2;
/////////////////////////////////////////////////////////////////////////////////////////////
//기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의

//아래 표준 입출력 예제 필요시 참고하세요.
//표준 입력 예제
//int a;
//double b;
//char g;
//String var;
//long AB;
//a = sc.nextInt();                           // int 변수 1개 입력받는 예제
//b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
//g = sc.nextByte();                          // char 변수 1개 입력받는 예제
//var = sc.next();                            // 문자열 1개 입력받는 예제
//AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
//표준 출력 예제
//int a = 0;                            
//double b = 1.0;               
//char g = 'b';
//String var = "ABCDEFG";
//long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
*/
class Pattern
{
public static void main(String args[]) throws Exception
{
/*
아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
*/
//System.setIn(new FileInputStream("res/input.txt"));

/*
표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
*/
Scanner sc = new Scanner(System.in);
int T;
T=sc.nextInt();
/*
여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
*/

for (int test_case = 1; test_case <= T; test_case++) {
//	KOREAKOREAKOREAKOREAKOREAKOREA

	String str = sc.next();
	System.out.println(str.length()); // 문자 길이 조회. 1번.
	/*
	 * 1. 문자열의 길이를 조회한다 ( 반드시 30으로 주어진다 ) 2. 문자열을 1개씩 잘라보고, 2개씩 잘라보고, 3개씩 잘라본다..15개씩
	 * 잘라본다 2-1. 1번식 = 2번식 인지 비교해본다.
	 * 
	 */
	String str2 = str.substring(0, 1);
	
	for (int i = 1; i < str.length(); i++) {
		boolean exit = false;
		for (int j = 0; j + 2 * i < str.length(); j++) {
			int count = 0;
			String before = str.substring(j, j + i);
			String after = str.substring(j + i, j + 2 * i);

			if (before.equals(after)) {
				count++;
			}
			
			if (count == str.length()-j+1) {
				System.out.println("패턴입니다");
				System.out.println(before);
				exit = true;
				break;
			}
			if (exit) {
				break;
			}
		}

	}
}

}
}
	
	
	
	
	
	
	
	
	
//	[제약 사항]
//
//			각 문자열의 길이는 30이다. 마디의 최대 길이는 10이다.
//
//
//			[입력]
//
//			가장 첫 줄에는 테스트 케이스의 개수 T가 주어지고, 그 아래로 각 테스트 케이스가 주어진다.
//
//			각 테스트 케이스의 첫 번째 줄에는 길이가 30인 문자열이 주어진다.
//
//
//			[출력]
//
//			출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
//
//			(t는 테스트 케이스의 번호를 의미하며 1부터 시작한다.)
/////////////////////////////////////////////////////////////////////////////////////////////
/*
이 부분에 여러분의 알고리즘 구현이 들어갑니다.
*/
/////////////////////////////////////////////////////////////////////////////////////////////
