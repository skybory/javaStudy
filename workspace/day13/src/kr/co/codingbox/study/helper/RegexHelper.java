package kr.co.codingbox.study.helper;

import java.util.regex.Pattern;

public class RegexHelper {

	//싱글톤
		
		private static RegexHelper current;
		
												// singleTon 에서 객체를 생성할때는 암묵적으로 getInstance 라는 메서드를 사용.
		public static RegexHelper getInstance() {		// 한번만 만들고, 그 다음엔 꺼내서 쓰면 됨
			if (current == null) {				// current 자리에 객체가 없으면,
				current = new RegexHelper();			// 새로운 객체를 생성해줘라
			}
			return current;						// 둘 중 어떤 경우든, current를 반환한다
		}
		
		public static void freeInstance() {
			current = null;
		}
		 
		private RegexHelper() {
		}
		
	//싱글톤
	
		
	//validation 처리 메서드 정의
			 
		 /*
		  * 1. 숫자 모양에 대한 형식검사 (isNum)
		  * @parma	: str		- 검사할 문자열
		  * @return	: boolean	- 형식에 맞을 경우 true, 아닐 경우 false
		  */
		
		 /*
		  * 2. 한글 모양에 대한 형식검사 (isKor)
		  * @parma	: str		- 검사할 문자열
		  * @return	: boolean	- 형식에 맞을 경우 true, 아닐 경우 false
		  */

		 /*
		  * 3. email 모양에 대한 형식검사 (isEmail)
		  * @parma	: str		- 검사할 문자열
		  * @return	: boolean	- 형식에 맞을 경우 true, 아닐 경우 false
		  */

		 /*
		  * 4. 전화번호 형식에 대한 형식검사 (isPhone)
		  * @parma	: str		- 검사할 문자열
		  * @return	: boolean	- 형식에 맞을 경우 true, 아닐 경우 false
		  */
		
		public boolean isNum(String age) {
			
			//리턴형이 boolean일때는 boolean 변수를 하나 만들어줌
			
			return Pattern.matches("^[0-9]*$", age);
		}
//				System.out.println("나이는 숫자로만 입력해 주세요");
		
		public boolean isKor(String name) {
			return Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name); 
		}
		
		public boolean isEmail(String email) {
			return Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email);
		
		}
		
		public boolean isPhone(String phone) {
			return Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone);	
			
		}
		
		public void validCheck (String name, String age, String email, String phone) {
			if(!isNum(age)) {
				System.out.println("나이는 숫자로 입력해주세요");
				return;
			}
			if(!isKor(name)) {
				System.out.println("이름은 한글로 입력해주세요1");
				return;
			}
			if(!isEmail(email)) {
				System.out.println("이메일 형식으로 입력해주세요");
				return;
			}
			if(!isPhone(phone)) {
				System.out.println("전화번호 형식으로 입력해주세요");
				return;
			}
			
			
		}

		
		
}











