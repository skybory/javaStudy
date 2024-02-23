package Starcraft.taeyoun.building;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import Starcraft.taeyoun.data.Data;
import Starcraft.taeyoun.resource.Player;
import Starcraft.taeyoun.unit.Marine;
import Starcraft.taeyoun.unit.Medic;
import Starcraft.taeyoun.unit.Unit;
public class Barracks extends Building {
	
	private final Player player;
	private int x;
	private int y;
	
	private static int barracksCount = 0;
	
	public Barracks(Player player, int x,int y) {
		super(player,
				Data.BARRACKS_NAME,
				Data.BARRACKS_M,
				Data.BARRACKS_G,
				Data.BARRACKS_HP,
				x,
				y,
				State.staying
				);
		this.player = player;
		this.x = x;
		this.y = y;
		incrementCountBarracks();
		player.getBuildingList().add(this);
	}
	

	public void produceMarine() {
		if ( barracksCount > 0 ) {
			if (getProduceHelper().validCheck(player, Data.MARINE_M, Data.MARINE_G, Data.MARINE_P)) {
			System.out.println("Marine 생산 중...");
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						Unit marine = new Marine(player,x,y);	
						player.addUnit(marine);
					timer.cancel();
					}
				}, Data.MARINE_TIME * 100);
			}
		}
	}

	public void produceMedic() {
		if ( barracksCount > 0 ) {
			 if (getProduceHelper().validCheck(player, Data.MEDIC_M, Data.MEDIC_G, Data.MEDIC_P)) {
				System.out.println("Medic 생산 중...");
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						Unit medic = new Medic(player,x,y);	
						player.addUnit(medic);
						timer.cancel();
					}
				}, Data.MEDIC_TIME * 1000);
			}
		}
	}
	
	   public static void	controlBarracks(Player human, Scanner scanner) {
		String input;				
		int number;
	 		          	List <Barracks> barracksList = human.getListOfType(Barracks.class);
		        		System.out.println(barracksList);
		        		System.out.println(" 사용할 건물 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			        	System.out.println(" 메뉴를 선택하세요. m : 마린 생산, c : 메딕생산, q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        		case "s" :
			        			barracksList.get(number).produceMarine();
			        			break;
			        			
			        		case "c" :
			        			barracksList.get(number).produceMedic();
			        			
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 100");
			        			break;
			        	}
	}
	
	 private static void incrementCountBarracks() {
	        barracksCount++;
	    }
	 
	 public static int getBarracksCount() {
	        return barracksCount;
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