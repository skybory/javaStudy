 package string;

 /*
  * 이스케이프 문자 \
  * -------------------------------
  * 프로그램의 문자열 안에 포함될 수 있는 특수 문자.
  * ex) 문자열 안에서 쌍따옴표를 표현하고자 하는 경우 사용
  * 
  * 
  */
 
 
public class Main01 {

	public static void main(String[] args) {
		System.out.println("java");
		String src = "JAVA";
		// 문자열 안에 쌍따옴표를 포함시키기
		System.out.println("\"" + src + "\"");
		System.out.println("------------------------------");
		
		// 문자열 안에 홑따옴표 포함시키기	: 왜 이스케이프 쓰는지 잘 모르겠음
		System.out.println("\'" + src);

		
		// 줄바꿈 문자
		System.out.println("\n" + src);		//Enter와 같은 역할
		System.out.println("------------------------------");	
		
		// Tab키
		System.out.println("\t" + src);
		System.out.println("        " + src);
		System.out.println("------------------------------");
	}

}
