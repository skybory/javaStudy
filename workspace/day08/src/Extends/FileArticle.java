package Extends;

public class FileArticle extends Article {						//Article 클래스를 상속받는 FileArticle 클래스

	private String FileName;									//fileName 필드 생성 (private)

	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		FileName = fileName;
	}

	@Override
	public String toString() {		//toString 메서드 생성(public)
		int num = getNum();
		String title = getTitle();
		
		return "FileArticle [FileName=" + FileName + " num=" +   num + " Title=" + title + "]";
	}
	
	
	
	
}
