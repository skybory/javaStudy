package string;

public class Main02 {

	public static void main(String[] args) {
		/*
		 * 이메일 주소에서 아이디와 도메인 구별하기
		 * String, student@java.com
		 * 아이디 : @전까지 -> 여기서는 student
		 * 도메인 : @이후 끝까지 -> 여기서는 java.com
		 * 단, split 사용 불가
		 */
		
		String name = "student@java.com";
		//@가 나타나는 위치 얻기
		int name_pos = name.indexOf("@");
		// 처음 ~ @ 가 나타나는 위치까지 자르기 : id
		String id = name.substring(0,name_pos);
		// @ 가 나타나는 위치 다음부터 끝까지 자르기 : 도메인
		String domain = name.substring(name_pos + 1);

		System.out.println("아이디 : " + id);
		System.out.println("도메인 : " + domain);
	}

}
