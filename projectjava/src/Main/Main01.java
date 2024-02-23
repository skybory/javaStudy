package Main;

import Builiding.Barracks;
import System.Player;

public class Main01 {

	public static void main(String[] args) {

		Player player = new Player("김태연", 50, 0, 9);	//사용자명, 미네랄, 가스, 인구수 로 시작. Player 객체생성.
		
		//미네랄 접근
		
		System.out.println("현재 보유중인 미네랄은 : " + Player.getMyMineral());
		System.out.println("현재 보유중인 가스는 : " + Player.getMyGas());
		System.out.println("현재 사용가능한 인구수는 : " + Player.getMyPopulation());
	}

	Barracks barrack = new Barracks();
}
