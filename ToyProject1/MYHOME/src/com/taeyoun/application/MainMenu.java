package com.taeyoun.application;

import java.util.Scanner;

import com.taeyoun.resource.Player;
import com.taeyoun.unit.Unit;

public class MainMenu {

	public static void MainMenu(Player human, Scanner scanner) {

		System.out.println("유닛 창을 보여줍니다");
		System.out.println(human.getListOfType(Unit.class));

		String input;

		while (true) {
			System.out.println("------------------------------------- 패널 화면 -------------------------------------");
			System.out.println("패널 화면입니다. 기능을 선택하세요 ( b : 건물 선택하기, u : 유닛 선택하기, s : 자원 표시하기, q : 종료");
			// human.scheduleShowResources();

			input = scanner.next();

			try {
				switch (input.toLowerCase()) {
				case "b" :
					BuildingController.controlBuilding(human, scanner);
					break;
				case "u" :
					UnitController.controlUnit(human, scanner);
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
				System.out.println("메인 메뉴 오류2번" + e.getMessage());

			}
		}
	}
}
