
public class Employee extends Person {
	public Employee(String personName) {
		super(personName);
	}
	public void dowork() {
		System.out.println(getPersonName() + " 는 근무한다.");
	}
}
