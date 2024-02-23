package com.taeyoun.application;

import java.util.Scanner;

import com.taeyoun.resource.Player;
import com.taeyoun.unit.Marine;
import com.taeyoun.unit.Medic;
import com.taeyoun.unit.Scv;
import com.taeyoun.unit.Unit;

public class UnitMenu {
	    private static UnitMenu instance;

	    private UnitMenu() {
	    }

	    public static UnitMenu getInstance() {
	        if (instance == null) {
	            instance = new UnitMenu();
	        }
	        return instance;
	    }
	
	public void showMenu(Player human, Scanner scanner) {
		System.out.println("유닛 창을 보여줍니다");
		//System.out.println(human.getUnitList());
		for (Unit unit : human.getUnitList()) {
			System.out.printf("\t" + unit + "\n");
		}
		//메인 메뉴 시작할때처럼 자료를 받아오고싶음.
		System.out.println("조작할 유닛을 고르세요 (s : SCV, m : Marine, c : Medic, q : 종료):");
		String input = scanner.next().toLowerCase(); // 메뉴판 인쇄랑 input은 세트

		switch (input) {
		case "s":
			UnitController.controlUnit(human, scanner, Scv.class);
			break;

		case "m":
			UnitController.controlUnit(human, scanner, Marine.class);
			break;

		case "c":
			UnitController.controlUnit(human, scanner, Medic.class);
			break;

		case "q":
			System.out.println("유닛 조작을 종료합니다.");
			break;

		default:
			System.out.println("잘못된 입력입니다");
			break;
		}
	}
	
}
