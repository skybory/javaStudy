package overload;

/*
 * 파라미터가 서로 다른 생성자들이 하나의 완전한 생성자를 호출하도록 하여,
 * 데이터의 초기화를 한 곳에서 일괄적으로 처리하도록 구현할 수 있다.
 */

public class Article {
	private int seq;
	private String subject;
	private String writer;
	private int hit; 		//조회수 변수 추가
	// seq, subject, writer
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	// seq,"제목없음","익명"	
	public Article(int seq) {
		//this.seq = seq;
		//this.subject = "제목없음";
		//this.writer = "익명";
		this(seq,"제목없음","익명");		//hit를 추가하고싶으면 여기를 this(seq,"제목~","익명~",153); 이런식으로 수정하면 됨.
	}

	// seq, subject, "익명"
	public Article(int seq, String subject ) {
	//	this.seq = seq;
		//this.subject = subject;
		//this.writer = "익명";
		this(seq, subject,"익명");
	}

	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject + ", writer=" + writer + "]";
	}
	
	
	
}
