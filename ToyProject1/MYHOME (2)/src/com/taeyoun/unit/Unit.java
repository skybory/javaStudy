package com.taeyoun.unit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.taeyoun.resource.Player;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.unit.Unit.State;

public class Unit implements Locatable, Attack, Move{
	private Player player;
	private String name;
    private int maxHp;
    private int currentHp;
    private int atk;
    private int def;
    private int range;
    private String statement1;
    private String statement2;
    private String statement3;
    private String statement4;
    private int x;
    private int y;
    private State state;
    private ScheduledExecutorService executorService;
    public enum State {
    staying, fighting, building, gathering, moving
    }
    


	public Unit(Player player, String name, int maxHp, int currentHp, int atk, int def, int range, int x, int y, State state,  String statement1,
			String statement2, String statement3, String statement4) {
		super();
		this.player = player;
		this.name = name;
		this.maxHp = maxHp;
		this.currentHp = currentHp;
		this.atk = atk;
		this.def = def;
		this.range = range;
		this.x = x;
		this.y = y;
		this.state = state;
		this.statement1 = statement1;
		this.statement2 = statement2;
		this.statement3 = statement3;
		this.statement4 = statement4;
		this.executorService = Executors.newSingleThreadScheduledExecutor();
	}
	
	public void stop() {	
		//파라미터 변수를 받을지 고민중
		this.executorService.shutdownNow();
		System.out.println("2번stop");
		setState(State.staying);
    	System.out.println("유닛을 멈춥니다.");
    	delay();
	}
	
	public void delay() {
	    try {
	        Thread.sleep(20); // 0.02초 딜레이
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        stop();
	    }
	}
	
	public void longDelay() {
	    try {
	        Thread.sleep(1000); // 0.02초 딜레이
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        stop();
	    }
	}

//	public void move() {
//		setState(State.moving);
//    	System.out.println("이동을 시작합니다");
//    	executorService.scheduleAtFixedRate(() -> {
//    		setX(getX()+1);
//    	} , 0 , 5 , TimeUnit.SECONDS);
//    	
//	}
	
