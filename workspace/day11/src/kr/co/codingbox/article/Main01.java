package kr.co.codingbox.article;

import kr.co.codingbox.myapp.Article;

public class Main01 {

	public static void main(String[] args) {
		//다른 패키지의 클래스를 사용하고자 할 경우,
		//패키지이름을 포함한 FullName으로 사용해야 한다. (import 기능 사용하지 않음)
		kr.co.codingbox.myapp.Article a1
			= new kr.co.codingbox.myapp.Article(1, "제목", "2024");	
		Article.setCategory("dd");	
	}
	
	// 이러한 번거로움을 피하고자 클래스 정의 전에
	// import 구문을 사용하여특정 클래스의 이름이
	// 어떤 패키지에 소속되어 있는지를 명시할 수 있다.

	//Article a2 = new Article(2,"제모옥","2024.01");
	
	
	
}
