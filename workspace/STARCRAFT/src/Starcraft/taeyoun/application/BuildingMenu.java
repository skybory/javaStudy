package Starcraft.taeyoun.application;

import java.util.Scanner;

import Starcraft.taeyoun.building.Barracks;
import Starcraft.taeyoun.building.CommandCenter;
import Starcraft.taeyoun.building.Refinery;
import Starcraft.taeyoun.building.SupplyDepot;
import Starcraft.taeyoun.resource.Player;
import Starcraft.taeyoun.unit.Marine;
import Starcraft.taeyoun.unit.Medic;
import Starcraft.taeyoun.unit.Scv;

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
		human.showBuildingList();
		System.out.println("조작할 건물을 고르세요 (c : Command Center, b : Barracks, s : Supply depot, r : Refinery, q : 종료):");
		String input = scanner.next().toLowerCase(); // 메뉴판 인쇄랑 input은 세트
		
		switch (input) {
		
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