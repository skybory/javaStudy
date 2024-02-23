package Static;

public class Main01 {

	public static void main(String[] args) {
		Article.setCategory("자유게시판");
		
	//	Article.setCount(1);		
		Article article1 = new Article(1, "첫 글", "2024.01.03");
		
	//	Article.setCount(2);
		Article article2 = new Article(2, "두번째 글", "2024.01.03");
		
		//객체 생성시마다 어차피 카운트가 1 올라가야한다면, 생성자에 추가하자
	
		System.out.println(article1.toString());
		System.out.println(article1.toString());
		
	
	}

}
