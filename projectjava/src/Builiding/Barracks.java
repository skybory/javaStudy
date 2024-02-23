package Builiding;
import System.Player;
import TerranFinalData.TerranUnitPrice;
import Unit.Marine;
import System.Judge;

//테란건물 배럭.
//역할
//1. 마린 생산
//2. 메딕 생산
//3. 팩토리를 지을 수 있게 만들어줌
public class Barracks {
	//마린 생성 메서드 호출
	//마린이 생성될 수 있는 상황인지 확인(미네랄 50, 가스 0, 인구수 1이 있는지 확인)
	//만약 위의 상황이 true 라면, 마린 객체를 하나 생성.
	Marine marine1 = new Marine();				//마린 객체 생성
	Barracks barrack1 = new Barracks();			//배럭 객체 생성
	Judge j = new Judge();						//Judge 객체 생성(만들기 싫은데 방법없나?)
	
	public void produceMarine() {		
		
		switch(j.judge_Marine()) {
			case 'p' :
				j.notEnoughPopulation();
				break;
			
			case 'm' :
				j.notEnoughMineral();
				break;
				
			case 'g' :
				j.notEnoughGas();
				break;
				
			case 'c' :
				Marine marine = new Marine();
				break;
				
				default : System.out.println("judge 에러");
		}
		//마린 생성 메서드
	
	}

	
			
}


//1. 가능하면 : 마린 객체 생성
//2. 불가능하면 : 미네랄 부족 메세지 메서드
/*	if (Player.getMyMineral() >= TerranUnitPrice.MARINE_M && Player.getMyPopulation() >= TerranUnitPrice.MARINE_P ) {	//마린 생성을 할 수 있는지 체크
	Player.setMyMineral(Player.getMyMineral() - TerranUnitPrice.MARINE_M );											//현재 미네랄을 (가지고 있는 돈 - 마린가격으로 설정) = 50미네랄 지출! 	
	Player.setMyPopulation(Player.getMyPopulation()- TerranUnitPrice.MARINE_P);										//인구수를 (현재인구수 - 마린 인구) = 1인구 감소		
	Marine marine = new Marine();
}
else if (Player.getMyPopulation()<= 1) {
	System.out.println(/*인구수 부족*);
}
*/

