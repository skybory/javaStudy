package practice;

import java.util.Scanner;


public class chapter4 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		System.out.println("점수를 입력해주세요. :");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); // 화면을 통해 입력받은 점수를 score 에 저장
		
		System.out.printf("당신의 점수는 %d점입니다.%n", score);
		
		if (score >= 90) {		//score 이 90점 이상이면 A학점
			grade = 'A';
			}
			
		}
	}


