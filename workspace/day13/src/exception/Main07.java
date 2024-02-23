package exception;

public class Main07 {

	public static void main(String[] args) {
		
		String[] src = {"10", "2", "5", "7"};
		
		int[] arr = new int[3];
		try {
			for(int i=0; i<src.length; i++) {
			arr[i] = Integer.parseInt(src[i]);	//"가"를 정수형으로 바꿔서 문제가 생김.
			System.out.println(arr[i]);
			}
		}
//exception을 위로 올리면 에러가 남
		
		catch (NumberFormatException e) {
			System.out.println("숫자 형태 오류입니다");
			e.printStackTrace();
			}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 오류입니다");
			e.printStackTrace();
			}
		catch (Exception e) {
			System.out.println("기타 오류입니다");
			e.printStackTrace();
			}
		finally {
			System.out.println("데이터 변환 종료");
		}
		
		System.out.println("----프로그램 종료----");
			
	}
		
}


