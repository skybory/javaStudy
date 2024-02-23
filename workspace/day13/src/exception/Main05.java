package exception;

public class Main05 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		// try~catch 구문

		
		//배열선언이 try 구문 안으로 들어가면, try,catch 구문이 끝나면 배열이 사라진다(지역변수이기 때문)

		int [] arr = new int[3];
		try {
	
		for(int i = 0; i < 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		
		}		// 여기까지가 try문. 예외가 발생하면 catch문으로 넘겨준다.
		
		}
		catch (ArrayIndexOutOfBoundsException a) {	//여기가 catch문.
			System.out.println("에러가 발생했습니다");
			System.out.println(a.getMessage());
			a.printStackTrace();
		
		}
		System.out.println("배열 출력 : " + arr[2]);
		System.out.println("--- 프로그램 종료 ---");
	}

}
