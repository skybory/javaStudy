package com.taeyoun.application;

import java.util.List;
import java.util.Scanner;

import com.taeyoun.building.Barracks;
import com.taeyoun.building.Building;
import com.taeyoun.building.CommandCenter;
import com.taeyoun.resource.Player;
import com.taeyoun.unit.Unit;

public class BuildingController {
	
	static int buildingIndex;
	public static void controlBuilding(Player human, Scanner scanner, Class<? extends Building> BuildingType) {
        List<? extends Building> buildingList = human.getListOfType(BuildingType);
        while (true) {
            if (buildingList.size() == 0) {
                System.out.println("건물이 없습니다.");
                break;
            }
            else
            	buildingIndex = 1;
    		for (Building building : buildingList) {
    			System.out.printf("\t입력번호<%d> : %s\n", buildingIndex++, building);
    		}
            	System.out.println(" 사용할 건물 번호를 고르세요 , 0 : 전체 선택, 1 : 1번 건물, 2 : 2번 건물 , ... , q : 종료 ");

            int BuildingNumber = getBuildingNumber(scanner);		// 입력값을 -2,-1,n 셋중에 하나로 반환해주는 메서드

            if (BuildingNumber == -2) {
            	break;
            }
            else if (BuildingNumber == -1) {	//for 반복문 사용해보자
                // 건물 전체 선택 시
                System.out.println("다중 건물 명령을 선택했습니다.");

                for (Building Building : buildingList) {			// 해당 종류의 건물 모두에 대해 반복문 실행
                    handleBuildingMenu(Building, scanner);
                }
            } 
            else {
                // 개별 건물 선택 시
                System.out.println(buildingList.get(BuildingNumber).getName() + "을(를) 선택했습니다.");
                handleBuildingMenu(buildingList.get(BuildingNumber), scanner);
            }
        }
    }
        
    private static int getBuildingNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNext()) {
                String input = scanner.next().toLowerCase(); 

                if (input.equals("q")) {
                    System.out.println("종료합니다.");
                    return -2; // -2을 반환하여 호출한 곳에서 종료 여부를 확인할 수 있도록 함
                }
                try {
                    int parsedInput = Integer.parseInt(input);
                    if (parsedInput >= 0) {		//입력값이 0이거나 n일 경우
                        return parsedInput - 1;
                    } else {
                        System.out.println("잘못된 건물 번호입니다. 다시 선택하세요.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("올바른 숫자를 입력하세요.");
                }
            } else {
                System.out.println("입력값이 없습니다. 다시 입력하세요.");
                scanner.nextLine(); 
            }
        }
    }

    private static void handleBuildingMenu(Building building, Scanner scanner) {
    	
        System.out.println("건물 명령 콘솔입니다. 명령을 선택하세요.");
        if(building instanceof CommandCenter) {
        	CommandCenter commandCenter = (CommandCenter) building;
        	CommandCommandCenter(commandCenter,scanner);
        }
        else if (building instanceof Barracks) {
        	Barracks barracks = (Barracks) building;
        	CommandBarracks(barracks,scanner);
        }
        else
        	Command(building, scanner);
        
    }

    

    

	private static void Command(Building building, Scanner scanner) {
        System.out.println("건물 명령 콘솔입니다. m: 내 상태 보여주기 , q: 종료");
        String input = scanner.next().toLowerCase();

        switch (input) {
	        case "m" :
                System.out.println(building.toString());
            case "q":
                System.out.println("되돌아갑니다.");
                break;

            default:
                System.out.println("에러코드 105");
                break;
        }
    }
	
	private static void CommandCommandCenter(CommandCenter commandCenter, Scanner scanner) {
		System.out.println("커멘드센터 메뉴입니다. s: SCV 생산, q: 종료");
		String input = scanner.next().toLowerCase();

        switch (input) {
        case "s" :
			commandCenter.produceScv();
			break;
		case "q" :
			System.out.println("되돌아갑니다.");
			break;
			
		default :
			System.out.println("에러코드 123");
			break;

		}
	}
	
	
	private static void CommandBarracks(Barracks barracks, Scanner scanner) {
		System.out.println("배럭 메뉴입니다. m : 마린 생산, c : 메딕 생산, q: 종료");
		String input = scanner.next().toLowerCase();
		
		switch (input) {
		case "m" :
			barracks.produceMarine();
			break;
		case "c" :
			barracks.produceMedic();
			break;
		case "q" :
			System.out.println("되돌아갑니다.");
			break;
			
		default :
			System.out.println("에러코드 146");
			break;
			
		}
	}
    
    

}