package ch12.javaBaseModule07_D_DayCalender;

import java.time.LocalDate;
import java.time.format.*;
import java.time.temporal.ChronoUnit;

public class D_DayCalendar {

	public static void main(String[] args) {
		LocalDate start = LocalDate.parse("2026-05-09");
		LocalDate target = LocalDate.parse("2026-06-01");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		
		System.out.println("시작일: " + start.format(dtf));
		System.out.println("목표일: " + target.format(dtf));
		
		if(start.isAfter(target)) {
			System.out.println("이미 지난 날짜입니다");
			return;
		}
		if(start.isEqual(target)){
			System.out.println("D-Day입니다");
			return;
		}
		long remainDay = ChronoUnit.DAYS.between(start, target);
		System.out.println("남은 일수: " + remainDay + "일");
		
		
	}

}
