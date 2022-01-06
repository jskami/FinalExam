
public class Person {
	// 멤버변수
	private String personName; //프라이빗을 걸어놓은 멤버변수를 다른 클래스에서 사용하려면 get방식으로 가져올 수 밖에 없다.
	// 생성자
	public Person(String personName) {
		this.personName = personName;
	}
	// 오버로딩된 생성자
	// 메서드
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public void dowork() {
		//System.out.println("사람이 행동한다.");
	}
	// 오버로딩된 메서드
	
	
}

//21.12.31　最後の　かくにん。
//1. Person 클래스 정의
//
//2. Person 클래스를 상속받아서
//	학생 클래스
//	사원 클래스
//	어린이 클래스를 정의한다.
//
//3. 처리클래스를 구현하여 다형성 테스트
//	ArrayList 클래스(제네릭이 구현되어 있다.)
//	학생 3명, 사원 2명, 어린이 2명을 Person 객체로 생성
