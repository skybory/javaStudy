package com.taeyoun.unit;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.ProduceHelper;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.resource.map.Map;
import com.taeyoun.unit.Unit.State;
import com.taeyoun.building.Building;
import com.taeyoun.building.CommandCenter;
import com.taeyoun.building.Refinery;
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
		Map.getCell(x,y).setUnit(this);
	}
	@Override
	public void stop() {	
		if(this.getState()!=State.building) {
		this.executorService.shutdown();
		setState(State.staying);
		System.out.println("2번stop");
    	System.out.println("유닛을 멈춥니다.");
    	delay();
		}
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
				stop();

			} else if (Math.abs(distanceX) >= Math.abs(distanceY)) {
				setX(getX() + Integer.compare(x, getX())); // 현재 위치에서 목표 지점 방향으로 1 칸 이동
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
	            stop();
	        }
		}, 1, 1, TimeUnit.SECONDS);
}
	
	//이건 gatherMineral 이 SCV에만 있는 특수 기능이라서 SCV에 stop을 오버라이딩 시켜놔야 되는것같다.
	
	public void gatherMineral() {
		if (getState() == State.staying) {
			executorService = Executors.newScheduledThreadPool(1);
			
			setState(State.gathering);
			System.out.println("미네랄을 캐러갑니다!!!");
			executorService.scheduleAtFixedRate(() -> 
				{
					player.setMinerals(player.getMinerals() + 8);
	/*보여주기용*/		System.out.println(player.getMinerals());
				}
				, 0, 5, TimeUnit.SECONDS);
		} else
			System.out.println("바빠서 명령을 수행할 수 없습니다.");
	}
	


	public void gatherGas() {
		if (player.isRefinery()) {
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
		else
			System.out.println("정제소를 설치해주세요.");
	}

	public void produceCommandCenter(int x, int y) {
		if (getState() != State.staying) {
			System.out.println("다른 일을 하는 중입니다.");
		} else if (produceHelper.validCheck(player, Data.COMMANDCENTER_M, Data.COMMANDCENTER_G, 0))
			// 자원 있음. 건설 시작.
			{
			setState(State.building);
		System.out.println("건설을 시작합니다.");
		executorService = Executors.newScheduledThreadPool(1);
		executorService.schedule(() -> {
			Building CommandCenter = new CommandCenter(player, x, y);
			setState(State.staying);
			stop();
			System.out.println(CommandCenter.getName() + " 이 완성되었습니다.");
		}, Data.COMMANDCENTER_TIME, TimeUnit.SECONDS);
	
			}
	}

	public void produceBarracks(int x, int y) {
		if (getState() != State.staying) {
			System.out.println("다른 일을 하는 중입니다.");
		} else if (produceHelper.validCheck(player, Data.BARRACKS_M, Data.BARRACKS_G, 0))
		{
			setState(State.building);
		System.out.println("건설을 시작합니다.");
		executorService = Executors.newScheduledThreadPool(1);
		executorService.schedule(() -> {
			Building Barracks = new Barracks(player, x, y);
			setState(State.staying);
			stop();
			System.out.println(Barracks.getName() + " 이 완성되었습니다.");
		}, Data.BARRACKS_TIME, TimeUnit.SECONDS);
	}
	}
	public void produceSupplyDepot(int x, int y) {
		if (getState() != State.staying) {
			System.out.println("다른 일을 하는 중입니다.");
		} else if (produceHelper.validCheck(player, Data.SUPPLYDEPOT_M, Data.SUPPLYDEPOT_G, 0))
		{
			setState(State.building);
		System.out.println("건설을 시작합니다.");
		executorService = Executors.newScheduledThreadPool(1);
		executorService.schedule(() -> {
			Building SupplyDepot = new SupplyDepot(player, x, y);
			setState(State.staying);
			stop();
			System.out.println(SupplyDepot.getName() + " 이 완성되었습니다.");
		}, Data.SUPPLYDEPOT_TIME, TimeUnit.SECONDS);
	}
	}
	public void produceRefinery(int x, int y) {
		if (getState() != State.staying) {
			System.out.println("다른 일을 하는 중입니다.");
		} else if (produceHelper.validCheck(player, Data.REFINERY_M, Data.REFINERY_G, 0))
		{
			setState(State.building);
		System.out.println("건설을 시작합니다.");
		executorService = Executors.newScheduledThreadPool(1);
		executorService.schedule(() -> {
			Building Refinery = new Refinery(player, x, y);
			setState(State.staying);
			stop();
			System.out.println(Refinery.getName() + " 이 완성되었습니다.");
		}, Data.REFINERY_TIME, TimeUnit.SECONDS);
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