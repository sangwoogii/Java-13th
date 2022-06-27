package day0610;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		
		// 제네릭 (Generic) : 외부에서 사용자에 의해 타입을 지정할 수 있음
		// ArrayList의 타입을 제한 시킬 수 있는데 제한시키면 형변환을 하지 않아도 된다.
		// 제네릭 사용 방법 : ArrayList <저장할 값 타입> 참조변수명 = new ArrayList<저장할 값 타입>();
		ArrayList<String> list = new ArrayList<String>();
		// String 타입으로 값을 저장할 수 있다는 의미
		
		list.add("JAVA");
		list.add("HTML");
		list.add("JSP");
		list.add(2, "DATABASE"); // list의 2번째 인덱스에 "DATABASE" 값 추가 
		list.add("SPRING");
		
		int size = list.size();
		System.out.println("총 데이터 수 : " + size);
		
		System.out.println();
		
		// 객체의 길이(크기)를 알아내는 방법
		// 문자열의 길이를 알아낼 때 : string.length();
		// 배열의 길이 : array.length
		// ArrayList의 길이 : ArrayList.size();
		// -> String과 ArrayList는 메서드로 사용하기 때문에 괄호가 있고, 배열은 속성이기 때문에 괄호가 없음
		
		
		// 값을 추가 할 때 : add()
		// 값을 찾아서 가져올 때 : get()
		// 값을 삭제할 때 : remove()
		
		String str2 = list.get(2);
		// list의 2번째 인덱스의 값을 가져와 String 타입의 str2의 변수에 값을 저장
		// 제네릭이 String 타입이기 때문에 String 타입으로 값을 저장할 수 있다는 것을 보여줌
		System.out.println("index(2) : " + str2);
		
		System.out.println();
		
		// 저장된 모든 데이터 확인
		for (int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.printf("index(%d) : %s\n", i, s);
		}
		
		System.out.println();
		
		list.remove(2);
		for (int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.printf("index(%d) : %s\n", i, s);
		}
		// remove를 통해 2번 인덱스의 값을 지우게 되면 밑에서부터 복사되어 값이 채워진다.
		
		System.out.println();
		
		list.remove(2);
		for (int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.printf("index(%d) : %s\n", i, s);
		}
		
		System.out.println();
		
		list.remove("SPRING");
		for (int i=0; i<list.size(); i++) {
			String s = list.get(i);
			System.out.printf("index(%d) : %s\n", i, s);
		}
	}

}
