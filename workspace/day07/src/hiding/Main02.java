package hiding;

public class Main02 {

	public static void main(String[] args) {

		Article book = new Article(1, "자바의정석"
				,"열심히공부해","남궁성",123,"2022-03-15");
		
//		System.out.println(book.getSeq());
//		System.out.println(book.getSubject());
//		System.out.println(book.getContent());
//		System.out.println(book.getWriter());
//		System.out.println(book.getHit());
//		System.out.println(book.getRegDate());
	
		System.out.println(book.toString());
	}

}
