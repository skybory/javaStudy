package com.taeyoun.resource;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.taeyoun.building.Building;
import com.taeyoun.building.CommandCenter;
import com.taeyoun.unit.Unit;

public class Player {
	private String playerName;
	private int minerals;
	private int gas;
	private int population;
	
	ProduceHelper produceHelper;
	private List<Unit> unitList;
	private List<Building> buildingList;
    private final ScheduledExecutorService scheduler;
	private List<Unit> controlUnitList;
	public Player(String playerName) {
		super();
		this.minerals = 250;
		this.gas = 0;
		this.population = 0;
		this.produceHelper = ProduceHelper.getInstance();
		this.unitList = new ArrayList<>();
		this.buildingList = new ArrayList<>();
		this.playerName = playerName;
		this.scheduler = Executors.newSingleThreadScheduledExecutor();
		this.controlUnitList = new ArrayList<>();
	
		//커맨드센터 생산 및 SCV4마리 생산.
		CommandCenter commandCenter = new CommandCenter(this,0,0);
		commandCenter.produceScv();
		commandCenter.produceScv();
		commandCenter.produceScv();
		commandCenter.produceScv();
	}

	
	
	public List<Unit> getControlUnitList() {
		return controlUnitList;
	}



	public void setControlUnitList(List<Unit> controlUnitList) {
		this.controlUnitList = controlUnitList;
	}



	public void addUnit(Unit unit) {
		getUnitList().add(unit);
		System.out.println("unitList에 " + unit.getName() + " 를(을) 추가 했습니다");
	}

	public void addBuilding(Building building) {
		getBuildingList().add(building);
		System.out.println("buildingList에 " + building.getName() + " 를(을) 추가 했습니다");
	}
	

	public void showGameStatus() {
		// 게임 상태를 보여주는 창 만들기
		System.out.println("======= Current Game Status =======");
		System.out.println("Player: " + playerName);
		System.out.println("Minerals: " + minerals);
		System.out.println("Gas: " + gas);
		System.out.println("Population: " + population);
		System.out.println("Units:");
		for (Unit unit : unitList) {
			System.out.printf("\t" + unit);
			System.out.printf("\t" +  "상태 : " + unit.getState());
			System.out.println("\t" + "위치 : (" + unit.getX() + "," + unit.getY() + ")" );
		}
		System.out.println("Buildings:");
		for (Building building : buildingList) {
			System.out.println("\t" + building);
		}
		System.out.println("===================================");
	}
	

	
	 public <T> List<T> getListOfType(Class<T> type) {		//소스 끌어옴. 원하는 클래스 타입에 해당하는 객체를 가져옴.
	        List<T> resultList = new ArrayList<>();
	        for (Building building : buildingList) {
	            if (type.isInstance(building)) {
	                resultList.add(type.cast(building));
	            }
	        }
	        for (Unit unit : unitList) {
	            if (type.isInstance(unit)) {
	                resultList.add(type.cast(unit));
	            }
	        }
	        return resultList;
	    }

	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getMinerals() {
		return minerals;
	}
	public void setMinerals(int minerals) {
		this.minerals = minerals;
	}
	public int getGas() {
		return gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}

	public List<Unit> getUnitList() {
		return unitList;
	}
	public void setUnitList(List<Unit> unitList) {
		this.unitList = unitList;
	}
	public List<Building> getBuildingList() {
		return buildingList;
	}
	public void setBuildingList(List<Building> buildingList) {
		this.buildingList = buildingList;
	}
	
	public void increaseMinerals() {
		this.setMinerals(this.getMinerals()+8);
	}
	 
	public void increaseGas() {
		this.setGas(this.getGas()+8);
	}

}
	
	
