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


/*다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.

    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
    3. 판매는 얼마든지 할 수 있다.

예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.


[입력]

첫 번째 줄에 테스트 케이스의 수 T가 주어진다. 예시 : 3

각 테스트 케이스 별로 첫 줄에는 자연수 N(2 ≤ N ≤ 1,000,000)이 주어지고,  예시 : 5

둘째 줄에는 각 날의 매매가를 나타내는 N개의 자연수들이 공백으로 구분되어 순서대로 주어진다. 1/1/3/1/2

각 날의 매매가는 10,000이하이다.


[출력]

각 테스트 케이스마다 ‘#x’(x는 테스트케이스 번호를 의미하며 1부터 시작한다)를 출력하고, 최대 이익을 출력한다.


[예제 풀이]

1번째 케이스는 아무 것도 사지 않는 것이 최대 이익이다.

2번째 케이스는 1,2일에 각각 한 개씩 사서 세 번째 날에 두 개를 팔면 10의 이익을 얻을 수 있다.
 * 
 */

class Rich
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
T=sc.nextInt();	//케이스 값 주어짐
/*
여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
*/

for(int test_case = 1; test_case <= T; test_case++)
{
	int x = sc.nextInt();	//길이 받아옴.
	int [] cost = new int[x]; //cost 길이 지정
	//배열 받는 논리 안만들었다
	for (int i = 0; i<x; i++) {
		cost[i] = sc.nextInt();
	}
	int indexMax = 0;
	int total = 0;
	int result = 0;
	int reply = 0;
	int costMax;
	for (int i=1; i<cost.length; i++) {
		if(cost[i]>cost[i-1]) {
			costMax = cost[i];
		}
		//제일최댓값 찾기
		if (cost[i] > cost[i-1]) {
			int tem = indexMax + reply;
			indexMax = i;
			int sum = 0;
			
			if (cost[indexMax] == Math.max(test_case, T))
//			System.out.println("현재 indexMax 값은 : " + indexMax);
			for (int j = tem; j<indexMax; j++) {	//j가 0,1 에서 반복(총2회)
//				System.out.println("현재 j값은 : " + j);
				sum += cost[j];
//				System.out.println("현재 sum 값은 : " + sum);
				total = (indexMax-tem) * cost[indexMax] - sum;
//				System.out.println("현재 total 값은 : " + total);
				reply = 1;
			}
			result += total;
		}
	}

	System.out.printf("#%d %d\n",test_case,result);
}


}
}