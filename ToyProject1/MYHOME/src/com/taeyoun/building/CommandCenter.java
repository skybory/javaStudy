package com.taeyoun.building;
import java.util.List;
import java.util.Scanner;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.unit.Scv;
import com.taeyoun.unit.Unit;

public class CommandCenter extends Building implements Locatable{

	private Player player;
	private static int commandCenterCount = 0;
	private int x;
	private int y;
	public CommandCenter(Player player, int x, int y) {
		super(player,
				Data.COMMANDCENTER_NAME,
				Data.COMMANDCENTER_M,
				Data.COMMANDCENTER_G,
				Data.COMMANDCENTER_HP,
				x,
				y
				);
		this.player = player;
		this.x = x;
		this.y = y;
		player.setPopulation(player.getPopulation() + 10);
		player.getBuildingList().add(this);
		incrementCountCommandCenter();
	}

	public void produceScv() {
			
		if (commandCenterCount > 0) {
			if (getProduceHelper().validCheck(player, Data.SCV_M, Data.SCV_G, Data.SCV_P)) {
	            Unit Scv = new Scv(player,x,y);
	          //  Scv.setX()
	            player.addUnit(Scv); 
	     }
			
		}
		else
			System.out.println("커멘드 센터를 지으세요");
	}
	
	public static void	controlCommandCenter(Player human, Scanner scanner) {	//커맨드 센터 컨트롤
		String input;				
		int number;
	 		          	List <CommandCenter> commandCenterList = human.getListOfType(CommandCenter.class);
		       		System.out.println(commandCenterList);
		        		System.out.println(" 사용할 건물 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			       	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			       	System.out.println(" 메뉴를 선택하세요. s : SCV 생산, q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        		case "s" :
			        			commandCenterList.get(number).produceScv();
			        			break;
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 72");
			        			break;
			        	}
	}
	
	
	
	 private static void incrementCountCommandCenter() {
	        commandCenterCount++;
	    }
	 
	 public static int getCommandCenterCount() {
	        return commandCenterCount;
	    }

	public void increaseMinerals() {
		player.setMinerals(player.getMinerals()+8);
	}
	 
	public void increaseGas() {
		player.setGas(player.getGas()+8);
	}
	 
}
