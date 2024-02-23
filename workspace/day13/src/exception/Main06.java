package exception;

public class Main06 {

	public static void main(String[] args) {
		// NumberFormatEx
		// ArrayIndexOut
		// Exceptioni
		
		
		
		// 사용자의 입력값을 가정해보자.
		
		
		
		String[] src = {"10", "2", "5", "7"};
		
		// src의 내용들을 숫자로 변환해서 저장할 배열
		int[] arr = new int[3];
		try {
			for(int i=0; i<src.length; i++) {
			arr[i] = Integer.parseInt(src[i]);	//"가"를 정수형으로 바꿔서 문제가 생김.
			System.out.println(arr[i]);
			}
		}
		catch (NumberFormatException e) {
			System.out.println("숫자 형태 오류입니다");
			e.printStackTrace();
			}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 오류입니다");
			e.printStackTrace();
			}
		catch (Exception e) {
			/*예외 종류를 의미하는 모든 클래스는
			java.lang.Exception 클래스를 상속받기 때문에
			이 구문은 모든 종류의 예외에 대처가능하다.
			*/
			
			System.out.println("기타 오류입니다");
			e.printStackTrace();
			}
		finally {
			//이 블록은 예외의 발생 여부에 상관없이
			// 무조건 실행
			System.out.println("데이터 변환 종료");
		}
		
		System.out.println("----프로그램 종료----");
			
	}
		
}


