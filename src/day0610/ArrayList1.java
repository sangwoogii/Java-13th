package day0610;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		// ArrayList는 배열기반이기 때문에
		// ArrayList의 객체를 생성하여 값을집어넣으면 10칸이라는 배열이 생성되었다는 의미가 됨
		// ArrayList에 값을 넣을 땐 객체만 가능 -> 라이브러리 즉 이미 만들어져 있었기 때문에
		
		// 메서드에 새로운 내용을 추가하고 싶을 땐 add 사용
		list1.add(new Integer(5));
		list1.add(new Integer(4));
		list1.add(new Integer(0));
		list1.add(new Integer(2));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		// list1에 저장되어 있는 값을 가지고 list2에 대한 값 들고오기
		
		print(list1, list2);	// 출력
		
		
		// 정렬하여 출력하기
		// Collections 클래스의 sort라는 메서드 : 오름차순 정렬 
		Collections.sort(list1);
		Collections.sort(list2);
		
		// Collections.reverse : 출력 값을 뒤집어줌
//		Collections.reverse(list1);
		
		print(list1, list2);	// 출력
		
		// containsAll : list1에 list2의 모든 요소가 포함되어 있는지 확인하는 코드
		// 포함이 되어 있으면 true라고 표시
		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
		
		System.out.println();
		
		// add() : 인덱스가 없으면 값을 제일 뒤에 추가
		//		   인덱스가 있으면 해당 위치에 값을 추가
		
		// list2에 'B'와 'C'라는 문자를 추가
		list2.add("B");
		list2.add("C");
		print(list1, list2);
		
		// list2에 3번째 자리에 A라는 문자 추가 (인덱스는 0번째 부터)
		list2.add(3, "A");
		print(list1, list2);
		
		System.out.println();
		
		// set을 이용하여 결과 값 바꾸기
		list2.set(3, "AA");
		print(list1, list2);
		
		// list1에 0번째 인덱스에 1을 추가
		list1.add(0, "1");
		print(list1, list2);
		
		// indexOf() : 지정된 객체의 위치(=인덱스)를 알려줌
		// list1에 지정된 문자 1의 위치를 알려달라는 코드 =>	"1"
		// list1에 지정된 숫자 1의 위치를 알려달라는 코드 =>	 1
		System.out.println("index = " + list1.indexOf("1"));
		System.out.println("index = " + list1.indexOf(1));
		
		System.out.println();
		
		// remove() : 해당 값이 아닌 '인덱스'의 값을 삭제
		// list1에 해당하는 1번째 인덱스를 삭제
		list1.remove(1);
		// '숫자' 1을 지우고 싶을 땐 remove의 괄호 안에 new라는 키워드와 Integer()를 사용
		// -> 결과값을 확인하면 1이 하나 남는데 이 1은 문자 1이라서 남아있음
		list1.remove(new Integer(1));
		
		print(list1, list2);
		
		System.out.println();
		
		// retainAll() : list1에서 list2와 겹치는 (중복되는) 부분만 남기고 나머지 값을 삭제
		System.out.println(list1.retainAll(list2));
		print(list1, list2);
		
		System.out.println();
		
		// list2에서 list1과 중복되는 부분을 삭제하고 싶다면 ?
		// 1. list2에 있는 내용을 하나씩 꺼내서 확인 -> get 이용
		// 2. 꺼낸 객체가 list1에 있는지 contains()로 확인
		// 3. remove(i)를 이용하여 객체를 list2에서 삭제
		
		// 하나씩 꺼내서 확인하려면 for문 사용
		// ArrayList에서 for문을 이용하여 객체를 삭제 하려면 뒤에서 부터 지워야 한다.
		// 앞에서 부터 지우면 객체를 복사하는 과정에서 인덱스가 당겨지는 것 때문에 건너뛰게 할 수 있기 때문
		for (int i=list2.size()-1; i>=0; i--) { 
			if (list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		
		
		
	}
	
	static void print (ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}

}
