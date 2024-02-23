package File;

import java.io.File;

public class Main01 {

	public static void main(String[] args) {
		// 이클립스에서 상대 경로를 사용할 경우
		// 현재 프로젝트가 기준이 된다
		// 절대경로나 상대경로를 생성자 파라미터로 전달
		
		File f1 = new File("src/file/Main01.java");		//상대경로
		
		// 전달된 경로가 파일인지 검사
		// -> 존재하지 않는 파일로 검사할 경우 무조건 false
		boolean is_file = f1.isFile();
		System.out.println(is_file);
		
		boolean is_dir = f1.isDirectory();		//폴더로 객체를 만들었기 때문에 디렉토리냐는 질문에 대한 답은 false
		System.out.println(is_dir);
		
		//전달된 경로가 숨김 형태인지 검사
		boolean is_hidden = f1.isHidden();
		System.out.println("isHidden = " + is_hidden); 		//숨김파일이 아니기 때문에 false
		
		//절대경로 값을 추출
		String abs = f1.getAbsolutePath();
		System.out.println("절대경로 = " + abs);
		
		// 생성자에 전달된 파일이나 디렉토리가 물리적으로 존재하는지를 검사
		boolean is_exist = f1.exists();						//존재하고 있기 때문에 true값 리턴
		System.out.println("isExist = " + is_exist);
		
		File f2 = new File("a/b/c/target");	
		System.out.println("isFile : " + f2.isFile());
		System.out.println("isDirectory : " + f2.isDirectory());
		System.out.println("isHidden : " + f2.isHidden());
		System.out.println("절대경로 : " + f2.getAbsolutePath());
		System.out.println("isExist : " + f2.exists());
		
		
		//경로에 따른 디렉토리 생성
		f2.mkdirs();
		System.out.println("--------------------------------");
		
		// 마지막 "/" 이후 단어를 리턴
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		
		// 처음부터 마지막 "/" 직전까지 리턴		
		System.out.println(f1.getParent());		//현재 폴더를 기반으로 return해주므로 상대경로를 리턴해준다.
		System.out.println(f2.getParent());
		
		System.out.println("--------------------------------");
		
		//삭제 시도 -> 성공시 true, 실패시 false
		boolean del_ok = f2.delete();
				
		System.out.println("삭제성공여부 :" + del_ok);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
