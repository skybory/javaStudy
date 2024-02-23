package Builiding;

import System.Player;
import TerranFinalData.TerranUnitPrice;

public class notepad {

	/*
	public void produceMedic() {
		
	}

	//marine.create 를 했을 때 아래의 메서드 구현
		public boolean create(){
			//내가 가진 미네랄이 50 이상일때, 인구수(여유)가 1 이상일때 true
		//	if (myMineral >= 50 && myPopulation >= 1) 
			{
			return true;
			}
		//	else return false;
		}
		//위의 상황이 끝나자마자 미네랄 -= 50; 인구수 -=1


	*/
	
	public static char judge(String 스트링변수){
		if (Player.getMyPopulation() < 2/*"TerranUnitPrice" + "스트링변수" + "_P"*/  ) {	//보유 인구수 < 마린 인구수
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
	

