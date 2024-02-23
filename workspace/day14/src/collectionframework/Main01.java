package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class Main01 {

	public static void main(String[] args) {

			// 데이터를 저장할 배열 생성
			// 제너릭스 -> <값의 이름, 값의 종류> 
	
		Map<String, Integer> hm
			= new HashMap<String, Integer>();
	
			// 데이터의 추가는 put 메서드 사용
			// -> 중복을 허용하지 않는다.
		hm.put("국어", 100);			// int값이 들어간것 같지만, Integer 객체가 들어간것임.
		hm.put("영어", 80);
		hm.put("수학", 50);
		
		// 저장된 개수 얻기
		System.out.println("HashMap Size : " + hm.size());
		
		hm.put("수학", null);			// 수학 점수를 null값으로 바꿀 수 있음. 객체이기 때문에 null이 들어감
		
		
		System.out.println("HashMap Size : " + hm.size());
		//개수가 바뀌지 않는다. 길이가 동일하기 때문. key 값이 겹치지않는게 포인트. 바뀐수학점수와 기존의 수학점수의 key값은 같다.
		
		hm.put("수학", 90);
		System.out.println("HashMap Size : " + hm.size());
		//똑같은 key값에 담겨있는 value값만 바뀌고 있다.
		
		hm.put("컴공", 98);
		System.out.println("HashMap Size : " + hm.size());
		//길이가 1만큼 늘어난다. 값이 하나 더 늘어났기 때문.
		
		// 데이터 꺼내기
		System.out.println(hm.get("국어"));
		System.out.println(hm.get("영어"));
		System.out.println(hm.get("수학"));
		System.out.println(hm.get("컴공"));
	}
	

}
