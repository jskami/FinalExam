
public class Student extends Person { //person클래스를 상속 받아서 쓰자
		public Student(String personName) {  // 여기서 personName을 생성해서
		super(personName); //부모클래스의 생성자를 호출하고 넘긴다.
	}
	public void dowork() {
		System.out.println(getPersonName() + " 는 공부한다."); // 부모클래스에서 상속을 받아온다 하더라도 personName에 프라이빗이 걸려있는 상태라면 이녀석을 불러올 방법은 get, set뿐이다.
	}
}