	@Override
	public void move(int x, int y) {
	    setState(State.moving);

	    while (getState() == State.moving) {
	        // 이동 중인 도중에 중단 명령을 받으면 중단
	        if (getState() != State.moving) {
	            System.out.println("이동이 중단되었습니다.");
	            System.out.println("gvajiewgjaiwegjioawgjiaowjgioajgoijo");
	            return;
	        }

	        // 경로 찾기 및 이동 로직 유지...
	        
			int distanceX = Math.abs(x - getX());			//x축 거리 확인
			int distanceY = Math.abs(y - getY());			//y축 거리 확인
			System.out.println("이 유닛의 x좌표는 : " + getX());
			System.out.println("이 유닛의 y좌표는 : " + getY());
			
			System.out.println("x거리는" + distanceX + "입니다");
			System.out.println("y거리는" + distanceY + "입니다");
			System.out.println("while문 작동중");
			if (distanceX == 0 && distanceY == 0) {
			    System.out.println("이동이 끝났습니다.");
			    System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			    stop();
			} else if (Math.abs(distanceX) >= Math.abs(distanceY)) {
			    // x 거리의 절댓값이 y 거리의 절댓값보다 크거나 같으면 x 방향으로 이동
			    delay();
			    setX(getX() + Integer.compare(x, getX())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
			    System.out.println(getName() + "이 x축 이동했습니다");
			    System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			} else {
			    // y 거리의 절댓값이 x 거리의 절댓값보다 크면 y 방향으로 이동
			    delay();
			    setY(getY() + Integer.compare(y, getY())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
			    System.out.println(getName() + "이 y축 이동했습니다");
			    System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			}
	    }
			

	
	}
	// Unit 클래스에 중단 메서드 추가
	public void stopMoving() {
	    if (getState() == State.moving) {
	        setState(State.staying);
	        System.out.println("이동이 중단되었습니다.");
	    }
	}
	
	

	@Override
	public void attack(Unit unit2) {
		this.setState(state.fighting);
		int x = unit2.getX() - this.getX();
		int y = unit2.getY() - this.getY();
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		// 거리측정
		// 거리가 멀면 공격하지 않는다.
		boolean inRange = this.range >= distance;
		boolean myTeam = this.player == unit2.player;
		boolean unitNull = unit2 == null;
			if (!inRange) {
				System.out.println("사거리 밖입니다. 이동합니다.");
				move(unit2.getX(), unit2.getY());
				this.setState(state.fighting);
			}
			// 거리가 멀지 않으면 = 공격 사거리 내에 있으면
			else if (myTeam) {
				System.out.println("아군입니다. 공격을 금지합니다.");
				this.stop();
			} else if (unitNull || unit2.currentHp < 0) {
				System.out.println("상대방이 죽었습니다.");
				this.stop();
			} else {
				unit2.setCurrentHp(unit2.getCurrentHp() - (this.getAtk() - unit2.getDef()));
				System.out.println(this.getPlayer().getPlayerName() + "의 유닛 " + this.getName() + "이 "
						+ unit2.getPlayer().getPlayerName() + " 의 유닛" + unit2.getName() + "을 공격합니다.");
				delay();
			}
			this.stop();
		}
	
    	//거리가 가까우면 공격할지 말지 판단한다
/*
    	// 바꾸고 있는 조건식 1.유닛의 상태가 싸움중, 사거리 >= 유닛과의 거리
    	while ( unit1.getState() == State.fighting && unit1.range >= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)))
    		
		// 공격 조건 : 1. 내 상태가 '싸움중' 이어야 함.
		// 공격 조건 : 1-1. 상대방의 체력이 0 이상이어야 함 ( 삭제할수도 있음 )
		// 공격 조건 : 2. 상대방의 위치가 내 공격범위 안에 들어와야함
		// 공격 조건 : 3. 공격하는 동안 내 상태는 '공격중' 이어야 하고, 1초간 공격하고 대기모드로 돌아와서, 아까의 행위를 반복해야함.
		
		// uni2 의 현재 체력이 0 이상일 때
		// 유닛2의 위치가 유닛1의 사거리 안에 있을 때
		// 유닛 1의 체력 현재체력 - (유닛1공격력 - 유닛2의방어력) 으로 설정.
		while (unit1.getState() == State.fighting && unit2 != null && unit2.getCurrentHp()>0 && unit1.getPlayer() != unit2.getPlayer()) {	
			// 공격자의 상태가 '전투중' 이고, 피격자의 존재가 있을 때, 피격자의 체력이 0보다 크고, 플레이어1과 플레이어2가 서로 다를때
			// 공격 사거리 >= 상대방의 위치
			// 사거리 내에 있을 경우 -> 1초 기다린 후 공격한다
			if (unit1.range >= Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))) {
				delay();
				unit2.setCurrentHp(unit2.getCurrentHp() - (unit1.getAtk() - unit2.getDef()));
				System.out.println(unit1.getPlayer().getPlayerName() + "의 유닛 "  + unit1.getName() + "이 " + unit2.getPlayer().getPlayerName() + " 의 유닛" + unit2.getName() + "을 공격합니다.");
			} else // 사거리 내에 없을 경우
				move(unit2.getX(), unit2.getY()); // 상대방에게 가까이 다가간다
		}
		System.out.println("전투종료");
		setState(state.staying);			// while문이 끝나면 staying 상태로 바꿈.
	}
*/
	public void stopFighting(Unit unit) {
		setState(State.staying);
	}
	
	public String toString() {
		 return "Unit<" + (player.getUnitList().indexOf(this) + 1) + "> : " + name;
	}


	
	public synchronized State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}


	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getMaxHp() {
		return maxHp;
	}



	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}



	public int getCurrentHp() {
		return currentHp;
	}



	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}



	public int getAtk() {
		return atk;
	}



	public void setAtk(int atk) {
		this.atk = atk;
	}



	public int getDef() {
		return def;
	}



	public void setDef(int def) {
		this.def = def;
	}



	public int getRange() {
		return range;
	}



	public void setRange(int range) {
		this.range = range;
	}



	public String getStatement1() {
		return statement1;
	}



	public void setStatement1(String statement1) {
		this.statement1 = statement1;
	}



	public String getStatement2() {
		return statement2;
	}



	public void setStatement2(String statement2) {
		this.statement2 = statement2;
	}



	public String getStatement3() {
		return statement3;
	}



	public void setStatement3(String statement3) {
		this.statement3 = statement3;
	}



	public String getStatement4() {
		return statement4;
	}



	public void setStatement4(String statement4) {
		this.statement4 = statement4;
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
