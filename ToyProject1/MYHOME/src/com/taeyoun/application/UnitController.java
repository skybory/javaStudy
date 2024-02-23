package com.taeyoun.application;

import java.util.List;
import java.util.Scanner;

import com.taeyoun.resource.Player;
import com.taeyoun.unit.Marine;
import com.taeyoun.unit.Medic;
import com.taeyoun.unit.Scv;

public class UnitController {
	
// 게임시작 후 press u	
	
	
	 public static void controlUnit(Player human, Scanner scanner) {		
        System.out.println("유닛을 조작합니다");
        System.out.println(human.getUnitList());
        System.out.println("조작할 유닛을 고르세요 (s : SCV, m : Marine, c : Medic, q : 종료):");
        String input = scanner.next();		// 메뉴판 인쇄랑 input은 세트

        switch (input.toLowerCase()) {
            case "s" :
            	controlScv(human, scanner);
                break;

			case "m" :
				controlMarine(human, scanner);
				break;
				
			case "c" :
				controlMedic (human, scanner);
				break;
				
            case "q" :
                System.out.println("유닛 조작을 종료합니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다");
                break;
        }
    }
	
	public static void	controlScv(Player human, Scanner scanner) {
		String input;				
		int number;
	 		          	List <Scv> scvList = human.getListOfType(Scv.class);
		        		System.out.println(scvList);
		        		System.out.println(" 사용할 유닛 번호를 고르세요 , 0 : 전체 선택, q : 종료 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	// 만약 제어할수있는 유닛 리스트가 0개이면 제어할수 없다는 오류 띄우기
		        		input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	//try,catch 구문으로 잘못된 입력값 잡아주기
			        	
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			        	 
					/*	if (input.equals("0")) {
								human.getControlUnitList().addAll(scvList);		// 모든 SCV를 ControlUnitList 로 옮긴다.
						}
						*/
			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			        	System.out.println(" SCV 메뉴입니다. m : 미네랄 캐기, g : 가스 캐기, q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        		case "m" :
			        			scvList.get(number).gatherMineral();
			        			break;
			        			
			        		case "g" :
			        			scvList.get(number).gatherGas();
			        			break;
			        			
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 72");
			        			break;
			        	}
	}
	 
	   public static void	controlMarine(Player human, Scanner scanner) {
		String input;				
		int number;
	 		          	List <Marine> marineList = human.getListOfType(Marine.class);
		        		System.out.println(marineList);
		        		System.out.println(" 사용할 유닛 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			        	System.out.println(" 메뉴를 선택하세요. a : 유닛 공격, m : 유닛 이동, q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        		case "a" :
			        			System.out.println("아직 구현하지 못했습니다. 마린 공격");
			        			break;
			        			
			        		case "m" :
			        			System.out.println("아직 구현하지 못했습니다. 마린 이동");
			        			break;
			        			
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 101");
			        			break;
			        	}
	}

	   public static void	controlMedic(Player human, Scanner scanner) {
		String input;				
		int number;
	 		          	List <Medic> medicList = human.getListOfType(Medic.class);
		        		System.out.println(medicList);
		        		System.out.println(" 사용할 유닛 번호를 고르세요 "); 				// 2. 몇번 커맨드 센터를 사용할지 물어본다
			        	input = scanner.next(); 			        			//	값 입력하기(ex:2)
			        	System.out.println(input + "번을 선택하셨습니다.");				// 3. 입력값 확인해준다
			        	number = Integer.parseInt(input) - 1;					// 4. number 값을 입력값-1 로 해준다.(배열이기때문)
			        	System.out.println(" 메뉴를 선택하세요. a : 유닛 공격, m : 유닛 이동, q : 종료");	//5. 메뉴 선택창을 출력한다.
			        	input = scanner.next();									// 입력값을 다시 오픈
	 
			        	switch(input.toLowerCase()) {
			        		case "a" :
			        			System.out.println("아직 구현하지 못했습니다. 메딕 공격");
			        			break;
			        			
			        		case "m" :
			        			System.out.println("아직 구현하지 못했습니다. 메딕 이동");
			        			break;
			        			
			        		case "q" :
			        			System.out.println("되돌아갑니다.");
			        			break;
			        			
			        		default :
			        			System.out.println("에러코드 133");
			        			break;
			        	}
	}

	

	
}
