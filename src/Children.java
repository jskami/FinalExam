
public class Children extends Person {
	public Children(String personName) {
		super(personName);
	}
	@Override
	public void dowork() {
		System.out.println(getPersonName() + " 는 뛰고있다.");
	}
}
