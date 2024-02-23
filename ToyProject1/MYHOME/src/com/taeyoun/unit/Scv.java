package com.taeyoun.unit;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.ProduceHelper;
import com.taeyoun.resource.map.Locatable;
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
		System.out.println(Data.SCV_STATEMENT1);
		this.player = player;
		this.executorService = Executors.newSingleThreadScheduledExecutor();
	}

	private void mineralDelay() {
	    try {
	        Thread.sleep(5000); // 1초 딜레이
	    } catch (InterruptedException e) {
	        Thread.currentThread().interrupt();
	        stop();
	    }
	}
	
	
	
	// 미네랄 채굴
		public void gatherMineral() {
	        setState(State.gathering);

	        executorService.scheduleAtFixedRate(() -> {
	            player.setMinerals(player.getMinerals() + 8);
	        }, 0, 5, TimeUnit.SECONDS);
	    }

		// 가스 채굴
		public void gatherGas() {
			setState(State.gathering);
			while(getState() == State.gathering) {
				mineralDelay();
				player.setGas(player.getGas()+8);
			}
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