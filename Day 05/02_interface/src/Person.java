
public class Person implements IMove{
	public Person(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void moveRight() {
		System.out.println(name+" moves right");
	}

	@Override
	public void moveLeft() {
		System.out.println(name+" moves left");
	}
}
