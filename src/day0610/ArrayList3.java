package day0610;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();

		// al에 각각의 값 추가
		al.add("A");
		al.add("B");
		al.add("C");
		
		
		// 2번 인덱스를 D로 고치고 싶음
		al.set(2, "D");
		
		// 값을 하나하나 출력하기 위해선 for문 사용
		for (int i=0; i<al.size(); i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		} // 값을 가지고 와서 보여주어야 하기 때문에 get 사용
		
		System.out.println();
		
		System.out.print("검색할 데이터를 입력 > ");
		Scanner sc = new Scanner(System.in);
		String srh = sc.next();
		
		int idx = 0;
		
		// 입력받은 값이 리스트에 있는지 확인하고 위치를 찾아 표시
		// 값이 없으면 없다. 라고 출력
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			System.out.println(idx + "번 인덱스에 " + al.get(idx) + "를 찾음");
		} else {
			System.out.println("없다.");
		}
		
		System.out.println();
		System.out.print("삭제할 데이터 입력 > ");
		String del = sc.next();
		// 삭제할 값을 입력받아 리스트에서 제거
		idx = 0; // idx를 0으로 초기화
		if (al.contains(srh)) {
			idx = al.indexOf(srh);
			al.remove(idx);
		} else {
			System.out.println("없다.");
		}
		
		for (int i=0; i<al.size(); i++) {
			System.out.println(i + "번째 요소 : " + al.get(i));
		}
		
		System.out.println();
		System.out.print("전체 내용을 삭제합니다.\n");
		
		System.out.println();
		
		al.removeAll(al);
		if (al.isEmpty()) {
			System.out.println("아무런 내용이 없습니다.");
		}
		
		
	}

}
