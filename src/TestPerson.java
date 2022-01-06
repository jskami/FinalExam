import java.util.*;
public class TestPerson {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<Person>(); // ArrayList를 단독으로 쓰겠다는 선언이 필요하니까 1라인에 import구문을 추가해주자
//		Person p1 = new Student("둔둔이"); // 왼쪽은 부모클래스 오른쪽은 자식 클래스 
//		상위 = new 하위 // 제일 바람직한 방법이고 위에서 사용한거야. 객체생성을 하는데 자식 객체를 생성하는 것이고 그러나 본질은 부모 클래스의 객체이다.(...?)
//		하위 = new 하위
//		상위 = new 상위
//		하위 = new 상위(x)
		personList.add(new Student("디디"));
		personList.add(new Student("루루"));
		personList.add(new Student("티티"));
		personList.add(new Employee("모모"));
		personList.add(new Employee("라라"));
		personList.add(new Children("코코"));
		personList.add(new Children("츄츄"));
		
		for (int i = 0; i < personList.size(); i++) {
			Person tmp = personList.get(i);
			tmp.dowork(); // 생성당시의 객체 메서드 처리
		} // 전통적인 for문, 배열 내 위치 제어가 필요하다면 이런 방식
		System.out.println("============");
		
		for (Person tmp : personList) {
			tmp.dowork();
		} // 향상된 for문?, 위치 제어가 필요없다면 이런 방식을 사용하자.
	}
	
	
}
