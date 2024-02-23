package com.taeyoun.application;

import java.util.Scanner;

import com.taeyoun.resource.Player;

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

	    
	public void showMenu(Player human, Scanner scanner) {
		System.out.println("메인메뉴를 실행합니다.");
		UnitMenu unitMenu = UnitMenu.getInstance();
		BuildingMenu buildingMenu = BuildingMenu.getInstance();
//		System.out.println("유닛 창을 보여줍니다");		//가지고 있는 유닛 창 보여줌. 필요없는 줄. 코드확인용
//		System.out.println(human.getListOfType(Unit.class));		//위와같음.

		String input;

		while (true) {
			System.out.println("------------------------------------- 패널 화면 -------------------------------------");
			System.out.println("패널 화면입니다. 기능을 선택하세요 ( b : 건물 선택하기, u : 유닛 선택하기, s : 자원 표시하기, q : 종료");
			// human.scheduleShowResources();

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
					break;
				case "q" :
					System.out.println("패널 화면을 종료합니다");
					scanner.close();
					return;
					
			

				default:
					System.out.println("메인 메뉴 오류1번");
					break;

				} // switch 문 종료
			} catch (Exception e) {
				System.out.println("메인 메뉴 오류2번sgsg" + e.getMessage());

			}
		}
	}


	
}
