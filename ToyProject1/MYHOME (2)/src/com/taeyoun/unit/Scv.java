package com.taeyoun.unit;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.ProduceHelper;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.unit.Unit.State;
import com.taeyoun.building.Building;
import com.taeyoun.building.CommandCenter;
import com.taeyoun.building.SupplyDepot;
import com.taeyoun.building.Barracks;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Scv extends Unit implements Attack, Locatable{

	private ProduceHelper produceHelper = ProduceHelper.getInstance();
	private final Player player;
    private ScheduledExecutorService executorService;
	private int x;
	private int y;
	public Scv(Player player, int x, int y) {
		super(
				player,
				Data.SCV_NAME,
				Data.SCV_HPMAX,
				Data.SCV_HPMAX,
				Data.SCV_ATK,
				Data.SCV_DEF,
				Data.SCV_ATKRANGE,
				x,
				y,
				Unit.State.staying,
				Data.SCV_STATEMENT1,
				Data.SCV_STATEMENT2,
				Data.SCV_STATEMENT1,
				Data.SCV_STATEMENT2
				
				);
		this.x = x;
		this.y = y;
		System.out.println(getStatement1());
		System.out.println(Data.SCV_STATEMENT1);
		System.out.println("내 x좌표는 :" + getX());
		System.out.println("내 y좌표는 :" + getY());
		this.player = player;
		this.executorService = Executors.newSingleThreadScheduledExecutor();
	}


	// 미네랄 채굴
	public void gatherMineral() {
		if (getState() == State.staying) {
			executorService = Executors.newScheduledThreadPool(1);
			
			setState(State.gathering);
			System.out.println("미네랄을 캐러갑니다!!!");
			executorService.scheduleAtFixedRate(() -> 
				{
					player.setMinerals(player.getMinerals() + 8);
					System.out.println(player.getMinerals());
				}
				, 0, 5, TimeUnit.SECONDS);
		} else
			System.out.println("바빠서 명령을 수행할 수 없습니다.");
	}
	
	@Override
	public void stop() {	
		this.executorService.shutdown();
		setState(State.staying);
		System.out.println("반복3번");
    	System.out.println("유닛을 멈춥니다.");

    	delay();
	}
	
	@Override
	public void move(int x, int y) {
		stop();
		executorService = Executors.newScheduledThreadPool(1);
		delay();
		setState(State.moving);
		System.out.println("이동 명령을 시작합니다!!!");
		
		executorService.scheduleAtFixedRate(() -> {
	
			System.out.println("이 유닛의 x좌표는 : " + getX()); // 내 x좌표
			System.out.println("이 유닛의 y좌표는 : " + getY()); // 내 y좌표
			
			int distanceX = Math.abs(x - getX()); // x축 거리
			int distanceY = Math.abs(y - getY()); // y축 거리
			
			System.out.println("x거리는" + distanceX + "입니다");
			System.out.println("y거리는" + distanceY + "입니다");
			
			if (distanceX == 0 && distanceY == 0) {
				System.out.println("이동이 종료됩니다.");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
				System.out.println("반복1번");
				stop();
				System.out.println("반복1번");

			} else if (Math.abs(distanceX) >= Math.abs(distanceY)) {
				setX(getX() + Integer.compare(x, getX())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
				System.out.println(getName() + "이 x축 이동했습니다");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			}

			else {
				setY(getY() + Integer.compare(y, getY())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
				System.out.println(getName() + "이 x축 이동했습니다");
				System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
			}
			
	        if (getX() == x && getY() == y) {
	            // 목표 지점에 도달했을 때 작업 종료
	            System.out.println("이동이 종료됩니다.");
	            System.out.println("현재 위치는 : (" + getX() + ", " + getY() + ")");
	        	System.out.println("반복2번");
	            stop();
	        	System.out.println("반복2번");
	        }
		}, 1, 1, TimeUnit.SECONDS);

}
	

	public void gatherGas() {
		executorService = Executors.newScheduledThreadPool(1);
		
		if (getState() == State.staying) {
			setState(State.gathering);
			System.out.println("가스를 캐러갑니다!!!");
			executorService.scheduleAtFixedRate(() -> 
			{
				player.setGas(player.getGas() + 8);
				System.out.println(player.getGas());
			}
			, 0, 5, TimeUnit.SECONDS);
		} else
			System.out.println("바빠서 명령을 수행할 수 없습니다.");
	}

	public void produceCommandCenter(int x, int y) {
		if (getState() != State.building) {
			this.stop();
		}
		if (produceHelper.validCheck(player, Data.COMMANDCENTER_M, Data.COMMANDCENTER_G, 0)) {
			Building CommandCenter = new CommandCenter(player, x, y);
			player.addBuilding(CommandCenter);
		}
	}

	public void produceBarracks(int x, int y) {
   		if (produceHelper.validCheck(player, Data.COMMANDCENTER_M, Data.COMMANDCENTER_G, 0)) {
            Building Barracks = new Barracks(player, x, y);
            player.addBuilding(Barracks);
        }
	}
	
	public void produceSupplyDepot() {
		if (produceHelper.validCheck(player, Data.SUPPLYDEPOT_M, Data.SUPPLYDEPOT_G, 0)) {
			Building SupplyDepot = new SupplyDepot(player,x,y);
			player.addBuilding(SupplyDepot);
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