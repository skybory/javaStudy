package trashBin;

import java.util.Timer;
import java.util.TimerTask;

import com.taeyoun.building.CommandCenter;
import com.taeyoun.building.Refinery;
import com.taeyoun.unit.Unit;
import com.taeyoun.unit.Unit.State;

public class trash {
	//쓰레기통
/*//			  System.out.println("유닛을 조작합니다");
//			  System.out.println(human.getUnitList());
//			  System.out.println("조작할 유닛 종류를 고르세요 ( s : SCV, m : Marine, c : Medic, q : 종료");
//			  input = scanner.next();
//		      //조작할 유닛 종류 고르시오!!!
//		      switch (input.toLowerCase()) {			//대소문자 상관없이 입력받으면 소문자로 변경
//		            case "s":
//		        																// 1. 커맨드 센터의 리스트를 출력한다.
//		          		List <Scv> scvList = human.getListOfType(Scv.class);
//		        		System.out.println(scvList);
//		        		System.out.println(" 사용할 유닛 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
//			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
//			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
//			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
//			        	System.out.println(" 메뉴를 선택하세요. m : 미네랄 채굴, g : 가스 채굴, q : 종료");	//5. 메뉴 선택창을 출력한다.
//			        	input = scanner.next();									// 6. 메뉴를 입력받는다.
//			        	
//			        	switch(input.toLowerCase()) {							// 7. 기능을 선택한다.
//		        				case "m" :
//		        					scvList.get(number).gatherMineral();	// (number)번 커맨드에서 SCV 생산 (작동안함)
//		        					human.playerSource();
//			        			break;
//			        			
//		        				case "g" :
//				        			scvList.get(number).gatherGas();	// (number)번 커맨드에서 SCV 생산 (작동안함)
//				        			human.playerSource();
//		        					break;
//		        					
//			        			case "q" :
//			        			System.out.println( " 되돌아갑니다. " );
//			        			break;											// 7번의 switch문 종료
//			        			
//			        			default :
//			        				System.out.println("에러코드 129");
//			        				break;
//			        	}
//			        	break;
//		      }
//		      break;
//			        	
 * 
 * //			  System.out.println("건물을 조작합니다");
//			  System.out.println(human.getBuildingList());	
//			  System.out.println("조작할 건물을 고르세요 (c : Command Center, b : Barracks, q : 종료):");
//		      input = scanner.next();
//		      //조작할 건물 종류 고르시오!!!
//		      switch (input.toLowerCase()) {			//대소문자 상관없이 입력받으면 소문자로 변경
//		            case "c":
//		        		//controlCommandCenter(human,scanner)										// 1. 커맨드 센터의 리스트를 출력한다.
//		          		List <CommandCenter> commandCenterList = human.getListOfType(CommandCenter.class);
//		        		System.out.println(commandCenterList);
//		        		System.out.println(" 사용할 건물 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
//			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
//			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
//			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
//			        	System.out.println(" 메뉴를 선택하세요. s : SCV 생산, q : 종료");	//5. 메뉴 선택창을 출력한다.
//			        	input = scanner.next();									// 6. 메뉴를 입력받는다.
//			        	
//			        	switch(input.toLowerCase()) {							// 7. 기능을 선택한다.
//		        				case "s" :
//		        					
//		        					commandCenterList.get(number).produceScv();		// (number)번 커맨드에서 SCV 생산 (작동안함)
//			        		//	System.out.println("SCV 생산을 완료?");
//		        					human.playerSource();
//
//		        					System.out.println("현재 미네랄은 :" + human.getMinerals());
//		        					human.playerSource();
//		        					break;
//			        			
//		        				case "b" :
//		        					break;
//		        					
//			        			case "q" :
//			        			System.out.println( " 되돌아갑니다. " );
//			        			break;											// 7번의 switch문 종료
//			        			
//			        			default :
//			        				System.out.println("에러코드 58");
//			        				break;
//			        	}
//			        	break;
//		      }
//		      break;
//			        	
//		
 * 
 */
	
