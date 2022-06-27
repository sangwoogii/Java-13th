package day0610;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam1 {

	public static void main(String[] args) {
		
		// Scanner 사용
		// 이름, 전화번호, 주소 값 추가 (add)
		// while문, while문 안에 switch문 필요?
		// 이름을 입력하면 값을 저장
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner s = new Scanner(System.in);
		System.out.print("1.추가 2.검색 3.수정 4.삭제 5.전체출력 6.데이터초기화 7.종료 > ");
		int input = s.nextInt();
		
//		while (true) {
			list.add("이름 : ");
			list.add("전화번호 : ");
			list.add("주소 : ");
			
			for (int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			list.set(0, "abc");
			list.set(1, "111");
			list.set(2, "222");
			
//		}
		
	}

}
