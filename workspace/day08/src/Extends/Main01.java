package Extends;

public class Main01 {

	public static void main(String[] args) {

		QNAArticle qna = new QNAArticle();
		FileArticle file = new FileArticle();
		
		qna.setAnswer("정답은8입니다");
		qna.setTitle("3+5는 무엇일까");
		qna.setNum(1);
		
		file.setFileName("기초편");
		file.setTitle("자바의정석");
		file.setNum(2);
		
		
		System.out.println(qna.toString());
		System.out.println(file.toString());
	}

}
