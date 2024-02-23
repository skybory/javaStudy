package com.taeyoun.application;

import com.taeyoun.resource.map.Map;
import com.taeyoun.unit.Marine;
import com.taeyoun.unit.Scv;
import com.taeyoun.unit.Unit;

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
        
        CommandCenter commandCenter1 = new CommandCenter(human,0,0);
		Unit scv1 = new Scv(human, 1, 0);
		Unit scv2 = new Scv(human, 4, 3);
		Unit scv3 = new Scv(human, 8, 0);
		Unit scv4 = new Scv(human, 4, 0);
		human.addUnit(scv1);
		human.addUnit(scv2);
		human.addUnit(scv3);
		human.addUnit(scv4);
		Unit marine1 = new Marine(human, 5, 9);
		Unit marine2 = new Marine(human, 6, 9);
		human.addUnit(marine1);
		human.addUnit(marine2);
        CommandCenter commandCenter2 = new CommandCenter(computer,10,10);
		Unit cscv1 = new Scv(computer, 11, 10);
		Unit cscv2 = new Scv(computer, 12, 10);
		Unit cscv3 = new Scv(computer, 13, 10);
		Unit cscv4 = new Scv(computer, 14, 10);
		computer.addUnit(cscv1);
	//	computer.addUnit(cscv2);
	//	computer.addUnit(cscv3);
	//	computer.addUnit(cscv4);
		
		
		System.out.println("----------------------- 게임 시작합니다 -------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		human.showGameStatus();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
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
				MainMenu mainMenu = MainMenu.getInstance();
			//	System.out.println("기호2번");
		        mainMenu.showMenu(human, computer, scanner);	//메인메뉴 실행
    
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
