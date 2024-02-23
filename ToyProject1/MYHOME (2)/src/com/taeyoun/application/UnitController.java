package com.taeyoun.application;


import java.util.List;
import java.util.Scanner;

import com.taeyoun.resource.Player;
import com.taeyoun.unit.Scv;
import com.taeyoun.unit.Unit;

public class UnitController {

	public static void controlUnit(Player human, Scanner scanner, Class<? extends Unit> unitType) {
        List<? extends Unit> unitList = human.getListOfType(unitType);
        while (true) {
            if (unitList.size() == 0) {
                System.out.println("유닛이 없습니다.");
                break;
            }
            else 
            	System.out.println(unitList);
            	System.out.println(" 사용할 유닛 번호를 고르세요 , 0 : 전체 선택, q : 종료 ");
            	int unitNumber = getUnitNumber(scanner);
	            if (unitNumber == -2) {
	            	break;
	            }
	            else if (unitNumber == -1) {
	            	boolean allScv = unitList.stream().allMatch(unit -> unit instanceof Scv);
	            	if (allScv) {
	            		MultiCommandScv((List<Scv>) unitList,scanner);
	            	} else {
	            		System.out.println("유닛 전체를 선택했습니다.");
		                MultiCommand((List<Unit>) unitList,scanner);
	            	}
	            }
	           
	            else {
	                // 개별 유닛 선택 시
	                System.out.println(unitList.get(unitNumber).getName() + "을(를) 선택했습니다.");
	                handleUnitMenu(unitList.get(unitNumber), scanner);
            }
        }
    }

