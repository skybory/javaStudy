package com.taeyoun.unit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.taeyoun.resource.Player;
import com.taeyoun.resource.map.Cell;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.resource.map.Map;
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
    staying, fighting, building, gathering, moving, Dead
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
		setPlayer(player);
		Map.getCell(this.x,this.y).setUnit(this);
	}
	public void stop() {	
		this.executorService.shutdown();
		this.setState(State.staying);
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
	
	@Override
	public void move(int x, int y) {
		this.stop();
		this.executorService = Executors.newScheduledThreadPool(1);
		this.delay();
		this.setState(State.moving);
		System.out.println("이동 명령을 시작합니다!!!");
		
		this.executorService.scheduleAtFixedRate(() -> {
	
			System.out.println("이 유닛의 x좌표는 : " + getX()); // 내 x좌표
			System.out.println("이 유닛의 y좌표는 : " + getY()); // 내 y좌표
			
			int distanceX = Math.abs(x - getX()); // x축 거리
			int distanceY = Math.abs(y - getY()); // y축 거리
			
			System.out.println("x거리는" + distanceX + "입니다");
			System.out.println("y거리는" + distanceY + "입니다");
			
			if (distanceX == 0 && distanceY == 0) {
				System.out.println("이동이 종료됩니다.");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
				this.stop();

			} else if (Math.abs(distanceX) >= Math.abs(distanceY)) {
				this.setX(getX() + Integer.compare(x, this.getX())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
				Map.getCell(getX(),getY()).setUnit(null);
				Map.getCell(getX() + Integer.compare(x, getX()),getY()).setUnit(this);
				System.out.println(getName() + "이 x축 이동했습니다");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			}

			else {
				setY(getY() + Integer.compare(y, getY())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
				Map.getCell(getX(),getY()).setUnit(null);
				Map.getCell(getX(),getY() + Integer.compare(y, getY())).setUnit(this);
				System.out.println(getName() + "이 y축 이동했습니다");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			}
			
	        if (getX() == x && getY() == y) {
	            // 목표 지점에 도달했을 때 작업 종료
	            System.out.println("이동이 종료됩니다.");
	            System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
	            this.stop();
	        }
		}, 1, 1, TimeUnit.SECONDS);
}

	@Override
	public void attack() {
		stop();
			Unit target = search();
			if (target != null) {
				System.out.println("공격 명령을 시작합니다!!!");
				setState(State.fighting);
				executorService = Executors.newScheduledThreadPool(1);
				executorService.scheduleAtFixedRate(() -> {
					if (target.getCurrentHp()>0) {
					target.setCurrentHp(target.getCurrentHp() - (this.getAtk() - target.getDef()));
					System.out.println(this.getPlayer().getPlayerName() + "의 유닛 " + this.getName() + "이 "
							+ target.getPlayer().getPlayerName() + " 의 유닛" + target.getName() + "을 공격합니다.");
					System.out.println("피격 유닛 체력 : " + target.getCurrentHp());
					}
					else {
					target.delete();
						stop();
					}
				}, 1, 1, TimeUnit.SECONDS);
			}
		 else
			 System.out.println("타겟이 없습니다.");
}	
	public Unit search() {
		System.out.println("타겟 서칭~");
		Unit target = null;
		Unit maybeTarget = null;
    	//범위검사
    	for(int i = getX()-this.range; i <= getX() + this.range; i++) {
    		for(int j = getY()-this.range; j <= getY() + this.range; j++) {
    			if (Map.getCell(i,j)!=null) {
	    			maybeTarget = Map.getCell(i, j).getUnit();
	    			if (maybeTarget != null && maybeTarget.getPlayer() != this.getPlayer())
	    			{
	    				target = maybeTarget;
	    				break;
	    			}
    			}
    		}
    		if(target != null)
    			{break;}
    	}
		return target;
	}

	
	public void delete() {
	    System.out.println("유닛이 사망했습니다. 유닛삭제.");
		
		Map.getCell(this.x, this.y).setUnit(null);
	    getPlayer().getUnitList().remove(this);
	    setState(state.Dead);
	}
	
	
	public String toString() {
		 return "Unit<" + (player.getUnitList().indexOf(this) + 1) + "> : " + name + "\t  " + "체력 : " + this.currentHp + "/" + this.maxHp  + "\t 공격력 : " + this.atk + " 방어력 : " + this.def + "\t상태 : " + this.getState() + "\t위치 : (" + this.getX() + "," + this.getY() + ")" ;
	}

	public /*synchronized*/ State getState() {
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
