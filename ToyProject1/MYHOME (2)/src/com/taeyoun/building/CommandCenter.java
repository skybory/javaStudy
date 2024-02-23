package com.taeyoun.building;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;
import com.taeyoun.resource.map.Locatable;
import com.taeyoun.unit.Scv;
import com.taeyoun.unit.Unit;

public class CommandCenter extends Building implements Locatable {

	private Player player;
	private static int commandCenterCount = 0;
	private int x;
	private int y;

	public CommandCenter(Player player, int x, int y) {
		super(player, Data.COMMANDCENTER_NAME, Data.COMMANDCENTER_M, Data.COMMANDCENTER_G, Data.COMMANDCENTER_HP, x, y);
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
				Unit Scv = new Scv(player, x, y);
				// Scv.setX()
				player.addUnit(Scv);
			}
		} else
			System.out.println("커멘드 센터를 지으세요");
	}

	private static void incrementCountCommandCenter() {
		commandCenterCount++;
	}

	public static int getCommandCenterCount() {
		return commandCenterCount;
	}

	public void increaseMinerals() {
		player.setMinerals(player.getMinerals() + 8);
	}

	public void increaseGas() {
		player.setGas(player.getGas() + 8);
	}

}
