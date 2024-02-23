package com.taeyoun.application;

import com.taeyoun.resource.map.Map;

import java.util.Scanner;

import com.taeyoun.building.CommandCenter;
import com.taeyoun.resource.Player;

public class StartGame {

	private Map map;
    private Player human;
    private Player computer;

    public StartGame() {
        this.map = new Map();
        this.human = new Player("김태연");
        this.computer = new Player("Computer");
		
		System.out.println("----------------------- 게임 시작합니다 -------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(human.getBuildingList());
		System.out.println(human.getUnitList());
		
		        System.out.println("*****************************************");
		        System.out.println("*                                      *");
		        System.out.println("*                                      *");
		        System.out.println("*                                      *");
		        System.out.println("*                                      *");
		        System.out.println("*                                      *");
		        System.out.println("*                                      *");
		        System.out.println("*              Game Start              *");
		        System.out.println("*                                      *");
		        System.out.println("*****************************************");
		        Scanner scanner = new Scanner(System.in);
  
		        MainMenu.MainMenu(human, scanner);	//메인메뉴 실행
    
    }

	public void showGameStatus() {
	    human.showGameStatus();
	}
    
	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Player getHuman() {
		return human;
	}

	public void setHuman(Player human) {
		this.human = human;
	}

	public Player getComputer() {
		return computer;
	}

	public void setComputer(Player computer) {
		this.computer = computer;
	}

    
}
