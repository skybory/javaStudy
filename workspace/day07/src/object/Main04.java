package object;
class Article{	
	int seq;
	String subject;
	String writer;
	
	/* class Article 안에서 마우스 우클릭 -> Source -> Generate constructor using field
	 * public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	*/
	
	Article(int seq, String subject, String writer) {
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	void print() {
		System.out.println("번호 : " + this.seq);
		System.out.println("제목 : " + this.subject);
		System.out.println("작성자 : " + this.writer);

	}
}

public class Main04 {

	public static void main(String[] args) {

		Article javabook = new Article (100, "자바입문서", "남궁성");	//객체 선언시, 3가지 파라미터를 설정하는 부분을 틀림. class Article{Article() 부분에서 고침.}
		Article article1 = new Article (1 , "자바 첫 게시글", "자바학생");
		Article article2 = new Article (2, "자바 두번째 게시글", "자바강사");
		
		javabook.print();
		
		article1.print();
		article2.print();
		/*
		 * Article 클래스 생성
		 * - 필드 : seq(글 번호), subject(글 제목), writer (작성자)
		 * - 객체 생성시 파라미터로 int, String, String 필수
		 * - print() 메서드 생성해서, 글번호, 글제목, 작성자를 각각 출력
		 * - main() 에서, Article 객체 생성 후 print() 출력
		 * 30분까지
		 */
		
		
		
	}

}
