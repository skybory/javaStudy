package condition;

public class Main03 {

	
	public static void main(String[] args) {
		boolean is_korean = false;
		
		
		if ( is_korean == true) {
			System.out.println("한국 사람입니다");
		} else {
			System.out.println("한국 사람이 아닙니다");
			
		}
//값 자체가 boolean 이므로 성립하는 코드
		if (is_korean) {
			System.out.println("한국 사람입니다");
		}
		else {
				System.out.println("한국 사람이 아닙니다");
			}
		
		// !는 값을 부정한다. true 부정이므로 거짓이 왼다
			
			if( !is_korean ) {
				System.out.println("한국 사람이 아닙니다");
			}
			else {
				System.out.println("한국 사람입니다");
			}
		
		}
	}

