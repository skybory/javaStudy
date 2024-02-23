package com.taeyoun.application;

import java.util.Scanner;

import com.taeyoun.building.Barracks;
import com.taeyoun.building.CommandCenter;
import com.taeyoun.building.Refinery;
import com.taeyoun.building.SupplyDepot;
import com.taeyoun.resource.Player;
import com.taeyoun.unit.Marine;
import com.taeyoun.unit.Medic;
import com.taeyoun.unit.Scv;

public class BuildingMenu {
	    private static BuildingMenu instance;

	    private BuildingMenu() {
	    }

	    public static BuildingMenu getInstance() {
	        if (instance == null) {
	            instance = new BuildingMenu();
	        }
	        return instance;
	    }
	
	
	public void showMenu(Player human, Scanner scanner) {
		System.out.println("건물 창을 보여줍니다");
		System.out.println(human.getBuildingList());
		System.out.println("조작할 건물을 고르세요 (c : Command Center, b : Barracks, s : Supply depot, q : 종료):");
		String input = scanner.next().toLowerCase(); // 메뉴판 인쇄랑 input은 세트
		
		switch (input) {
/*		case "c":
			CommandCenter.controlCommandCenter(human, scanner);
			break;

		case "b":
			Barracks.controlBarracks(human, scanner);
			break;

		case "s":
			SupplyDepot.controlSupplyDepot ( human, scanner);
			break;

		case "q":
			System.out.println("유닛 조작을 종료합니다.");
			break;

		default:
			System.out.println("잘못된 입력입니다");
			break;
*/
		
		case "c":
			BuildingController.controlBuilding(human, scanner, CommandCenter.class);
			break;

		case "b":
			BuildingController.controlBuilding(human, scanner, Barracks.class);
			break;

		case "s":
			BuildingController.controlBuilding(human, scanner, SupplyDepot.class);
			break;
			
		case "r":
			BuildingController.controlBuilding(human, scanner, Refinery.class);
			break;

		case "q":
			System.out.println("건물 조작을 종료합니다.");
			break;

		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
	}
	
	
	

}