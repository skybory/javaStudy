package array;

public class Main01 {

	public static void main(String[] args) {

		//행을 쫓아가는 for 문 안에 열을 쫓아가는 for 문을 만들면 해열 코딩을 이해할 수 있다. 
		// 행의 길이는 가변적으로 변할 수 있는 변수이므로, 행과 열의 길이는 하드코딩을 지양하고 배열이름.length 로 받아오는게 좋다
	
		
		 // 성적표에 대한 2차 배열 생성
		// 학급 성적을 위한 배열
		int [][] grade = new int[3][3];

		String student1 = "dooly";
		
		//둘리의 과목별 점수
		grade[0][0] = 75;
		grade[0][1] = 82;
		grade[0][2] = 91;
		
		//도우너의 과목별 점수
		grade[1][0] = 88;
		grade[1][1] = 64;
		grade[1][2] = 50;
		
		
		//또치의 과목별 점수
		grade[2][0] = 100;
		grade[2][1] = 100;
		grade[2][2] = 90;
		
		 // 2차원 배열을 탐색하여 총점과 평균점수 구하기
		 
		//	1. 행에 대한 접근
		for(int i = 0; i < grade.length; i++ ) {
		//반복분 안에서 선언된 변수는
		// 매 실행시마다 새로 생성된다 ( 초기화된다 )
			int sum = 0 ;							//이렇게 하면 sum이 겹칠것같은데..라는 생각 ( 기존의 데이터가 사라질까봐 걱정 ) --> print의 위치를 for문 안에 집어넣음으로써 해결함.
			int avg = 0;
			
			for( int j = 0; j < grade[i].length; j++) { 		//열의 길이 표기하는 법 까먹음 : 행렬[행].length
		//i행 위치의 j번째 열의 과목별 누적 점수 처리
				sum += grade[i][j];
				avg = sum / grade[i].length;
				//쉬는시간
				
				/*
				
				if (j == grade[i].length - 1) {
				System.out.println(i+1 + "번째 학생의 총점은 " + sum + "점 이고, 평균은 " + avg + "입니다.");
				}
				*/
			
			}
			//여기 : 안에 for문기준으로는 밖이고, 밖의 for문 기준으로는 안.
			System.out.println(i+1 + "번째 학생의 총점은 " + sum + "점 이고, 평균은 " + avg + "입니다.");
		}
		
		
		
	}

}