
// 이 클래스가 어떠한 패키지에 소속되어 있는지를 명시한다.
package kr.co.codingbox.myapp;

//하나의 게시물을 표현하기 위한 javaBeans
public class Article {
	private int num;		// 글 번호
	private String title; 	// 글 제목
	private String regDate;	// 작성일시
	//전체 게시물의 수를 표현하기 위한 데이터
	private static int count;	// static int 타입의 count 
	//모든 게시물은 하나의 카테고리 안에 존재한다고 가정.
	//카테고리는 게시물의 분류를 구별하기 위한 데이터
	private static String category;	// static String 타입의 category 
	
	/*
	 * static 은 모든 객체가 공유하는 값이다.
	 * static 값은 클래스 이름을 통해서 접근해야 하며,
	 * 객체의 생성 여부에 상관 없이 사용이 가능하다.
	 */
	
	
	
	//파라미터가 있는 생성자 생성
	public Article(int num, String title, String regDate) {
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		/*
		 *  이 클래스에 대한 객체 생성 -> 게시물 신규 등록
		 *  게시물이 새로 등록될 때 마다, 전체 글 수를 의미하는
		 *  count 변수가 1씩 증가한다.
		 *  전체 게시물 수는 모든 객체가 공유하는 값이므로,
		 *  static 으로 생성되어야 한다.
		 */
		
		count++;
	}
	
	//Getter&Setter 생성
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	//static 에 접근하기 위한 메서드도 static 으로 선언이 된 모습(고정 영역에 생성)
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
	}

	@Override
	public String toString() {
		return "글분류 = " + category + ", 전체 글 수 =" + count + "Article [num=" + num + ", title=" + title + ", regDate=" + regDate + "]"; //기본적으로 static 이 아닌 애들로 만들어줌
	}

	
	
	

}
