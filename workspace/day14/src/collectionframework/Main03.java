package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {

		List<People> plist
			= new ArrayList<People>();
		
	//	plist.add(new People("회원1", "01011111111"));
	//	plist.add(new People("회원2", "01022222222"));
	//	plist.add(new People("회원3", "01033333333"));
	//	plist.add(new People("회원4", "01044444444"));
		
		//10명의 데이터를 임의로 추가
		for(int i = 0; i<10;i++) {
			People p = new People("회원"+i, "01234567"+i);
			plist.add(p);
		}

		
		// 출력하기

		for(int i = 0; i<plist.size();i++) {
			//List에 저장된 데이터를 하나 꺼내면
			//People 클래스 형의 객체다
			People item = plist.get(i);
			System.out.println(item.toString());
			}
	
		
	
	}

}
