package object;
class Article2{
	private int seq;		// 글 번호
	private String subject;	// 글 제목
	private String content; // 글 내용
	private String writer;	// 작성자
	private String regDate;	// 작성일
	private int hit;		// 조회수
	
	//마우스 우클릭 -> source -> generate getter&setter 통해서 아래 문구 자동완성
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}

}



public class Main07 {

	public static void main(String[] args) {

	}

}
