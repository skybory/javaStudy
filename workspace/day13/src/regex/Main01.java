package regex;
import java.util.regex.Pattern;

public class Main01 {

	public static void main(String[] args) {
		// 회원가입시에 입력한 내용을 가정한 변수들
		String name = "김자바";
		String age = "19";
		String email = "user@java.com";
		String phone = "01012345678";
		
		// 한글 여부 검사
		boolean isKor = Pattern.matches("^[ㄱ-ㅎ가-힣]*$", name);
		
		if(!isKor == true ) {				// isKor == false 이면 if문 타기. ( 주로 true 기 때문에, 간소화하기 위함인듯?)
			System.out.println("이름을 한글로 입력해주세요");
		/*
		 * 실행 도중 return을 만나면 즉시 중단
		 * void형은 return 키워드만 명시한다
		 * 
		 */
			return;	//이건정상종료임
		}
		
		boolean isNum = Pattern.matches("^[0-9]*$",age);
		// 숫자인지 검사
		if(!isNum == true) {   		
			System.out.println("나이는 숫자로만 입력해 주세요");
			return;
		}
		
		boolean isEmail = Pattern.matches("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$", email);
		if(!isEmail == true) {
			System.out.println("이메일 형식이 맞지 않습니다.");
			return;
		}

		boolean isPhone = Pattern.matches("^01(?:0|1|[6-9])(?:\\d{3}|\\d{4})\\d{4}$", phone);
		if (!isPhone) {
			System.out.println("전화번호 형식이 맞지않습니다.");
		return;
		}
		
		System.out.println("회원가입 절차를 진행합니다");
	}

}
