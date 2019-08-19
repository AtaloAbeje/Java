
public class Car implements IMove{
	public Car(String color) {
		this.color = color;
	}

	private String color;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void moveRight() {
		System.out.println("car "+color+" moves right");
	}

	@Override
	public void moveLeft() {
		System.out.println("car "+color+" moves left");
	}

}