	/*
	 * 	public void gatherMineral() {
		// 커맨드 센터가 존재해야함.
		if (CommandCenter.getCommandCenterCount() <= 0) {
			System.out.println("커맨드 센터가 없습니다.");
		}
		if (CommandCenter.getCommandCenterCount() >= 1) {
			CommandCenter mineralCenter = (CommandCenter) player.getBuildingList().get(0);		//명시적 형변환
			System.out.println("미네랄을 채굴합니다");
			
			Timer timer = new Timer();		//타이머 생성
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					mineralCenter.increaseMinerals();
				}
			} , 5000 , 5000);
				//만약 SCV가 사망한다면, timer cancle;
		
		}
		else System.out.println(" 미네랄 채굴 오류입니다 ");
	}
			public void gatherGas() {
		// 커맨드 센터가 존재해야함.
		if (CommandCenter.getCommandCenterCount() <= 0) {
			System.out.println("커맨드 센터가 없습니다.");
		}
		else if (Refinery.getRefineryCount() <= 0) {
			System.out.println("정제소를 설치하세요");
		}
		else if (CommandCenter.getCommandCenterCount() >= 1) {
			CommandCenter gasCenter = (CommandCenter) player.getBuildingList().get(0);		//명시적 형변환
			System.out.println("가스를 채굴합니다");
			
			Timer timer = new Timer();		//타이머 생성
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					gasCenter.increaseGas();
				}
			} , 5000 , 5000);
				//만약 SCV가 사망한다면, timer cancle
		
		}
		else System.out.println(" 미네랄 채굴 오류입니다 ");
	}
	
	 * 
	 * 
	 * 			
		/*
		 *     if (player.getBuildingList().get(0) instanceof CommandCenter) {
            CommandCenter commandCenter = (CommandCenter) player.getBuildingList().get(0);
            commandCenter.increaseMinerals(Data.SCV_M);

            // 5초에 1번씩 8미네랄 캐기
            mineralGatheringTimer.schedule(new TimerTask() {
                @Override
                public void run() {
                    commandCenter.increaseMinerals(Data.SCV_M);
                }
            }, 5000, 5000);  // 5초 후에 시작하고, 그 이후 5초마다 반복
        } else {
            System.out.println("자원을 캘 수 있는 건물이 없습니다.");
        }
    }
    
    		// 게임 시작 로직 실행
		//	ProduceHelper produceHelper = ProduceHelper.getInstance();	//싱글톤 객체 생성
		//게임 시작 버튼
/*		//플레이어 생성
		Player human = new Player("김태연");
		Player computer = new Player("computer");

		CommandCenter commandCenter = new CommandCenter(human);
		commandCenter.produceScv();
		commandCenter.produceScv();
		commandCenter.produceScv();
		commandCenter.produceScv();

		CommandCenter commandCenter2 = new CommandCenter(computer);
		commandCenter2.produceScv();
		commandCenter2.produceScv();
		commandCenter2.produceScv();
		commandCenter2.produceScv();
		
			/*	System.out.println("----------------------- 게임 시작합니다 -------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(human.getBuildingList());
		System.out.println(human.getUnitList());
		*/
		
	
	//여기서부터 MainMenu
//	Scanner scanner = new Scanner(System.in); 이것도 메인메뉴 실행칸으로 옮김
/*	System.out.println("유닛 창을 보여줍니다");
	System.out.println(game.getHuman().getListOfType(Unit.class));

	String input;

	while (true) {
		System.out.println("------------------------------------- 패널 화면 -------------------------------------");
		System.out.println("패널 화면입니다. 기능을 선택하세요 ( b : 건물 선택하기, u : 유닛 선택하기, q : 종료");
		// human.scheduleShowResources();

		input = scanner.next();
	
	try {
		switch (input.toLowerCase()) {
		case "b":
			BuildingController.controlBuilding(game.getHuman(), scanner);
			//자바 예외처리
			break;
		case "u":
			UnitController.controlUnit(game.getHuman(), scanner);
			break;
		case "q":
			System.out.println("패널 화면을 종료합니다");
			scanner.close();
			return;

		default:
			System.out.println("잘못된 입력입니다");
			break;

		} // switch 문 종료
	} catch (Exception e) {
		  System.out.println("오류가 발생했습니다: " + e.getMessage());
     //   e.printStackTrace();  // 실제 프로덕션 코드에서는 로그로 기록하는 것이 좋습니다.

	}
}


*/
	
	
	/*	public synchronized void ShowResources() {
	System.out.println("현재 자원을 표시합니다");
	System.out.printf(this.playerName + "의 미네랄 : " + this.minerals);
	System.out.printf("\t");
	System.out.printf(this.playerName + "의 가스 : " + this.gas);
	System.out.printf("\t");
	System.out.println(this.playerName + "의 인구수 : " + this.population);
	return;
}

public synchronized void scheduleShowResources() {
Runnable showResources = this::ShowResources;
scheduler.scheduleAtFixedRate(showResources, 0, 10, TimeUnit.SECONDS);
}

*/
	
	
	/*
	 * 	public void stop() {		//파라미터 변수를 받을지 고민중
		stopFighting();
		stopMoving();
		setState(State.staying);
	}
	
	private void delay() {
	    try {
	        Thread.sleep(1000); // 1초 딜레이
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        stop();
	    }
	}
	
	public void stopMoving() {
		Thread.currentThread().interrupt(); // InterruptedException 발생
		setState(State.staying);
	}
	
	public void stopFighting() {
		Thread.currentThread().interrupt(); // InterruptedException 발생
	    setState(State.staying);
	}
	@Override
	public void move(int x, int y) {		//x : 목표 x 좌표, y : 목표 y 좌표
		setState(State.moving);			// 이동중 상태로 변경
    	int distanceX = Math.abs(x - getX());
    	int distanceY = Math.abs(y - getY());

		if (distanceX >= distanceY) {
			//x축 이동
			for ( int i = 0; i < distanceX; i++) {
			delay();
			setX(getX()+1);
			System.out.println("x축 이동중입니다");
			}
			System.out.println("x축 이동 끝");
		}
		else if ( distanceX < distanceY) {
			//y축 이동
			for (int i = 0; i< distanceY; i++) {
				delay();
			setY(getY()+1);
			System.out.println("y축 이동중입니다");
			}
			System.out.println("y축 이동 끝");
		}
		
		setState(state.staying);	// 대기 상태로 변경
	}


	@Override
	public void attack(Unit unit1, Unit unit2) {
		// uni2 의 현재 체력이 0 이상일 때
		// 유닛2의 위치가 유닛1의 사거리 안에 있을 때
		// 유닛 1의 체력 현재체력 - (유닛1공격력 - 유닛2의방어력) 으로 설정.

		while (unit2.currentHp > 0) {
			if (unit1.range > (Math.abs(unit1.x - unit2.x) + Math.abs(unit1.y - unit2.y))) {
				unit1.setCurrentHp(unit1.getCurrentHp() - (unit1.getAtk() - unit2.getDef()));
				System.out.println(unit1.getName() + "이 " + unit2.getName() + "을 공격합니다.");
				setState(State.fighting);
				delay();
			}
		}
	}
	 * 
	 */
	

}
