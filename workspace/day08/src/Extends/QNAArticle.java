package Extends;



public class QNAArticle extends Article {		//Article 클래스를 상속 받는 QNAArticle 클래스
	
 private String answer;							//answer field 생성(private)

public String getAnswer() {						//getter setter 생성
	return answer;
}

public void setAnswer(String answer) {
	this.answer = answer;
}


@Override										//toString 생성
public String toString() {
	int num = getNum();							//지역변수 num 에 getNum()메서드를 통해 전역변수 num을 대입
	String title = getTitle();
	return "QNAArticle [answer=" + answer + " num=" + num + " Title=" + title + "]";
}
 


}
   