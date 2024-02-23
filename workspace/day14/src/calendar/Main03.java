package calendar;

import java.util.Calendar;

public class Main03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		
		//특정 날짜로 지정
		cal.set(Calendar.YEAR, 2023);
		//자바에서는 0부터 월을 관리하므로 12월로 설정
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DAY_OF_MONTH, 18);
		//시,분,초 설정
		cal.set(Calendar.HOUR_OF_DAY, 9);
		cal.set(Calendar.MINUTE, 10);
		cal.set(Calendar.SECOND, 22);
		DatePrinter.printDateTime(cal);
		
		//특정 날짜로 지정하는 다른 방법
		cal.set(1982, 5, 17);
		DatePrinter.printDateTime(cal);
		
		//시,분,초 포함해서 특정 날짜 지정	-> 24시간만 가능
		cal.set(1988, 2, 14, 1, 2, 3);
		DatePrinter.printDateTime(cal);
		
		
		// 연, 월, 시, 분, 초는 가만히 두고, 날짜만 1일로 변경하는 경우
		cal.set(Calendar.DAY_OF_MONTH, 1);
		DatePrinter.printDateTime(cal);
		
		
	}

}
