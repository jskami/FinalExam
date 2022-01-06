import java.util.*;
public class ManagePerson {
	//멤버변수 - 배열요소로 만들어봐
	ArrayList<Person> personList;
	//생성자
	public ManagePerson() {
		personList = new ArrayList<Person>();
	}
	
	//메서드
	
	//리스트에 추가(반환할 게 없다는 의미는 곧 void를 사용하라-의 의미)
	public void addPerson(Person person) {
		personList.add(person);
	}
	//리스트에서 삭제(이름을 비교하여 삭제하니까 잘 만들어야 함)
	public boolean removePerson(String personName) {
		for (Person tmp : personList) {
			if (tmp.getPersonName().equals(personName)) // tmp내에 있는 사람 이름들을 get해와라!
				personList.remove(tmp);  //리스트 삭제 성공
				return true; // if문 탈출
		}
		return false;
	}
		
	//리스트의 모든 내용 출력
	public void showAllPerson() {
		for (Person tmp : personList) {
			tmp.dowork();
		}
	}
}
