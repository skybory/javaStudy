package kr.co.codingbox.study.helper;
/*
 * 기본적인 공통 기능들을 묶어 놓은 클래스 (잔잔바리 메서드들을 나열해두는 곳)
 * 내가 원하던것
 */


public class Util {
	//----------싱글 톤 객체 생성 시작 ------------
			
		private static Util current;
											// singleTon 에서 객체를 생성할때는 암묵적으로 getInstance 라는 메서드를 사용.
		public static Util getInstance() {		// 한번만 만들고, 그 다음엔 꺼내서 쓰면 됨
			if (current == null) {				// current 자리에 객체가 없으면,
				current = new Util();			// 새로운 객체를 생성해줘라
			}
			return current;						// 둘 중 어떤 경우든, current를 반환한다
		}
		
		
		public static void freeInstance() {
			current = null;
		}
		
		
		private Util() {
			
		}
			
	//----------싱글 톤 객체 생성 끝 --------------
	
		
	//메서드 정의
	public static int min(int a, int b) {
		return Math.min(a, b);
	}
	
	public static int max (int a, int b) {
		return Math.max(a, b);
	}
	
	public static int random(int min, int max) {
		int num = (int) ((Math.random() * (max - min + 1)) + min);
		return num;
	}
	/*
	 * 범위를 갖는 랜덤값을 생성하여 리턴하는 메서드
	 * 
	 * @param	 min : 범위 안에서의 최소값
	 * @param	 max : 범위 안에서의 최대값
	 * @return	 int : min~max 안에서의 랜덤값 ( return 타입이 int 타입 )
	 * 
	 * 
	 */
	
}
