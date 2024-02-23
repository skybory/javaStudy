package calendar;

import java.util.Calendar;

public class Main05 {

	public static void main(String[] args) {
		//현재 1월달 달력을 만드세요
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 1);	//1월
		
		// 이번 달은 몇 주로 되어있는지?
		int week_count = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
		
		// 이번 달은 몇일까지 있는가?
		int day_count = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// 이번 달은 무슨 요일부터 시작하는가?

		int first_day = cal.get(Calendar.DAY_OF_WEEK);

		
		System.out.println("이번 달의 시작 요일 인덱스 : "+ first_day);	
		
		int day = 0;
		int Calendar[][] = new int[week_count][7];
		
		for(int i = 0; i < 1; i++) {
			for(int j =0; j< first_day-1; j++) {
				System.out.printf("\t");
			}
			for(int j = first_day-1; j<7; j++) {
				day++;
				System.out.printf("%02d ", day);
				System.out.printf("\t");
			}
			System.out.println("");
		}
			
		for (int i =1 ; i< Calendar.length; i++) {
			for(int j = 0; j < Calendar[i].length; j++){
				day++;
				System.out.printf("%02d ",day);
				System.out.printf("\t");
				if (day == day_count) break;
			}
			if (day == day_count) break;
		System.out.println("");
		}
		
	}

}