	private static void MultiCommand(List<Unit> unitList, Scanner scanner) {
        System.out.println("다중 유닛 명령 콘솔입니다. m : 전체 이동, s : 전체 정지, a : 전체 공격, q: 종료");
        String input = scanner.next().toLowerCase();

        switch (input) {
            case "m":
                int x;
                int y;
            	System.out.println("유닛을 이동합니다. 목표 x좌표를 입력하세요");
            	x = scanner.nextInt();
            	System.out.println("유닛을 이동합니다. 목표 y좌표를 입력하세요");
            	y = scanner.nextInt();
            	
            	for(int i = 0; i < unitList.size(); i++)
            	{
            		unitList.get(i).move(x, y);
            		try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
            	}
            	//for 문 한번 써보고
            	break;

            case "s":
            	  for (Unit unit : unitList) {
                      unit.stop();
                      try {
  						Thread.sleep(20);
  					} catch (InterruptedException e) {
  						e.printStackTrace();
  					}
            	  }
            	  //람다표현식도 써보기
                break;

            case "a" : 
            	System.out.println("공격할 대상을 입력하세요..어떻게???");
            /*	Unit target = unit;
            	
            	for (Unit unit : unitList) {
                    unit.attack(target);
                }*/
            	try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
                break;
                

            case "q":
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;

            default:
                System.out.println("에러코드 116");
                break;
        }
    }
	
	
	private static void MultiCommandScv(List<Scv> unitList, Scanner scanner) {
        System.out.println("SCV 전용 다중 유닛 명령 콘솔입니다. m : 전체 이동, s : 전체 정지, a : 전체 공격, g : 전체 자원 채굴 q: 종료");
        String input = scanner.next().toLowerCase();

        switch (input) {
            case "m":
                int x;
                int y;
            	System.out.println("유닛을 이동합니다. 목표 x좌표를 입력하세요");
            	x = scanner.nextInt();
            	System.out.println("유닛을 이동합니다. 목표 y좌표를 입력하세요");
            	y = scanner.nextInt();
            	
            	for(int i = 0; i < unitList.size(); i++)
            	{
            		unitList.get(i).move(x, y);
            		try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
            	}
            	//for 문 한번 써보고
            	break;

            case "s":
            	  for (Unit unit : unitList) {
                      unit.stop();
              		try {
  						Thread.sleep(20);
  					} catch (InterruptedException e) {
  						e.printStackTrace();
  					}
            	  }
            	  //람다표현식 써보기
                break;

            case "a" : 
            	System.out.println("공격할 대상을 입력하세요..어떻게???");
            /*	Unit target = unit;
            	
            	for (Unit unit : unitList) {
                    unit.attack(target);
                }*/
                break;

			case "g":
				System.out.println("자원을 채굴합니다. m: 미네랄 캐기, g: 가스 캐기, q: 종료");
				input = scanner.next().toLowerCase();

				switch (input) {
				case "m":
					for (Scv scv : unitList) {
						scv.gatherMineral();
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("다중 커맨드 명령 : 미네랄 캐기 성공");
					}
					break;

				case "g":
					for (Scv scv : unitList) {
						scv.gatherGas();
	            		try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("다중 커맨드 명령 : 가스 캐기 성공");
					}
					break;

				case "q":
					System.out.println("유닛 명령 콘솔로 되돌아갑니다.");
					break;

				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
				break;
			case "q":
				System.out.println("메인 메뉴로 돌아갑니다.");
                break;

            default:
                System.out.println("에러코드 116");
                break;
        }
    }
	
    private static int getUnitNumber(Scanner scanner) {
        while (true) {
            if (scanner.hasNext()) {
                String input = scanner.next().toLowerCase();

                if (input.equals("q")) {
                    System.out.println("종료합니다.");
                    return -2; // -2를 반환하여 호출한 곳에서 종료 여부를 확인할 수 있도록 함
                }

                try {
                    int parsedInput = Integer.parseInt(input);
                    if (parsedInput >= 0) {
                        return parsedInput - 1;
                    } else {
                        System.out.println("잘못된 유닛 번호입니다. 다시 선택하세요.");
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

    private static void handleUnitMenu(Unit unit, Scanner scanner) {
    	
        System.out.println("유닛 명령 콘솔입니다. 명령을 선택하세요.");
    if(unit instanceof Scv) {
    	Scv scv = (Scv) unit;
    	CommandScv(scv,scanner);
    }
    else
        Command(unit, scanner);
    }

    

    
	private static void Command(Unit unit, Scanner scanner) {
        System.out.println("유닛 명령 콘솔입니다. m : 이동, s : 정지, a : 공격, q: 종료");
        String input = scanner.next().toLowerCase();

        switch (input) {
            case "m":
                int x;
                int y;
            	System.out.println("유닛을 이동합니다. 목표 x좌표를 입력하세요");
            	x = scanner.nextInt();
            	System.out.println("유닛을 이동합니다. 목표 y좌표를 입력하세요");
            	y = scanner.nextInt();
            	unit.move(x, y);
                break;

            case "s":
                unit.stop();
                break;

            case "a" : 
            	System.out.println("공격할 대상을 입력하세요..어떻게???");
            	unit.attack(unit);
                break;
                
            case "q":
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;

            default:
                System.out.println("에러코드 116");
                break;
        }
    }
	
	private static void CommandScv(Scv scv, Scanner scanner) {
		System.out.println("SCV 전용 유닛 명령 콘솔입니다. m : 이동, s : 정지, a : 공격, b : 건물 짓기 , g : 자원 채굴 q: 종료");
		String input = scanner.next().toLowerCase();

		switch (input) {
		case "m":
			int x;
			int y;
			System.out.println("유닛을 이동합니다. 목표 x좌표를 입력하세요");
			x = scanner.nextInt();
			System.out.println("유닛을 이동합니다. 목표 y좌표를 입력하세요");
			y = scanner.nextInt();
			scv.move(x, y);
			break;

		case "s":
			scv.stop();
			break;

		case "a":
			System.out.println("공격할 대상을 입력하세요..어떻게???");
			scv.attack(null);
			break;

		case "g":
			System.out.println("자원을 채굴합니다. m: 미네랄 캐기, g: 가스 캐기, q: 종료");
			input = scanner.next().toLowerCase();

			switch (input) {
			case "m":
				scv.gatherMineral();
				System.out.println("단독 명령 : 미네랄을 캐러갑니다");
				break;
			case "g":
				scv.gatherGas();
				System.out.println("단독 명령 : 가스를 캐러갑니다");
				break;
			case "q":
				System.out.println("유닛 명령 콘솔로 되돌아갑니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			break;
		case "q":
			System.out.println("메인 콘솔로 되돌아갑니다.");
			break;

		default:
			System.out.println("에러코드 72");
			break;
		}
	}
    
    

}