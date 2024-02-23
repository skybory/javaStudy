package Starcraft.taeyoun.building;
import java.util.List;
import java.util.Scanner;

import Starcraft.taeyoun.building.Building.State;
import Starcraft.taeyoun.data.Data;
import Starcraft.taeyoun.resource.Player;

public class SupplyDepot extends Building {

	private int x;
	private int y;
	public SupplyDepot(Player player, int x, int y) {
		super(player,
				Data.SUPPLYDEPOT_NAME,
				Data.SUPPLYDEPOT_M,
				Data.SUPPLYDEPOT_G,
				Data.SUPPLYDEPOT_HP,
				x,
				y,
				State.staying
				);
		player.setPopulation(player.getPopulation() + 8);
		player.getBuildingList().add(this);
	}
	
	   public static void	controlSupplyDepot(Player human, Scanner scanner) {
		String input;				
		int number;
	 		          	List <SupplyDepot> supplyDepotList = human.getListOfType(SupplyDepot.class);
		        		System.out.println(supplyDepotList);
		        		System.out.println(" 사용할 건물 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			        	System.out.println(" 메뉴가 없습니다. q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        	
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 149");
			        			break;
			        	}
	}
	
	@Override
	public int getX() {
		return x;
	}


	@Override
	public int getY() {
		return y;
	}


	@Override
	public void setX(int x) {
		this.x = x;
	}


	@Override
	public void setY(int y) {
		this.y = y;
	}
}
