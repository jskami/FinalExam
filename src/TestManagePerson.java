
public class TestManagePerson {

	public static void main(String[] args) {
		ManagePerson person = new ManagePerson(); // new 생성자로 객체 생성
		person.addPerson(new Student("디디"));
		person.addPerson(new Employee("라라"));
		person.addPerson(new Children("코코")); // 서로 다른 객체를 처리하기 위해 만들어 보았다. 다형성-
		person.showAllPerson();
		
		System.out.println(person.removePerson("라라"));
		person.showAllPerson();
		

	}

}
