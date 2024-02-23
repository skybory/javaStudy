package math;
import kr.co.codingbox.study.helper.Util;

public class Main03 {

	public static void main(String[] args) {

		// 중복을 허용한 0~9 사이의 5자리 인증번호
		// ex : 01156, 23788, 52169 ...
		Util.min(0,9);
		Util.max(0,9);
		System.out.println("인증번호");
		String authNum = "";
		for(int i=0; i<5;i++) {
			authNum += Util.random(Util.min(0,9), Util.max(0,9));
		
				}
		System.out.print(authNum);	
	}

}
