package com.taeyoun.application;

import java.util.Scanner;
import com.taeyoun.resource.Player;
//import com.taeyoun.unit.Unit;
import com.taeyoun.unit.Unit;



public class MainMenu {
	    private static MainMenu instance;

	    private MainMenu() {
	    }

	    public static MainMenu getInstance() {
	        if (instance == null) {
	            instance = new MainMenu();
	        }
	        return instance;
	    }	


	    private Player enemy;
	    
	    
	public void showMenu(Player human, Player computer, Scanner scanner) {
		UnitMenu unitMenu = UnitMenu.getInstance();
		BuildingMenu buildingMenu = BuildingMenu.getInstance();
		this.enemy = computer;
		String input;

		while (true) {
			System.out.println("------------------------------------- 패널 화면 -------------------------------------");
			System.out.println("패널 화면입니다. 기능을 선택하세요 ( b : 건물 선택하기, u : 유닛 선택하기, s : 자원 표시하기, q : 종료");
			input = scanner.next();
			try {
				switch (input.toLowerCase()) {
				case "b" :
					buildingMenu.showMenu(human, scanner);
					break;
				case "u" :
					unitMenu.showMenu(human, scanner);
					break;
			
				case "s" :
					human.showGameStatus();	
					if (isGameOver()) {
						endGame();
						return;
					}
					
					break;
				case "q":
					System.out.println("정말 게임을 종료하시겠습니까?");
					System.out.println();
					System.out.println();
					System.out.println(" y : 네, n : 아니오");
					Thread.sleep(1500);
					input = scanner.next().toLowerCase();
					if (input.equals("n")) {
					System.out.println("패널 화면으로 돌아갑니다");
					break;
					}
					else if (input.equals("y")) {
					System.out.println("게임을 종료합니다");
					scanner.close();
					return;
					}

				default:
					System.out.println("메인 메뉴 오류1번");
					break;

				} // switch 문 종료
			} catch (Exception e) {
				System.out.println("메인 메뉴 오류2" + e.getMessage());

			}
		}
	}
	
	public boolean isComputerDefeated() {
	    for (Unit unit : enemy.getUnitList()) {
	        if (unit != null) {
	            return false; 
	        }
	    }
	    return true; 
	}

	// 게임 종료 조건을 체크하는 메서드
	public boolean isGameOver() {
	    return isComputerDefeated();
	}
	
	
	public void endGame() {
	    System.out.println("게임 종료!!!");
	    System.out.println("게임 종료!!!");
	    System.out.println("게임 종료!!!");
	    System.out.println("게임 종료!!!");
	}
	


	
}
