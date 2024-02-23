package com.taeyoun.building;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.ProduceHelper;
import com.taeyoun.resource.map.Locatable;

public class Building implements Locatable{
	
	private Player player;
	private String name;
	private int mineralCost;
	private int gasCost;
	private int maxHp;
	private int x;
	private int y;
	private ProduceHelper produceHelper;
	//ProduceHelper p = ProduceHelper.getInstance();

	public Building( Player player, String name, int mineralCost, int gasCost, int maxHp, int x, int y) {
		super();
		this.player = player;
		this.name = name;
		this.mineralCost = mineralCost;
		this.gasCost = gasCost;
		this.maxHp = maxHp;
		this.produceHelper = ProduceHelper.getInstance();
		this.x = x;
		this.y = y;
	}

	public ProduceHelper getProduceHelper() {
	        return produceHelper;
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

	public int getMineralCost() {
		return mineralCost;
	}

	public void setMineralCost(int mineralCost) {
		this.mineralCost = mineralCost;
	}

	public int getGasCost() {
		return gasCost;
	}

	public void setGasCost(int gasCost) {
		this.gasCost = gasCost;
	}

	
	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	@Override
	public String toString() {
		 return "Building<" + (player.getBuildingList().indexOf(this) + 1) + "> : " + name;
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
