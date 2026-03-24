package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		// 열거 타입 변수를 선언
		Week today = null;
		// calendar 얻기
		Calendar cal = Calendar.getInstance();
		//오늘의 요일 얻기
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		today = switch(week) {
		case 1 -> Week.SUNDAY;
		case 2 -> Week.MONDAY;
		case 3 -> Week.TUESDAY;
		case 4 -> Week.WEDNESDAY;
		case 5 -> Week.THURSDAY;
		case 6 -> Week.FRIDAY;
		default-> Week.SATURDAY;
		};
		System.out.println(today);
	}

}
