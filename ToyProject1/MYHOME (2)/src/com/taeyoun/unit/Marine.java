package com.taeyoun.unit;

import com.taeyoun.data.Data;
import com.taeyoun.resource.Player;


public class Marine extends Unit{
	private int x;
	private int y;

	public Marine(Player player, int x, int y) {
		super(player,
				Data.MARINE_NAME,
				Data.MARINE_HPMAX,
				Data.MARINE_HPMAX,
				Data.MARINE_ATK,
				Data.MARINE_DEF,
				Data.MARINE_ATKRANGE,
				x,
				y,
				Unit.State.staying,
				Data.MARINE_STATEMENT1,
				Data.MARINE_STATEMENT2,
				Data.MARINE_STATEMENT1,
				Data.MARINE_STATEMENT2
				);
		System.out.println(Data.MARINE_STATEMENT1);
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
