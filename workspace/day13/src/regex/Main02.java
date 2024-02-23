package regex;

import kr.co.codingbox.study.helper.RegexHelper;

public class Main02 {

	public static void main(String[] args) {
		String name = "김자바";
		String age = "19";
		String email = "user@java.com";
		String phone = "01041940600";

		System.out.println("회원가입 절차를 진행합니다");
		RegexHelper r = RegexHelper.getInstance();
	/*	r.isNum(age);
		r.isKor(name);
		r.isEmail(email);
		r.isPhone(phone);
		*/
		
		/*if( !RegexHelper.getInstance().isKor(name)) {
			System.out.println("이름은 한글로 입력해주세요");
			return;
		}
		if( !RegexHelper.getInstance().isNum(age)) {
			System.out.println("나이는 숫자로 입력해주세요");
			return;
		}
		if( !RegexHelper.getInstance().isEmail(email)) {
			System.out.println("이메일 형식으로 입력해주세요");
			return;
		}
		if( !RegexHelper.getInstance().isPhone(phone)) {
			System.out.println("휴대폰 번호 형식이 잘못되었습니다");
			return;
		}
		
		
		*/
		r.validCheck(name, age, email, phone);
		}
	
	
	}

	
	// validation 처리 ~50분까지
	

