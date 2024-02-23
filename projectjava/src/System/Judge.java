package System;
import TerranFinalData.TerranUnitPrice;
public class Judge {
//마린을 만들 수 있는지 없는지를 판단하는 메서드가 있으면 좋지 않을까? 그렇다면 그 메서드 안에 마린 말고 다른 유닛들도 집어넣을 수 있으니깐..
	//나올 수 있는 리턴값은
	//1. 미네랄이 부족한 경우
	//2. 가스가 부족한 경우
	//3. 인구수가 부족한 경우
	//이렇게 3가지인데, 중요도는 인구수,미네랄,가스로 하자.
	//그러면.. 1.인구수가 부족한 경우 2.미네랄이 부족한 경우 3. 가스가 부족한 경우 로 코딩하면 되겠다.
	//이를 switch 구문을 사용해서, p,m,g 로 리턴하고, 이에 따라 나오는 warning 문구를 바꾸면 되지 않을까?

	public static char judge_Marine(){
		if (Player.getMyPopulation() < TerranUnitPrice.MARINE_P  ) {	//보유 인구수 < 마린 인구수
			return 'p';													//'p' 반환
		}
		else if 
		(Player.getMyMineral() < TerranUnitPrice.MARINE_M  ) {		//보유 미네랄 < 마린 미네랄
			return 'm';												//'m' 반환
		}
		else if
		(Player.getMyGas() < TerranUnitPrice.MARINE_G  ) {		//보유 가스 < 마린 가스
			return 'g';											//'g' 반환
		}
		else return 'c';										//'c' 반환 --> 생성!!!

	}

	public static void notEnoughPopulation() {
		System.out.println("인구수가 초과되었습니다. 서플라이 디팟을 더 지으세요.");
	}
	public static void notEnoughGas() {
		System.out.println("가스가 부족합니다.");
	}
	public static void notEnoughMineral() {
		System.out.println("미네랄이 부족합니다.");
	}



}

	
//파라미터 생산자에 마린을 넣으면 어떻게 될까
// 생산자에 넣은 값을 그대로 입력받아서 스트링 타입으로 변환하여
/* 아래의 식에 입력해넣으면..좋겠땅


*/