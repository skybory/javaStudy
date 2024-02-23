package string;

public class Main03 {

	public static void main(String[] args) {
		// 주민등록번호에서 생년월일 추출기
		// ex) 8005011234567 -> 1980년 05월 01일 남자
		
		String code = "8005012234567";
		//1 or 2 -> 19~년생
		//3 or 4 -> 20~년생
		//1 or 3 -> 남자
		//2 or 4 -> 여자

		//주민번호를 년,월,일 단위로 각 두 글자씩 자른다.
	String year2 = code.substring(0,2);		//80 잘라오기
	String month = code.substring(2,4);		//05 잘라오기
	String day = code.substring(4,6);		//01 잘라오기
//	String pass = code.substring(6);		//1234567 잘라오기
	//뒷 부분의 첫 번째 글자는 성별코드이므로 별도로 추출한다.
	String key = code.substring(6,7);
	String year = null;
	String gender = null;
	
	if (key.equals("1")) {
		year = "19"+year2;
		gender = "남자";
	}
	else if (key.equals("2")) {
		year = "19"+year2;
		gender = "여자";
	}
	else if (key.equals("3")) {
		year = "20"+year2;
		gender = "남자";
	}
	else if (key.equals("4")) {
		year = "20"+year2;
		gender = "여자";
	}
	else
		System.out.println("잘못된 입력값입니다.");

	System.out.println("이 사람은 ");
	//String.format + System.out.println 이 합쳐진것
	System.out.printf("%s년 %s월 %s일 %s",year,month,day,gender);
	System.out.println("");
	String result =
			String.format("%s년 %s월 %s일 %s",year,month,day,gender);
	System.out.println(result);
	}


}
