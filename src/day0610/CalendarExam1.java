package day0610;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarExam1 {

	public static void main(String[] args) {
		
		// 1. 이번달의 시작일 확인
		// 2. 이번달의 끝나는 날 확인 (다음 달 1일에서 하루를 빼면 됨)
		// 3. 확인하고자 하는 달의 1일이 무슨 요일인지 확인
		// 4. 해당하는 요일부터 숫자를 화면에 출력 (공백을 나타내는 for문, 날짜를 찍어내는 for문)
		// 5. 요일이 수요일이면 일요일부터 화요일까지 공백으로 표시한 뒤 날짜를 화면에 표시함
		
		// 입력에 필요한 Scanner 작성
		// 사용자가 직접 입력할 int형 정수 변수 2개
		// 내가 입력한 날짜를 가져와야하기 때문에 get
		// switch문
		// get year, get month, get date

		Scanner s = new Scanner(System.in);
		System.out.print("년도 입력 > ");
		int year = s.nextInt();
		System.out.print("월 입력 > ");
		int month = s.nextInt();							// 1. 년도와 월 입력받기
		
		int start_day_of_week = 0;							// 2. 시작 요일을 확인하기 위한 변수
		int end_day = 0;									// 2. 마지막 요일을 확인하기 위한 변수
		
		Calendar sDay = Calendar.getInstance();				// 3. 시작 일		/ Caldendar 객체 생성
		Calendar eDay = Calendar.getInstance();				// 3. 마지막 날	/ Caldendar 객체 생성
		
		sDay.set(year, month -1, 1);						// 이번달 (month는 -1 해주어야함)
		eDay.set(year, end_day, 1);							// 다음달 1일
		
		eDay.add(Calendar.DATE, -1);						// 이번 달의 마지막날짜 확인
		
		start_day_of_week = sDay.get(Calendar.DAY_OF_WEEK);	// 사용자가 직접 입력한 달의 1일이 무슨 요일인지 확인
															// (일요일부터 1로 시작)			
		
		end_day = eDay.get(Calendar.DATE);
		
		System.out.println("\n      " + year + "년 " + month + "월 ");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 요일을 이용하여 줄 바꾸기
//		for (int i=1; i<start_day_of_week; i++) {
//			System.out.print("   ");
//		}
//		
//		for (int i=1, n = start_day_of_week; i<= end_day; i++, n++) {
//			if (i < 10) {
//				System.out.print("  " + i);
//			} else {
//				System.out.print(" " + i);	
//			}
////			System.out.print((i<10)? "  " + i : " " + i);	// 삼항연산자
//			
//			if (n % 7 == 0) {
//				System.out.println();
//			}
//		}
		 
		
		
		
		
		// 요일을 이용하지 않고 줄 바꾸기
		int week = 0;
		
		for (int i=1; i<start_day_of_week; i++) {
			System.out.print("   ");
			week++;
		}
		
		for (int i=1; i<= end_day; i++) {
			if (i < 10) {
				System.out.print("  " + i);
			} else {
				System.out.print(" " + i);	
			}
			
			week++;
			
			if (week == 7) {
				System.out.println();
				week = 0;
			}
		}

		
	}
}
